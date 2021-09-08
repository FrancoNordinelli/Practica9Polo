package Persistencia;

import Logica.Alumno;

public class ControladoraPersistencia {
    AlumnoJpaController aluJPA = new AlumnoJpaController();
    
    public void crearAlumno(Alumno alu){
        aluJPA.create(alu);
    }
}
