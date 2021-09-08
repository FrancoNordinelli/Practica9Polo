
package Logica;

public class PlantasClase {
    //nombre, alto del tallo, tieneHojas, clima ideal.
    private boolean tieneHojas;
    private String nombre, clima;
    private float alto_tallo;

    public PlantasClase() {
    }

    public PlantasClase(boolean tieneHojas, String nombre, String clima, float alto_tallo) {
        this.tieneHojas = tieneHojas;
        this.nombre = nombre;
        this.clima = clima;
        this.alto_tallo = alto_tallo;
    }

    public boolean isTieneHojas() {
        return tieneHojas;
    }

    public void setTieneHojas(boolean tieneHojas) {
        this.tieneHojas = tieneHojas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public float getAlto_tallo() {
        return alto_tallo;
    }

    public void setAlto_tallo(float alto_tallo) {
        this.alto_tallo = alto_tallo;
    
    }
    
    public void hola(){
        System.out.println("Hola soy...");
    }
    
}
