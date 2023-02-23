/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import datos.MatchRDao;
import dominio.Matchr;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Alumno Mañana
 */
public class MatchRServiceImpl implements MatchRService {

   
    @Inject
    private MatchRDao matchrDao;
    
    @Override
    public List<Matchr> listarMatchr() {
        return matchrDao.findAllMatchR();
    }

    @Override
    public Matchr encontrarMatchRPorID(Matchr matchr) {
        return matchrDao.findMatchRByID(matchr);
    }


    @Override
    public void insertar(Matchr matchr) {
        matchrDao.insertar(matchr);
    }

    @Override
    public void update(Matchr matchr) {
        matchrDao.update(matchr);
    }

    @Override
    public void delete(Matchr matchr) {
        matchrDao.delete(matchr);
    }

    

}
