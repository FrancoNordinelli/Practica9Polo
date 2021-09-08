
package Logica;

public class Arbol extends PlantasClase{
    
    //variedad, tipo de tronco, radio de tronco, color, tipo de hojas.
    
    private String variedad, tipo_tronco, radio_tronco, color, tipo_hojas;

    public Arbol(String variedad, String tipo_tronco, String radio_tronco, String color, String tipo_hojas, boolean tieneHojas, String nombre, String clima, float alto_tallo) {
        super(tieneHojas, nombre, clima, alto_tallo);
        this.variedad = variedad;
        this.tipo_tronco = tipo_tronco;
        this.radio_tronco = radio_tronco;
        this.color = color;
        this.tipo_hojas = tipo_hojas;
    }

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public String getTipo_tronco() {
        return tipo_tronco;
    }

    public void setTipo_tronco(String tipo_tronco) {
        this.tipo_tronco = tipo_tronco;
    }

    public String getRadio_tronco() {
        return radio_tronco;
    }

    public void setRadio_tronco(String radio_tronco) {
        this.radio_tronco = radio_tronco;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo_hojas() {
        return tipo_hojas;
    }

    public void setTipo_hojas(String tipo_hojas) {
        this.tipo_hojas = tipo_hojas;
    }
    
    public Arbol() {
    }
    
    private void holaArbol(){
        System.out.println("Hola soy Arbol");
    } 
    
    public void hola(){
        System.out.println("Hola soy Arbol");
    }
}
