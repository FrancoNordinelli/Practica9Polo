package Logica;

//Mapeo asociado a las anotation @Entity,@Id, etc
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Mascota implements Serializable {

    //Declaracion de variables
    @Id
    private String numMascota;
    @Basic
    private String nombreMascota;
    private String raza;
//¿Pueden ser boolean las alergias y atEspecial
    private String alergias, atEspecial;
    private String nombeDueño;
    private String contacto;
    private String observaciones;
    @Temporal(TemporalType.DATE)
    private Date fecha_carga;

    //Constructor de variables para instanciar
    public Mascota(String numMascota, String nombreMascota, String raza, String alergias, String atEspecial, String nombeDueño, String contacto, String observaciones, Date fecha_carga) {
        this.numMascota = numMascota;
        this.nombreMascota = nombreMascota;
        this.raza = raza;
        this.alergias = alergias;
        this.atEspecial = atEspecial;
        this.nombeDueño = nombeDueño;
        this.contacto = contacto;
        this.observaciones = observaciones;
        this.fecha_carga = fecha_carga;
    }

    //Constructor vacío. Viene por defecto, pero es recomendable hacerlo...
    public Mascota() {
    }
    //Getters para obtener valores de variables de un objeto. Setters para modificar esos valores
    public String getNumMascota() {
        return numMascota;
    }

    public void setNumMascota(String numMascota) {
        this.numMascota = numMascota;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String isAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String isAtEspecial() {
        return atEspecial;
    }

    public void setAtEspecial(String atEspecial) {
        this.atEspecial = atEspecial;
    }

    public String getNombeDueño() {
        return nombeDueño;
    }

    public void setNombeDueño(String nombeDueño) {
        this.nombeDueño = nombeDueño;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Date getFecha_carga() {
        return fecha_carga;
    }

    public void setFecha_carga(Date fecha_carga) {
        this.fecha_carga = fecha_carga;
    }

    

}
