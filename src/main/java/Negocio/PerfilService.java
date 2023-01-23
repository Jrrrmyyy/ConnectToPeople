/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Dominio.Perfil;
import java.util.List;

/**
 *
 * @author Alumno Mañana
 */
public interface PerfilService {
    
   public List<Perfil> listarPerfiles();
   public Perfil encontrarPerfilPorNombre(Perfil perfil);
   public Perfil encontrarPerfilPorGenero(Perfil perfil);
   public Perfil encontrarAmigosPorDireccion(Perfil perfil);
   public Perfil encontrarPerfilPorFNacimiento(Perfil perfil);
   public void registrarUsuario(Perfil perfil);
   public void eliminarUsuario(Perfil perfil);
    
}
