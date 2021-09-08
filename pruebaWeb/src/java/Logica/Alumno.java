package Logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Alumno implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id_alumno;
    @Basic
    String apellido;
    String nombre;
    String colorPelo;
    boolean titulo;
    String nivelJava;

    public Alumno() {
    }

    public Alumno(int id_alumno, String apellido, String nombre, String colorPelo, boolean titulo, String nivelJava) {
        this.id_alumno = id_alumno;
        this.apellido = apellido;
        this.nombre = nombre;
        this.colorPelo = colorPelo;
        this.titulo = titulo;
        this.nivelJava = nivelJava;
    }

    public int getId_alumno() {
        return id_alumno;
    }

    public void setId_alumno(int id_alumno) {
        this.id_alumno = id_alumno;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

    public boolean isTitulo() {
        return titulo;
    }

    public void setTitulo(boolean titulo) {
        this.titulo = titulo;
    }

    public String getNivelJava() {
        return nivelJava;
    }

    public void setNivelJava(String nivelJava) {
        this.nivelJava = nivelJava;
    }
    
    
}
