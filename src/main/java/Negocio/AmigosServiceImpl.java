/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Dominio.Amigos;
import datos.AmigosDao;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author Alumno Mañana
 */
@Stateless
public class AmigosServiceImpl implements AmigosService {
    
       // Gracias a que estamos en un entorno EE podemos usar CDI para inyectar usuarioDao
    @Inject    
    private AmigosDao amigosDao;
    
    // Ahora nos apoyamos de la interfaz para completar los servicios
    
   @Override
    public List<Amigos> listarAmigos() {       
        return amigosDao.findAllAmigos();
    }

    @Override
    public Amigos encontrarAmigosPorMejoresAmigos(Amigos amigos) {
        return amigosDao.findAmigosByMejoresAmigos(amigos);
    }

    @Override
    public Amigos encontrarAmigosPorUsuario(Amigos amigos) {
        return amigosDao.findAmigosByUsuario(amigos);
    }

    @Override
    public void registrarUsuario(Amigos amigos) {
        amigosDao.insertAmigos(amigos);
    }

    @Override
    public void modificarUsuario(Amigos amigos) {
        amigosDao.updateAmigos(amigos);
    }

    @Override
    public void eliminarUsuario(Amigos amigos) {
        amigosDao.deleteAmigos(amigos);
    }
    
}
