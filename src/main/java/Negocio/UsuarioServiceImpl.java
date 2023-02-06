/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import datos.UsuarioDao;
import dominio.Usuario;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author Alumno Mañana
 */
@Stateless
public class UsuarioServiceImpl implements UsuarioService{

    
    @Inject
    private UsuarioDao usuarioDao;
    
    
    @Override
    public List<Usuario> listarUsuarios() {
        return usuarioDao.findAllPersonas();
        }

    @Override
    public Usuario encontrarUsuarioPorID(Usuario usuario) {
        return usuarioDao.findPersonaByID(usuario);
    }

    @Override
    public Usuario encontrarUsuarioPorCorreo(Usuario usuario) {
        return usuarioDao.findPersonaByEmail(usuario);
    }

    @Override
    public void registrarUsuario(Usuario usuario) {
        usuarioDao.insertar(usuario);
    }

    @Override
    public void modificarUsuario(Usuario usuario) {
        usuarioDao.update(usuario);
    }

    @Override
    public void eliminarUsuario(Usuario usuario) {
        usuarioDao.delete(usuario);
    }
    
}
