
package Logica;

public class Auto extends Vehiculo{
    
    private String mat_asientos;
    private String cant_caballos;

    public Auto() {
    }

    public Auto(String mat_asientos, String cant_caballos, String patente, String num_chasis, String motor, String color, String marca, String modelo, int cant_asientos) {
        super(patente, num_chasis, motor, color, marca, modelo, cant_asientos);
        this.mat_asientos = mat_asientos;
        this.cant_caballos = cant_caballos;
    }

    public String getMat_asientos() {
        return mat_asientos;
    }

    public void setMat_asientos(String mat_asientos) {
        this.mat_asientos = mat_asientos;
    }

    public String getCant_caballos() {
        return cant_caballos;
    }

    public void setCant_caballos(String cant_caballos) {
        this.cant_caballos = cant_caballos;
    }
    
    
}
