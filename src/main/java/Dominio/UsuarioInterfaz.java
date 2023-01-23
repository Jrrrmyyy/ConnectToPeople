/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;


import Dominio.Usuario;
import java.util.List;

/**
 *
 * @author Alumno Mañana
 */
public interface UsuarioInterfaz {
    
   public List<Usuario> findAllUser();
   public Usuario findUserById(Usuario usuario);
   public Usuario findUserByEmail(Usuario usuario);
   public void insertar(Usuario usuario);
   public void updateUsuario(Usuario usuario);
   public void deleteUsuario(Usuario usuario);
}
