/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;


import Dominio.Amigos;
import java.util.List;

/**
 *
 * @author Alumno Mañana
 */
public interface AmigosInterfaz {
    public List<Amigos> findAllAmigos();
    public Amigos findAmigosByMejoresAmigos(Amigos amigos);
    public Amigos findAmigosByUsuario(Amigos amigos);
    public void insertar(Amigos amigos);
    public void updateAmigos(Amigos amigos);
    public void deleteAmigos(Amigos amigos);
    
}
