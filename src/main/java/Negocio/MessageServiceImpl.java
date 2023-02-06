/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import datos.MessageDao;
import dominio.Message;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author Alumno Mañana
 */
public class MessageServiceImpl implements MessageService{

    @Inject
    private MessageDao messageDao;
    
    
    @Override
    public List<Message> listarMensajes() {
        return messageDao.findAllMensajes();
    }

    @Override
    public Message encontrarMensajesPorID(Message message) {
        return messageDao.findMessagesById(message);
    }

    @Override
    public Message encontrarMensajesPorUsuario(Message message) {
        return messageDao.findMessageByUsuario(message);
    }

    @Override
    public Message encontrarMensajesPorFecha(Message message) {
       return messageDao.findMessagesByFecha(message);
    }

    @Override
    public void delete(Message message) {
        messageDao.delete(message);
    }
    
}
