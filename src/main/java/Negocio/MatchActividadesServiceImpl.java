/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import datos.MatchActividadesDao;
import dominio.Matchactividades;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author Alumno Mañana
 */
public class MatchActividadesServiceImpl implements MatchActividadesService {

    @Inject
    private MatchActividadesDao matchactvdao;
    
    
    @Override
    public List<Matchactividades> listarMatchActividades() {
        return matchactvdao.findAllActividades();
    }

    @Override
    public Matchactividades encontrarMatchActvPorId(Matchactividades matchactividades) {
        return matchactvdao.findActividadesByID(matchactividades);
    }

    @Override
    public Matchactividades encontrarMatchActvPorFecha(Matchactividades matchactividades) {
        return matchactvdao.findACtividadesByFecha(matchactividades);
    }

    @Override
    public void insertar(Matchactividades matchactividades) {
        matchactvdao.insertar(matchactividades);
    }

    @Override
    public void update(Matchactividades matchactividades) {
        matchactvdao.update(matchactividades);
    }

    @Override
    public void delete(Matchactividades matchactividades) {
        matchactvdao.delete(matchactividades);
    }
    
}
