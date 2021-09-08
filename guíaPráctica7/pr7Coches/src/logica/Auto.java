
package logica;

//creación de la clase
public class Auto {
    
    String color, marca, modelo, patente;
    public int cantPuertas;
//constructor vacío
    public Auto() {
    }
//constructor por parámetros
    public Auto(String color, String marca, String modelo, String patente, int cantPuertas) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
        this.cantPuertas = cantPuertas;
    }
//getter y setters
    public String getColor() {
        return color;
    }


    public String getMarca() {
        return marca;
    }


    public String getModelo() {
        return modelo;
    }


    public String getPatente() {
        return patente;
    }


    public int getCantPuertas() {
        return cantPuertas;
    }
    
    
}

