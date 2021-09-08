package Persistencia;

import Logica.Empleado;
import Logica.Habitacion;
import Logica.Huesped;
import Logica.Reserva;
import Logica.Usuario;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    
    EmpleadoJpaController empleadoJpa = new EmpleadoJpaController();
    HabitacionJpaController habitacionJpa = new HabitacionJpaController();
    PersonaJpaController personaJpa = new PersonaJpaController();
    ReservaJpaController reservaJpa = new ReservaJpaController();
    UsuarioJpaController usuarioJpa = new UsuarioJpaController();
    HuespedJpaController huespedJpa = new HuespedJpaController();
    
    public void crearHabitacion(Habitacion habitacion){
        try {
            habitacionJpa.create(habitacion);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void nuevaReserva(Reserva reserva){
        try {
            reservaJpa.create(reserva);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void altaEmpleado(Empleado empleado){
        try {
            empleadoJpa.create(empleado);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void crearUsuario(Usuario usuario){
        try {
            usuarioJpa.create(usuario);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void nuevoHuesped(Huesped huesped){
        try {
            huespedJpa.create(huesped);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
