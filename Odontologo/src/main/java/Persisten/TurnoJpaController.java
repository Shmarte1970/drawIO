/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persisten;

import Persisten.exceptions.NonexistentEntityException;
import Persisten.exceptions.RollbackFailureException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.UserTransaction;
import logica.Odontologo;
import logica.Paciente;
import logica.Turno;

/**
 *
 * @author Pedro Ríos
 */
public class TurnoJpaController implements Serializable {

    public TurnoJpaController(UserTransaction utx, EntityManagerFactory emf) {
        this.utx = utx;
        this.emf = emf;
    }
    private UserTransaction utx = null;
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    
        public TurnoJpaController(){
        emf=Persistence.createEntityManagerFactory("odontologico_PU");
    }

    public void create(Turno turno) throws RollbackFailureException, Exception {
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            Odontologo odont = turno.getOdont();
            if (odont != null) {
                odont = em.getReference(odont.getClass(), odont.getId());
                turno.setOdont(odont);
            }
            Paciente pacient = turno.getPacient();
            if (pacient != null) {
                pacient = em.getReference(pacient.getClass(), pacient.getId());
                turno.setPacient(pacient);
            }
            em.persist(turno);
            if (odont != null) {
                odont.getUnaListadeTurnos().add(turno);
                odont = em.merge(odont);
            }
            if (pacient != null) {
                pacient.getListaTurno().add(turno);
                pacient = em.merge(pacient);
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

    public void edit(Turno turno) throws NonexistentEntityException, RollbackFailureException, Exception {
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            Turno persistentTurno = em.find(Turno.class, turno.getIdTurno());
            Odontologo odontOld = persistentTurno.getOdont();
            Odontologo odontNew = turno.getOdont();
            Paciente pacientOld = persistentTurno.getPacient();
            Paciente pacientNew = turno.getPacient();
            if (odontNew != null) {
                odontNew = em.getReference(odontNew.getClass(), odontNew.getId());
                turno.setOdont(odontNew);
            }
            if (pacientNew != null) {
                pacientNew = em.getReference(pacientNew.getClass(), pacientNew.getId());
                turno.setPacient(pacientNew);
            }
            turno = em.merge(turno);
            if (odontOld != null && !odontOld.equals(odontNew)) {
                odontOld.getUnaListadeTurnos().remove(turno);
                odontOld = em.merge(odontOld);
            }
            if (odontNew != null && !odontNew.equals(odontOld)) {
                odontNew.getUnaListadeTurnos().add(turno);
                odontNew = em.merge(odontNew);
            }
            if (pacientOld != null && !pacientOld.equals(pacientNew)) {
                pacientOld.getListaTurno().remove(turno);
                pacientOld = em.merge(pacientOld);
            }
            if (pacientNew != null && !pacientNew.equals(pacientOld)) {
                pacientNew.getListaTurno().add(turno);
                pacientNew = em.merge(pacientNew);
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
                Integer id = turno.getIdTurno();
                if (findTurno(id) == null) {
                    throw new NonexistentEntityException("The turno with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException, RollbackFailureException, Exception {
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            Turno turno;
            try {
                turno = em.getReference(Turno.class, id);
                turno.getIdTurno();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The turno with id " + id + " no longer exists.", enfe);
            }
            Odontologo odont = turno.getOdont();
            if (odont != null) {
                odont.getUnaListadeTurnos().remove(turno);
                odont = em.merge(odont);
            }
            Paciente pacient = turno.getPacient();
            if (pacient != null) {
                pacient.getListaTurno().remove(turno);
                pacient = em.merge(pacient);
            }
            em.remove(turno);
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

    public List<Turno> findTurnoEntities() {
        return findTurnoEntities(true, -1, -1);
    }

    public List<Turno> findTurnoEntities(int maxResults, int firstResult) {
        return findTurnoEntities(false, maxResults, firstResult);
    }

    private List<Turno> findTurnoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Turno.class));
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

    public Turno findTurno(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Turno.class, id);
        } finally {
            em.close();
        }
    }

    public int getTurnoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Turno> rt = cq.from(Turno.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
