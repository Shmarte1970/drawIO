/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persisten;

import Persisten.exceptions.NonexistentEntityException;
import Persisten.exceptions.RollbackFailureException;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import logica.Turno;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.transaction.UserTransaction;
import logica.Paciente;

/**
 *
 * @author Pedro Ríos
 */
public class PacienteJpaController implements Serializable {

    public PacienteJpaController(UserTransaction utx, EntityManagerFactory emf) {
        this.utx = utx;
        this.emf = emf;
    }
    private UserTransaction utx = null;
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    
        public PacienteJpaController(){
        emf=Persistence.createEntityManagerFactory("odontologico_PU");
    }

    public void create(Paciente paciente) throws RollbackFailureException, Exception {
        if (paciente.getListaTurno() == null) {
            paciente.setListaTurno(new ArrayList<Turno>());
        }
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            List<Turno> attachedListaTurno = new ArrayList<Turno>();
            for (Turno listaTurnoTurnoToAttach : paciente.getListaTurno()) {
                listaTurnoTurnoToAttach = em.getReference(listaTurnoTurnoToAttach.getClass(), listaTurnoTurnoToAttach.getIdTurno());
                attachedListaTurno.add(listaTurnoTurnoToAttach);
            }
            paciente.setListaTurno(attachedListaTurno);
            em.persist(paciente);
            for (Turno listaTurnoTurno : paciente.getListaTurno()) {
                Paciente oldPacientOfListaTurnoTurno = listaTurnoTurno.getPacient();
                listaTurnoTurno.setPacient(paciente);
                listaTurnoTurno = em.merge(listaTurnoTurno);
                if (oldPacientOfListaTurnoTurno != null) {
                    oldPacientOfListaTurnoTurno.getListaTurno().remove(listaTurnoTurno);
                    oldPacientOfListaTurnoTurno = em.merge(oldPacientOfListaTurnoTurno);
                }
            }
            utx.commit();
        } catch (Exception ex) {
            try {
                utx.rollback();
            } catch (Exception re) {
                throw new RollbackFailureException("An error occurred attempting to roll back the transaction.", re);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Paciente paciente) throws NonexistentEntityException, RollbackFailureException, Exception {
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            Paciente persistentPaciente = em.find(Paciente.class, paciente.getId());
            List<Turno> listaTurnoOld = persistentPaciente.getListaTurno();
            List<Turno> listaTurnoNew = paciente.getListaTurno();
            List<Turno> attachedListaTurnoNew = new ArrayList<Turno>();
            for (Turno listaTurnoNewTurnoToAttach : listaTurnoNew) {
                listaTurnoNewTurnoToAttach = em.getReference(listaTurnoNewTurnoToAttach.getClass(), listaTurnoNewTurnoToAttach.getIdTurno());
                attachedListaTurnoNew.add(listaTurnoNewTurnoToAttach);
            }
            listaTurnoNew = attachedListaTurnoNew;
            paciente.setListaTurno(listaTurnoNew);
            paciente = em.merge(paciente);
            for (Turno listaTurnoOldTurno : listaTurnoOld) {
                if (!listaTurnoNew.contains(listaTurnoOldTurno)) {
                    listaTurnoOldTurno.setPacient(null);
                    listaTurnoOldTurno = em.merge(listaTurnoOldTurno);
                }
            }
            for (Turno listaTurnoNewTurno : listaTurnoNew) {
                if (!listaTurnoOld.contains(listaTurnoNewTurno)) {
                    Paciente oldPacientOfListaTurnoNewTurno = listaTurnoNewTurno.getPacient();
                    listaTurnoNewTurno.setPacient(paciente);
                    listaTurnoNewTurno = em.merge(listaTurnoNewTurno);
                    if (oldPacientOfListaTurnoNewTurno != null && !oldPacientOfListaTurnoNewTurno.equals(paciente)) {
                        oldPacientOfListaTurnoNewTurno.getListaTurno().remove(listaTurnoNewTurno);
                        oldPacientOfListaTurnoNewTurno = em.merge(oldPacientOfListaTurnoNewTurno);
                    }
                }
            }
            utx.commit();
        } catch (Exception ex) {
            try {
                utx.rollback();
            } catch (Exception re) {
                throw new RollbackFailureException("An error occurred attempting to roll back the transaction.", re);
            }
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = paciente.getId();
                if (findPaciente(id) == null) {
                    throw new NonexistentEntityException("The paciente with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException, RollbackFailureException, Exception {
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            Paciente paciente;
            try {
                paciente = em.getReference(Paciente.class, id);
                paciente.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The paciente with id " + id + " no longer exists.", enfe);
            }
            List<Turno> listaTurno = paciente.getListaTurno();
            for (Turno listaTurnoTurno : listaTurno) {
                listaTurnoTurno.setPacient(null);
                listaTurnoTurno = em.merge(listaTurnoTurno);
            }
            em.remove(paciente);
            utx.commit();
        } catch (Exception ex) {
            try {
                utx.rollback();
            } catch (Exception re) {
                throw new RollbackFailureException("An error occurred attempting to roll back the transaction.", re);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Paciente> findPacienteEntities() {
        return findPacienteEntities(true, -1, -1);
    }

    public List<Paciente> findPacienteEntities(int maxResults, int firstResult) {
        return findPacienteEntities(false, maxResults, firstResult);
    }

    private List<Paciente> findPacienteEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Paciente.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Paciente findPaciente(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Paciente.class, id);
        } finally {
            em.close();
        }
    }

    public int getPacienteCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Paciente> rt = cq.from(Paciente.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
