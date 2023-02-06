/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import dominio.Matcha;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.*;

/**
 *
 * @author Alumno Mañana
 */
@Stateless
public class MatchaDaoImpl implements MatchaDao {

    @PersistenceContext(unitName="CTPJim")
    EntityManager em;
    
    
    
    @Override
    public List<Matcha> findAllMatchA() {
        return em.createNamedQuery("Matcha.findAll").getResultList();
    }

    @Override
    public Matcha findMatchAByID(Matcha matcha) {
        return em.find(Matcha.class, matcha.getIdmatchA());
    }

    @Override
    public void insertar(Matcha matcha) {
        em.persist(matcha);
    }

    @Override
    public void upadte(Matcha matcha) {
        em.merge(matcha);
    }

    @Override
    public void delete(Matcha matcha) {
        em.remove(em.merge(matcha));
    }
    
}
