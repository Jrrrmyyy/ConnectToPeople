/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Dominio.Usuario;
import datos.UsuarioDao;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author Alumno Mañana
 */
@Stateless
public class UsuarioServiceImpl implements UsuarioService {
    
     // Gracias a que estamos en un entorno EE podemos usar CDI para inyectar usuarioDao
    @Inject    
    private UsuarioDao usuarioDao;
    
    // Ahora nos apoyamos de la interfaz para completar los servicios
    
    @Override
    public List<Usuario> listarUsuarios() {       
        return usuarioDao.findAllUser();
    }

    @Override
    public Usuario encontrarUsuarioPorID(Usuario usuario) {
        return usuarioDao.findUserById(usuario);
    }

    @Override
    public Usuario econtrarUsuarioPorCorreo(Usuario usuario) {
        return usuarioDao.findUserByEmail(usuario);
    }

    @Override
    public void registrarUsuario(Usuario usuario) {
        usuarioDao.insertar(usuario);
    }

    @Override
    public void modificarUsuario(Usuario usuario) {
        usuarioDao.updateUsuario(usuario);
    }

    @Override
    public void eliminarUsuario(Usuario usuario) {
        usuarioDao.deleteUsuario(usuario);
    }
}
