package Logica;

import Persistencia.ControladoraPersistencia;

public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    public void crearAlumno(String nombre, String apellido, String pelo, boolean titulo, String nivelJava){
        Alumno alu = new Alumno();
        alu.setApellido(apellido);
        alu.setNombre(nombre);
        alu.setColorPelo(pelo);
        alu.setTitulo(titulo);
        alu.setNivelJava(nivelJava);
        
        controlPersis.crearAlumno(alu);
    }
}
