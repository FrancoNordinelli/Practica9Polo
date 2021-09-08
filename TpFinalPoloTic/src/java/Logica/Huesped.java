package Logica;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Huesped extends Persona {

    @Basic
    private String profesion;
    @OneToMany
    List<Reserva> listaReservas = new ArrayList<>();

    public Huesped() {
    }

    public Huesped(String profesion) {
        this.profesion = profesion;
    }

    public Huesped(String profesion, int dni, String nombre,
            String apellido, String direccion, Date fechaNacimiento,
            List<Reserva> listaReservas) {
        super(dni, nombre, apellido, direccion, fechaNacimiento);
        this.profesion = profesion;
        this.listaReservas = listaReservas;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public List<Reserva> getListaReservas() {
        return listaReservas;
    }

    public void setListaReservas(List<Reserva> listaReservas) {
        this.listaReservas = listaReservas;
    }

}
