package LOGICA;

import java.util.Scanner;

public class Charmander extends Pokemon implements IFuego{

    public Charmander() {
    }
    
    
    public int getNumPokedex() {
        return numPokedex;
    }

    public void setNumPokedex(int numPokedex) {
        this.numPokedex = numPokedex;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    @Override
    public void atacarPlacaje() {
        Scanner in=new Scanner(System.in);
        String nombreP=in.nextLine();
        System.out.println("Hola soy "+nombreP+" "+"y estoy atancado con placaje");
    }

    @Override
    public void atacarArañazo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atacarMordizco() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atacarPunioFuego() {
        
        System.out.println("Soy Charmander atacando con PunioFuego");
    }
    
}
