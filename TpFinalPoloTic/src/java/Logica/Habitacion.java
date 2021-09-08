package Logica;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Habitacion implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @Basic
    private int piso;
    //puede ser para 1, 2, 3 4 peronas o más
    private int tipo;
    private String temática;
    private double precio;
    @OneToMany
    List<Reserva> listaReservas = new ArrayList<>();

    public Habitacion() {
    }

    public Habitacion(int id, int piso, int tipo, String temática,
            double precio, List<Reserva> listaReservas) {
        this.id = id;
        this.piso = piso;
        this.tipo = tipo;
        this.temática = temática;
        this.precio = precio;
        this.listaReservas = listaReservas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getTemática() {
        return temática;
    }

    public void setTemática(String temática) {
        this.temática = temática;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public List<Reserva> getReservas() {
        return listaReservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.listaReservas = reservas;
    }

}
