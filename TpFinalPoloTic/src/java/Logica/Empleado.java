package Logica;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import javax.persistence.OneToOne;

@Entity
public class Empleado extends Persona {

    @Basic
    private String cargo;
    @OneToOne
    Usuario usuario;
    @OneToMany
    List<Reserva> listaReservas = new ArrayList<>();

    public Empleado() {
    }

    public Empleado(String cargo) {
        this.cargo = cargo;
    }

    public Empleado(String cargo, int dni, String nombre,
            String apellido, String direccion,
            Date fechaNacimiento, List<Reserva> listaReservas) {
        super(dni, nombre, apellido, direccion, fechaNacimiento);
        this.cargo = cargo;
        this.listaReservas = listaReservas;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Reserva> getListaReservas() {
        return listaReservas;
    }

    public void setListaReservas(List<Reserva> listaReservas) {
        this.listaReservas = listaReservas;
    }
}
