/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import dominio.Message;
import java.util.List;

/**
 *
 * @author Alumno Mañana
 */
public interface MessageService {
    
    public List<Message> listarMensajes();
    
    public Message encontrarMensajesPorID(Message message);
    
    public Message encontrarMensajesPorUsuario(Message message);
    
    public Message encontrarMensajesPorFecha(Message message);
    
    public void delete (Message message);
    
}
