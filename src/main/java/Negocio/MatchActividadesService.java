/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import dominio.Matchactividades;
import java.util.List;

/**
 *
 * @author Alumno Mañana
 */
public interface MatchActividadesService {
    
    public List<Matchactividades> listarMatchActividades();
    
    public Matchactividades encontrarMatchActvPorId(Matchactividades matchactividades);
    
    public Matchactividades encontrarMatchActvPorFecha(Matchactividades matchactividades);
    
    public void insertar(Matchactividades matchactividades);
    
    public void update (Matchactividades matchactividades);
    
    public void delete (Matchactividades matchactividades);
}
