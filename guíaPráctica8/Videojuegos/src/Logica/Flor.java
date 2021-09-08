
package Logica;

public class Flor extends PlantasClase{
    
    private String color_petales, color_pistilo, variedad_flor, estacion;
    private int prom_petalos;

    public Flor() {
    }

    public Flor(String color_petales, String color_pistilo, String variedad_flor, String estacion, int prom_petalos, boolean tieneHojas, String nombre, String clima, float alto_tallo) {
        super(tieneHojas, nombre, clima, alto_tallo);
        this.color_petales = color_petales;
        this.color_pistilo = color_pistilo;
        this.variedad_flor = variedad_flor;
        this.estacion = estacion;
        this.prom_petalos = prom_petalos;
    }

    public String getColor_petales() {
        return color_petales;
    }

    public void setColor_petales(String color_petales) {
        this.color_petales = color_petales;
    }

    public String getColor_pistilo() {
        return color_pistilo;
    }

    public void setColor_pistilo(String color_pistilo) {
        this.color_pistilo = color_pistilo;
    }

    public String getVariedad_flor() {
        return variedad_flor;
    }

    public void setVariedad_flor(String variedad_flor) {
        this.variedad_flor = variedad_flor;
    }

    public String getEstacion() {
        return estacion;
    }

    public void setEstacion(String estacion) {
        this.estacion = estacion;
    }

    public int getProm_petalos() {
        return prom_petalos;
    }

    public void setProm_petalos(int prom_petalos) {
        this.prom_petalos = prom_petalos;
    }
    
    public void holaFlor(){
        System.out.println("Hola soy una flor");
    }
    
    
}
