package cz.muni.fi.pv243.automoto.service;

import cz.muni.fi.pv243.automoto.model.Privilege;

import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

/**
 * @author Andrej Kuročenko <andrej@kurochenko.net>
 */
@Named
@Stateless
public class PrivilegeServiceImpl implements PrivilegeService {

//    @Inject
    private EntityManager em;


    public void create(Privilege privilege) {
        if (privilege == null) {
            throw new IllegalArgumentException("Privilege is null");
        }

        em.persist(privilege);
    }

    @Override
    public void update(Privilege privilege) {
        if (privilege == null) {
            throw new IllegalArgumentException("Privilege is null");
        }

        em.merge(privilege);
    }

    @Override
    public void delete(Privilege privilege) {
        if (privilege == null) {
            throw new IllegalArgumentException("Privilege is null");
        }

        em.remove(privilege);
    }

    @Override
    public Privilege find(Long id) {
        if (id == null) {
            throw new IllegalArgumentException("ID is null");
        }

        return em.find(Privilege.class, id);
    }

    @Override
    public List<Privilege> findAll() {
        Query q = em.createQuery("SELECT p FROM Privilege p");
        return q.getResultList();
    }
}
