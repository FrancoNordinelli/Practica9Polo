
package Servlets;

import Logica.Controladora;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SvTest", urlPatterns = {"/SvTest"})
public class SvTest extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    
    }

 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //Traigo los datos del index jsp. Request
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String colorPelo = request.getParameter("pelo");
        boolean titulo = Boolean.parseBoolean(request.getParameter("titulo"));
        String nivelJava = request.getParameter("java");
        //traer sesión y asignar atributos para abrir en cualquier jsp
        
        request.getSession().setAttribute("nombre", nombre);
        request.getSession().setAttribute("apellido", apellido);
        request.getSession().setAttribute("pelo", colorPelo);
        request.getSession().setAttribute("titulo", titulo);
        request.getSession().setAttribute("java", nivelJava);
        
        //conecto con la Lógica
        Controladora control = new Controladora();
        control.crearAlumno(nombre, colorPelo, apellido, titulo, nivelJava);
        //armado de response
        response.sendRedirect("newjsp2.jsp");
        
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
