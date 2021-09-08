package Logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Producto implements Serializable {
    
    @Id
    private int cod_prod;
    @Basic
    private String nombre;
    private int cantidad;
    private String marca;
    private String tipo;
    @Temporal(TemporalType.DATE)
    private Date fec_vencimiento;

    public Producto() {
    }

    public Producto(int cod_prod, String nombre, int cantidad, String marca, String tipo, Date fec_vencimiento) {
        this.cod_prod = cod_prod;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.marca = marca;
        this.tipo = tipo;
        this.fec_vencimiento = fec_vencimiento;
    }

    public int getCod_prod() {
        return cod_prod;
    }

    public void setCod_prod(int cod_prod) {
        this.cod_prod = cod_prod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getFec_vencimiento() {
        return fec_vencimiento;
    }

    public void setFec_vencimiento(Date fec_vencimiento) {
        this.fec_vencimiento = fec_vencimiento;
    }
    
}
