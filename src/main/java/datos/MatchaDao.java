/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import dominio.Matcha;
import java.util.List;

/**
 *
 * @author Alumno Mañana
 */
public interface MatchaDao {
    
    public List<Matcha> findAllMatchA();
    
    public Matcha findMatchAByID(Matcha matcha);
    
    public void insertar(Matcha matcha);
    
    public void update(Matcha matcha);
    
    public void delete(Matcha matcha);
    
}
