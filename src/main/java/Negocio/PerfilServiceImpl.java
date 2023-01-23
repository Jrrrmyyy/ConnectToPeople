/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Dominio.Perfil;
import datos.PerfilDao;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author Alumno Mañana
 */
@Stateless
public class PerfilServiceImpl implements PerfilService {
    
       @Inject    
    private PerfilDao perfilDao;

    @Override
    public List<Perfil> listarPerfiles() {
        return perfilDao.findAllPerfiles();
    }

    @Override
    public Perfil encontrarPerfilPorNombre(Perfil perfil) {
        return perfilDao.findPerfilByNombre(perfil);
    }

    @Override
    public Perfil encontrarPerfilPorGenero(Perfil perfil) {
        return perfilDao.findPerfilByGenero(perfil);
    }

    @Override
    public Perfil encontrarAmigosPorDireccion(Perfil perfil) {
        return perfilDao.findPerfilByDireccion(perfil);
    }

    @Override
    public Perfil encontrarPerfilPorFNacimiento(Perfil perfil) {
        return perfilDao.findPerfilByFNacimiento(perfil);
    }

    @Override
    public void registrarUsuario(Perfil perfil) {
        perfilDao.insertar(perfil);
    }

    @Override
    public void eliminarUsuario(Perfil perfil) {
        perfilDao.deletePerfil(perfil);
    }
    
}
