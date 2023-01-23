/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;


import Dominio.Amigos;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Alumno Mañana
 */
@Local
public interface AmigosService {
    
    public List<Amigos> listarAmigos();
   public Amigos encontrarAmigosPorMejoresAmigos(Amigos amigos);
   public Amigos encontrarAmigosPorUsuario(Amigos amigos);
   public void registrarUsuario(Amigos amigos);
   public void modificarUsuario(Amigos amigos);
   public void eliminarUsuario(Amigos amigos);
}
