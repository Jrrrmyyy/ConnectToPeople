/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import dominio.Usuario;
import java.util.List;

/**
 *
 * @author Alumno Mañana
 */
public interface UsuarioService {
    
    public List<Usuario> listarUsuarios();
    
    public Usuario encontrarUsuarioPorID(Usuario usuario);
    
    public Usuario encontrarUsuarioPorCorreo(Usuario usuario);
    
    public void registrarUsuario(Usuario usuario);
    
    public void modificarUsuario(Usuario usuario);
    
    public void eliminarUsuario(Usuario usuario);
    
    public boolean comprobar(Usuario usuario);
    
    public List<Usuario> buscarUsuario(Usuario usuario);
    
    public String cifrarMD5(String input) throws Exception;
    
}
