
package Logica;

public class Moto extends Vehiculo{
    
    private String cilindrada, mat_manubrio;

    public Moto() {
    }

    public Moto(String cilindrada, String mat_manubrio, String patente, String num_chasis, String motor, String color, String marca, String modelo, int cant_asientos) {
        super(patente, num_chasis, motor, color, marca, modelo, cant_asientos);
        this.cilindrada = cilindrada;
        this.mat_manubrio = mat_manubrio;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getMat_manubrio() {
        return mat_manubrio;
    }

    public void setMat_manubrio(String mat_manubrio) {
        this.mat_manubrio = mat_manubrio;
    }
    
    
    
    
}
