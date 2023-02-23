/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WEB;

import Negocio.UsuarioService;
import dominio.Usuario;
import java.io.IOException;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alumno Mañana
 */
@WebServlet("/usuarios")
public class UsuarioServlet extends HttpServlet {
   // inyeccion del componente EJB local al servlet
    @Inject
    // Ahora definimos nuestra variable
    UsuarioService usuarioServicio; 
    
    @Override
    protected void doGet(HttpServletRequest request,HttpServletResponse response)
            throws ServletException, IOException{
        /**Este metodo accede al listado de usuarios x medio de la instancia que estamos recibiendo**/
        System.out.println("Inicia el usuario servlet");
        List<Usuario> usuarios = usuarioServicio.listarUsuarios();
        System.out.println("Usuarios:" + usuarios);
        
        //ponemos usuarios en un alcance
        request.setAttribute("Usuarios",usuarios);
        
        //Redirigimos al JSP
        request.getRequestDispatcher("/listaUsuarios.jsp").forward(request, 
                 response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        //Leemos los parametros de nuestro request
        String accion = request.getParameter("accion");
        if(accion!=null){
            switch(accion){
                case "insertar":
                    this.insertarCliente(request, response);
                    break;
                case "login":
                    this.login(request, response);
                    break;
                case "modificar":
                    //
                    break;
                default:
                    //this.accionDefault
            }
        }else{
            //this.accionDefault
        }
    }
    
    private void insertarCliente (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        
        String correo = request.getParameter("correo");
        String password = request.getParameter("password");
        
        //creamos el objeto
        Usuario usuario = new Usuario(correo,password);
        System.out.println("DATO:"+usuario);
        
        //Invocamos el metodo de acceso a datos q inserta un objeto
        usuarioServicio.registrarUsuario(usuario);
        
        response.sendRedirect("index.html");
    }
    
    
    private void login(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        
        
        String correo = request.getParameter("correo");
        String password = request.getParameter("password");
        String error;
        
        //Creamos objeto
        Usuario usuario = new Usuario(correo,password);
        System.out.println("Usuario:"+usuario);
        
        //Invocamos metodo
        if(usuarioServicio.comprobar(usuario)){
            response.sendRedirect("index.html");
        }else{
            error = "No es válido";
            request.getSession().setAttribute("error",error);
            response.sendRedirect("login.jsp");
        }
        
    }
    
}
