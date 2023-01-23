/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WEB;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alumno Mañana
 */
@WebServlet("/perfiles")
public class Peerfiil extends HttpServlet{
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        
        String cumpleaños = request.getParameter("cumpleaños");
        int numEntero = Integer.parseInt(cumpleaños);
        String genero = request.getParameter("genero");
        String biografia = request.getParameter("biografia");
        String direccion = request.getParameter("direccion");
        String telefono = request.getParameter("telefono");
        String email = request.getParameter("email");
        
        
        // Incluimos la respuesta al cliente
        
        PrintWriter out = response.getWriter();
        
        out.print("<html>");
        out.print("<head>");
        out.print("<title> Resultado del servlet</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<h1>Parámetros procesados por el Servlet:</h1>");
        out.print("<table border='1'>");
        
        out.print("<tr>");
            out.print("<td>");
            out.print("Cumpleaños");
            out.print("</td>");
            out.print("<td>");
            out.print(cumpleaños);
            out.print("</td>");
        out.print("</tr>");
        
        out.print("<tr>");
            out.print("<td>");
            out.print("genero");
            out.print("</td>");
            out.print("<td>");
            out.print(genero);
            out.print("</td>");
        out.print("</tr>");  
        
        out.print("<tr>");
            out.print("<td>");
            out.print("biografia");
            out.print("</td>");
            out.print("<td>");
            out.print(biografia);
            out.print("</td");
            out.print("</tr");

        out.print("<tr>");
            out.print("<td>");
            out.print("direccion");
            out.print("</td>");
            out.print("<td>");
            out.print(direccion);
            out.print("</td>");
        out.print("</tr>");  

        out.print("<tr>");
            out.print("<td>");
            out.print("telefono");
            out.print("</td>");
            out.print("<td>");
            out.print(telefono);
            out.print("</td>");
        out.print("</tr>");  
 
        out.print("<tr>");
            out.print("<td>");
            out.print("email");
            out.print("</td>");
            out.print("<td>");
            out.print(email);
            out.print("</td>");
        out.print("</tr>"); 
        
        
        out.print("</table>");
        out.print("</body>");
        out.print("</html>");
        
        out.close();
        
    }
}
