/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import Dominio.Perfil;
import Dominio.PerfilInterfaz;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Alumno Mañana
 */
public class PerfilDao implements PerfilInterfaz {
        //El EJB se encarga de forma automatica de hacer transacciones.
    
    //Ahora inyectamos la unidad de persistencia a través del API de JPA
    //Simplemente tenemos que usar la anotación e indicar el nombre de nuestra
    //unidad de persistencia
    @PersistenceContext(unitName="CTPJim")
    EntityManager em;
    
    //Con este objeto de em ya podemos interactuar con nuestra BBDD
    
    @Override
    public List<Perfil> findAllPerfiles() {
        return em.createNamedQuery("Perfil.findAll").getResultList();
    }

    @Override
    public Perfil findPerfilByNombre(Perfil perfil) {
        return em.find(Perfil.class, perfil.getNombre());
    }

    @Override
    public Perfil findPerfilByGenero(Perfil perfil) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Perfil findPerfilByDireccion(Perfil perfil) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Perfil findPerfilByFNacimiento(Perfil perfil) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertar(Perfil perfil) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deletePerfil(Perfil perfil) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
