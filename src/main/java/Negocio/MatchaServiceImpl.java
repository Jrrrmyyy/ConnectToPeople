/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import datos.MatchaDao;
import dominio.Matcha;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author Alumno Mañana
 */
public class MatchaServiceImpl implements MatchaService {
    
    @Inject
    private MatchaDao matchaDao;

    @Override
    public List<Matcha> findAllMatcha() {
        return matchaDao.findAllMatchA();
    }

    @Override
    public Matcha findMatchaById(Matcha matcha) {
        return matchaDao.findMatchAByID(matcha);
    }

    @Override
    public void insertar(Matcha matcha) {
        matchaDao.insertar(matcha);
    }

    @Override
    public void updateMatcha(Matcha matcha) {
        matchaDao.update(matcha);
    }

    @Override
    public void deleteMatcha(Matcha matcha) {
        matchaDao.delete(matcha);
    }
    
}
