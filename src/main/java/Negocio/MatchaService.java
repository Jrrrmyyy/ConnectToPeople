/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import dominio.Matcha;
import java.util.List;

/**
 *
 * @author Alumno Mañana
 */
public interface MatchaService {
    
    public List<Matcha> findAllMatcha();
    public Matcha findMatchaById(Matcha matcha);
    public void insertar(Matcha matcha);
    public void updateMatcha(Matcha matcha);
    public void deleteMatcha(Matcha matcha);
}
