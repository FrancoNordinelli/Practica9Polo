
package Logica;

public class Arbusto extends PlantasClase{
    //Ancho arbusto, esDomestico, variedad arbusto, color de hojas, sePodaONo
    private String var_arbusto, color_hojas;
    private boolean sePodaONo;
    private float ancho;

    public Arbusto() {
    }

    public Arbusto(String var_arbusto, String color_hojas, boolean sePodaONo, float ancho, boolean tieneHojas, String nombre, String clima, float alto_tallo) {
        super(tieneHojas, nombre, clima, alto_tallo);
        this.var_arbusto = var_arbusto;
        this.color_hojas = color_hojas;
        this.sePodaONo = sePodaONo;
        this.ancho = ancho;
    }

    public String getVar_arbusto() {
        return var_arbusto;
    }

    public void setVar_arbusto(String var_arbusto) {
        this.var_arbusto = var_arbusto;
    }

    public String getColor_hojas() {
        return color_hojas;
    }

    public void setColor_hojas(String color_hojas) {
        this.color_hojas = color_hojas;
    }

    public boolean isSePodaONo() {
        return sePodaONo;
    }

    public void setSePodaONo(boolean sePodaONo) {
        this.sePodaONo = sePodaONo;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }
    
    public void holaArbusto(){
    System.out.println("Hola soy Arbusto");
    }
}
    

