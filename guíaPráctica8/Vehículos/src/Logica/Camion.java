
package Logica;

public class Camion extends Vehiculo{
    private int cant_ejes;
    private boolean poseeAcoplado;

    public Camion() {
    }

    public Camion(int cant_ejes, boolean poseeAcoplado, String patente, String num_chasis, String motor, String color, String marca, String modelo, int cant_asientos) {
        super(patente, num_chasis, motor, color, marca, modelo, cant_asientos);
        this.cant_ejes = cant_ejes;
        this.poseeAcoplado = poseeAcoplado;
    }

    public int getCant_ejes() {
        return cant_ejes;
    }

    public void setCant_ejes(int cant_ejes) {
        this.cant_ejes = cant_ejes;
    }

    public boolean isPoseeAcoplado() {
        return poseeAcoplado;
    }

    public void setPoseeAcoplado(boolean poseeAcoplado) {
        this.poseeAcoplado = poseeAcoplado;
    }
    
    
}
