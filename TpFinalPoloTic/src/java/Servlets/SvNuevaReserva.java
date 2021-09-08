package Servlets;

import Logica.Controladora;
import java.io.IOException;
import java.sql.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SvNuevaReserva", urlPatterns = {"/SvNuevaReserva"})
public class SvNuevaReserva extends HttpServlet {

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
       
        Date checkIn=Date.valueOf(request.getParameter("checkIn"));
        Date checkOut=Date.valueOf(request.getParameter("checkOut"));
        String nombreH=request.getParameter("nombreHuesped");
        String apellidoH=request.getParameter("apellidoHuesped");
        int dniH=Integer.parseInt(request.getParameter("dni"));
        String direccionH=request.getParameter("direHuesped");
        String profesionH=request.getParameter("profesionHuesped");
        Date fechaNacimiento=Date.valueOf(request.getParameter("nacimientoHuesped"));
        Controladora control = new Controladora();
        control.huespedReserva(nombreH, apellidoH, dniH, direccionH, 
                profesionH, fechaNacimiento,checkIn, checkOut);
        /*control.crearReserva(checkIn, checkOut);*/
        response.sendRedirect("menu.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
