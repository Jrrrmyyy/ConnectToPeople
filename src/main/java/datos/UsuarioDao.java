/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import Dominio.Usuario;
import Dominio.UsuarioInterfaz;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Alumno Mañana
 */
public class UsuarioDao implements UsuarioInterfaz {
        //El EJB se encarga de forma automatica de hacer transacciones.
    
    //Ahora inyectamos la unidad de persistencia a través del API de JPA
    //Simplemente tenemos que usar la anotación e indicar el nombre de nuestra
    //unidad de persistencia
    @PersistenceContext(unitName="CTPJim")
    EntityManager em;
    
    //Con este objeto de em ya podemos interactuar con nuestra BBDD

    @Override
    public List<Usuario> findAllUser() {
        return em.createNamedQuery("User.findAll").getResultList();
    }

    @Override
    public Usuario findUserById(Usuario usuario) {
        return em.find(Usuario.class, usuario.getIdUsuario());
    }

    @Override
    public Usuario findUserByEmail(Usuario usuario) {
        //En este caso no vamos a usar un NamedQuery, que podriamos haber
        //agregado en la ENitdad de Persona si no que vamos a incluirlo direct
        Query query=em.createQuery("from Usuario u where u.email=:email");
        query.setParameter("email",usuario.getCorreo());
        //Y ahora solo esperamos un resultado, porque el email debe de ser unico
        //sino lo hemos definido asi lo modificamos en nuestra tabla como unique
        return(Usuario) query.getSingleResult();
    }

    @Override
    public void insertar(Usuario usuario) {
        em.persist(usuario);
    }

    @Override
    public void updateUsuario(Usuario usuario) {
        em.merge(usuario);
    }

    @Override
    public void deleteUsuario(Usuario usuario) {
        em.remove(em.merge(usuario));
    }
    
}
