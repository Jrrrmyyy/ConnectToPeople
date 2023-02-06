/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import dominio.Message;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Alumno Mañana
 */
public class MessageDaoImpl implements MessageDao {

    @PersistenceContext(unitName="CTPJim")
    EntityManager em;
    // Con esto interactuamos con nuestra BBDD
    
    
    @Override
    public List<Message> findAllMensajes() {
        return em.createNamedQuery("Message.findAll").getResultList();
    }

    @Override
    public Message findMessagesById(Message message) {
        return em.find(Message.class, message.getIdmessage());
    }

    @Override
    public Message findMessagesByFecha(Message message) {
        Query query = em.createQuery("Message.findByFecha");
        query.setParameter("fecha", message.getFecha());
        return (Message) query.getSingleResult();
   }

    @Override
    public void delete(Message message) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Message findMessageByUsuario(Message message) {
        return em.find(Message.class, message.getUsuarioIdusuario());
    }
    
}
