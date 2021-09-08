
package Logica;

public class Vehiculo {

    private String patente, num_chasis, motor, color, marca, modelo;
    private int cant_asientos;

    public Vehiculo() {
    }

    public Vehiculo(String patente, String num_chasis, String motor, String color, String marca, String modelo, int cant_asientos) {
        this.patente = patente;
        this.num_chasis = num_chasis;
        this.motor = motor;
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.cant_asientos = cant_asientos;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getNum_chasis() {
        return num_chasis;
    }

    public void setNum_chasis(String num_chasis) {
        this.num_chasis = num_chasis;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCant_asientos() {
        return cant_asientos;
    }

    public void setCant_asientos(int cant_asientos) {
        this.cant_asientos = cant_asientos;
    }
   
    
}
