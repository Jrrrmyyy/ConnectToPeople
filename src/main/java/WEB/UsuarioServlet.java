/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WEB;

import javax.inject.Inject;

/**
 *
 * @author Alumno Mañana
 */
public class UsuarioServlet {
   // inyeccion del componente EJB local al servlet
    @Inject
    // Ahora definimos nuestra variable
    UsuarioService usuarioServicio; 
}
