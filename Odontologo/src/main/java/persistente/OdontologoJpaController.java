/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistente;

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
import javax.transaction.UserTransaction;
import logica.Odontologo;
import persistente.exceptions.NonexistentEntityException;
import persistente.exceptions.RollbackFailureException;

/**
 *
 * @author Pedro Ríos
 */
public class OdontologoJpaController implements Serializable {

    public OdontologoJpaController(UserTransaction utx, EntityManagerFactory emf) {
        this.utx = utx;
        this.emf = emf;
    }
    private UserTransaction utx = null;
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Odontologo odontologo) throws RollbackFailureException, Exception {
        if (odontologo.getUnaListadeTurnos() == null) {
            odontologo.setUnaListadeTurnos(new ArrayList<Turno>());
        }
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            List<Turno> attachedUnaListadeTurnos = new ArrayList<Turno>();
            for (Turno unaListadeTurnosTurnoToAttach : odontologo.getUnaListadeTurnos()) {
                unaListadeTurnosTurnoToAttach = em.getReference(unaListadeTurnosTurnoToAttach.getClass(), unaListadeTurnosTurnoToAttach.getFechaTurno());
                attachedUnaListadeTurnos.add(unaListadeTurnosTurnoToAttach);
            }
            odontologo.setUnaListadeTurnos(attachedUnaListadeTurnos);
            em.persist(odontologo);
            for (Turno unaListadeTurnosTurno : odontologo.getUnaListadeTurnos()) {
                Odontologo oldOdontOfUnaListadeTurnosTurno = unaListadeTurnosTurno.getOdont();
                unaListadeTurnosTurno.setOdont(odontologo);
                unaListadeTurnosTurno = em.merge(unaListadeTurnosTurno);
                if (oldOdontOfUnaListadeTurnosTurno != null) {
                    oldOdontOfUnaListadeTurnosTurno.getUnaListadeTurnos().remove(unaListadeTurnosTurno);
                    oldOdontOfUnaListadeTurnosTurno = em.merge(oldOdontOfUnaListadeTurnosTurno);
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

    public void edit(Odontologo odontologo) throws NonexistentEntityException, RollbackFailureException, Exception {
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            Odontologo persistentOdontologo = em.find(Odontologo.class, odontologo.getId());
            List<Turno> unaListadeTurnosOld = persistentOdontologo.getUnaListadeTurnos();
            List<Turno> unaListadeTurnosNew = odontologo.getUnaListadeTurnos();
            List<Turno> attachedUnaListadeTurnosNew = new ArrayList<Turno>();
            for (Turno unaListadeTurnosNewTurnoToAttach : unaListadeTurnosNew) {
                unaListadeTurnosNewTurnoToAttach = em.getReference(unaListadeTurnosNewTurnoToAttach.getClass(), unaListadeTurnosNewTurnoToAttach.getFechaTurno());
                attachedUnaListadeTurnosNew.add(unaListadeTurnosNewTurnoToAttach);
            }
            unaListadeTurnosNew = attachedUnaListadeTurnosNew;
            odontologo.setUnaListadeTurnos(unaListadeTurnosNew);
            odontologo = em.merge(odontologo);
            for (Turno unaListadeTurnosOldTurno : unaListadeTurnosOld) {
                if (!unaListadeTurnosNew.contains(unaListadeTurnosOldTurno)) {
                    unaListadeTurnosOldTurno.setOdont(null);
                    unaListadeTurnosOldTurno = em.merge(unaListadeTurnosOldTurno);
                }
            }
            for (Turno unaListadeTurnosNewTurno : unaListadeTurnosNew) {
                if (!unaListadeTurnosOld.contains(unaListadeTurnosNewTurno)) {
                    Odontologo oldOdontOfUnaListadeTurnosNewTurno = unaListadeTurnosNewTurno.getOdont();
                    unaListadeTurnosNewTurno.setOdont(odontologo);
                    unaListadeTurnosNewTurno = em.merge(unaListadeTurnosNewTurno);
                    if (oldOdontOfUnaListadeTurnosNewTurno != null && !oldOdontOfUnaListadeTurnosNewTurno.equals(odontologo)) {
                        oldOdontOfUnaListadeTurnosNewTurno.getUnaListadeTurnos().remove(unaListadeTurnosNewTurno);
                        oldOdontOfUnaListadeTurnosNewTurno = em.merge(oldOdontOfUnaListadeTurnosNewTurno);
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
                int id = odontologo.getId();
                if (findOdontologo(id) == null) {
                    throw new NonexistentEntityException("The odontologo with id " + id + " no longer exists.");
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
            Odontologo odontologo;
            try {
                odontologo = em.getReference(Odontologo.class, id);
                odontologo.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The odontologo with id " + id + " no longer exists.", enfe);
            }
            List<Turno> unaListadeTurnos = odontologo.getUnaListadeTurnos();
            for (Turno unaListadeTurnosTurno : unaListadeTurnos) {
                unaListadeTurnosTurno.setOdont(null);
                unaListadeTurnosTurno = em.merge(unaListadeTurnosTurno);
            }
            em.remove(odontologo);
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

    public List<Odontologo> findOdontologoEntities() {
        return findOdontologoEntities(true, -1, -1);
    }

    public List<Odontologo> findOdontologoEntities(int maxResults, int firstResult) {
        return findOdontologoEntities(false, maxResults, firstResult);
    }

    private List<Odontologo> findOdontologoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Odontologo.class));
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

    public Odontologo findOdontologo(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Odontologo.class, id);
        } finally {
            em.close();
        }
    }

    public int getOdontologoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Odontologo> rt = cq.from(Odontologo.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
