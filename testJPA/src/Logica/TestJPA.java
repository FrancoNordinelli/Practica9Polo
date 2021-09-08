package Logica;

import Persistencia.ControladoraPersistencia;
import java.util.Date;
import java.util.List;

public class TestJPA {

    public static void main(String[] args) {
        Alumno alumno = new Alumno("37995141", "Franco", "Nordinelli", new Date ("11/09/1993"));
        Alumno alumno2 = new Alumno("3398456", "Otro", "Esta", new Date ("02/02/1990"));
        ControladoraPersistencia control = new ControladoraPersistencia();
        control.crearAlumno(alumno2);
        control.eliminarAlumno("3398456");
        alumno2.setApellido("Prueba");
        alumno2.setNombre("OtroN");
        control.modificarAlumno(alumno2);
        List <Alumno> listaAlumnos = control.traerAlumnos();
        System.out.println("------Alumnos-----");
        listaAlumnos.forEach((alu) -> {
            System.out.println("* "+alu.getNombre() + " " + alu.getApellido() + " " + alu.getDni() + " " + alu.getFecha_nacimiento());
        });
        Alumno alu = control.traerAlumnoParticular("37995141");
        System.out.println("* "+alu.getNombre() + " " + alu.getApellido() + " " + alu.getDni() + " " + alu.getFecha_nacimiento());
        
        
    }
    
}
