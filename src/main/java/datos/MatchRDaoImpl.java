/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import dominio.Matchr;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Alumno Mañana
 */
public class MatchRDaoImpl implements MatchRDao {

    @PersistenceContext(unitName="CTPJim")
    EntityManager em;
    
    
    
    @Override
    public List<Matchr> findAllMatchR() {
        return em.createNamedQuery("Matchr.findAll").getResultList();
    }

    @Override
    public Matchr findMatchRByID(Matchr matchr) {
        return em.find(Matchr.class, matchr.getIdmatchR());
    }

    @Override
    public void insertar(Matchr matchr) {
        em.persist(matchr);
    }

    @Override
    public void update(Matchr matchr) {
        em.merge(matchr);
    }

    @Override
    public void delete(Matchr matchr) {
        em.remove(em.merge(matchr));
    }

 
    
}
