/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Dominio.Usuario;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Alumno Mañana
 */
@Local
public interface UsuarioService {
       
    public List<Usuario> listarUsuarios();
    
    public Usuario encontrarUsuarioPorID(Usuario usuario);
    
    public Usuario econtrarUsuarioPorCorreo(Usuario usuario);
    
    public void registrarUsuario(Usuario usuario);
    
    public void modificarUsuario(Usuario usuario);
    
    public void eliminarUsuario(Usuario usuario);
}
