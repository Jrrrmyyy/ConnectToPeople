/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import Dominio.Amigos;
import Dominio.AmigosInterfaz;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Alumno Mañana
 */
public class AmigosDao implements AmigosInterfaz {
    //El EJB se encarga de forma automatica de hacer transacciones.
    
    //Ahora inyectamos la unidad de persistencia a través del API de JPA
    //Simplemente tenemos que usar la anotación e indicar el nombre de nuestra
    //unidad de persistencia
    @PersistenceContext(unitName="CTPJim")
    EntityManager em;
    
    //Con este objeto de em ya podemos interactuar con nuestra BBDD

    @Override
    public List<Amigos> findAllAmigos() {
      //Creamos un NamedQuery, y el listado lo leemos con getResultList
      //Por lo que estamos escribiendo menos código
      return em.createNamedQuery("Amigos.findAll").getResultList();
    }

    @Override
    public Amigos findAmigosByMejoresAmigos(Amigos amigos) {
        //especificamnos la clase que queremos buscar y luego el campo por el
        //que queremos buscar
        return em.find(Amigos.class, amigos.getAmigosBloqueados());
    }

    @Override
    public Amigos findAmigosByUsuario(Amigos amigos) {
      //Revisar. No es correcta, buscar la buena.
        return em.find(Amigos.class, amigos.getUsuario());
    }

    public void insertAmigos(Amigos amigos) {
       em.persist(amigos);
    }

    @Override
    public void updateAmigos(Amigos amigos) {
        //Sincroniza cualquier modificacion que hayamos hecho de la persona en la BBDD
        em.merge(amigos);
    }

    @Override
    public void deleteAmigos(Amigos amigos) {
        //1.Acualizamos el estado del objeto en la BBDD -> Borrado
        em.remove(em.merge(amigos));
    }

    @Override
    public void insertar(Amigos amigos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    
}
