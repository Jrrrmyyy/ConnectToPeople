/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import dominio.Matchr;
import java.util.List;

/**
 *
 * @author Alumno Mañana
 */
public interface MatchRDao {
    
    public List<Matchr> findAllMatchR();
    
    public Matchr findMatchRByID(Matchr matchr);
    
    
    public void insertar(Matchr matchr);
    
    public void update(Matchr matchr);
    
    public void delete(Matchr matchr);
}
