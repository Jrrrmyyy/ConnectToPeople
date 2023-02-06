/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.List;
import dominio.Message;
/**
 *
 * @author Alumno Mañana
 */
public interface MessageDao {
    
    public List<Message> findAllMensajes();
    
    public Message findMessagesById(Message message);
    
    public Message findMessageByUsuario(Message message);
    
    public Message findMessagesByFecha(Message message);
    
    public void delete (Message message);
}
