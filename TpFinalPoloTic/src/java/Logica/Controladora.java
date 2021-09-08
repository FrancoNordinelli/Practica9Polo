package Logica;

import Persistencia.ControladoraPersistencia;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void crearHabitacion(int piso, int tipo, String tematica,
    double precio){
        Habitacion habitacion = new Habitacion();
        habitacion.setPiso(piso);
        habitacion.setPrecio(precio);
        habitacion.setTemática(tematica);
        habitacion.setTipo(tipo);
        controlPersis.crearHabitacion(habitacion);
    }
    
     public void huespedReserva(String nombre, String apellido, int dni,
            String direccion, String profesion, Date fechaNacimiento,
            Date checkIn, Date checkOut){
        Huesped huesped = new Huesped();
        huesped.setApellido(apellido);
        huesped.setDireccion(direccion);
        huesped.setDni(dni);
        huesped.setFechaNacimiento(fechaNacimiento);
        huesped.setNombre(nombre);
        huesped.setProfesion(profesion);
        Reserva reserva = new Reserva();
        List<Reserva>reservas= new ArrayList<>();
        reserva.setCheckIn(checkIn);
        reserva.setCheckOut(checkOut);
        reservas.add(reserva);
        huesped.setListaReservas(reservas);
        controlPersis.nuevaReserva(reserva);
        controlPersis.nuevoHuesped(huesped);
    }

   
    
}
