/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;


import Dominio.Perfil;
import java.util.List;

/**
 *
 * @author Alumno Mañana
 */
public interface PerfilInterfaz {
    public List<Perfil> findAllPerfiles();
    public Perfil findPerfilByNombre(Perfil perfil);
    public Perfil findPerfilByGenero(Perfil perfil);
    public Perfil findPerfilByDireccion(Perfil perfil);
    public Perfil findPerfilByFNacimiento(Perfil perfil);
    public void insertar(Perfil perfil);
    public void deletePerfil(Perfil perfil);
}
