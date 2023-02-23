/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import datos.UsuarioDao;
import dominio.Usuario;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author Alumno Mañana
 */
@Stateless
public class UsuarioServiceImpl implements UsuarioService{

    
    @Inject
    private UsuarioDao usuarioDao;
    
    
    @Override
    public List<Usuario> listarUsuarios() {
        return usuarioDao.findAllPersonas();
        }

    @Override
    public Usuario encontrarUsuarioPorID(Usuario usuario) {
        return usuarioDao.findPersonaByID(usuario);
    }

    @Override
    public Usuario encontrarUsuarioPorCorreo(Usuario usuario) {
        return usuarioDao.findPersonaByEmail(usuario);
    }

    @Override
    public void registrarUsuario(Usuario usuario) {
        usuarioDao.insertar(usuario);
    }

    @Override
    public void modificarUsuario(Usuario usuario) {
        usuarioDao.update(usuario);
    }

    @Override
    public void eliminarUsuario(Usuario usuario) {
        usuarioDao.delete(usuario);
    }

    @Override
    public boolean comprobar(Usuario usuario) {
        boolean result = false;
        int num = listarUsuarios().size();
        for (int i = 0; i < num;i++){
            if(this.listarUsuarios().get(i).getCorreo().equalsIgnoreCase(usuario.getCorreo())&&listarUsuarios().get(i).getContraseña().equalsIgnoreCase(usuario.getContraseña())){
                return result = true;
            }
        }
        System.out.println("RESULTADO:"+result);
        return result;
    }

    @Override
    public List<Usuario> buscarUsuario(Usuario usuario) {
        List<Usuario> listadoUsuario=null;
        for (int i=0;i<listarUsuarios().size();i++){
            if(listarUsuarios().get(i).getCorreo().toLowerCase().contains(usuario.getCorreo().toLowerCase())){
                listadoUsuario.add(listarUsuarios().get(i));
            }
        }
        return listadoUsuario;
    }

    @Override
    public String cifrarMD5(String input) throws Exception {
        String md5 = null;
        if (null == input)
            return null;
        
        MessageDigest digest = MessageDigest.getInstance("MD5");
        
        digest.update(input.getBytes(), 0, input.length());
        
        md5 = new BigInteger(1, digest.digest()).toString(16);
        
        return md5;
    }
    
}
