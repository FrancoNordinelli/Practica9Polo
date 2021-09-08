
package Logica;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Auto auto1 = new Auto("Cuero", "6300", "ghu673", "ch1234", "CV 1.6", "Negro", "Chevrolet", "2019", 5);
        Auto auto2 = new Auto();
        Vehiculo vehiculo [] = new Vehiculo[3];
        //En la primera posición del vector vehiculo guardo el auto1 con sus datos
        vehiculo[0] = auto1;
        //En la segunda posición, auto2 no posee parámetros-datos
        vehiculo[1] = auto2;
        Scanner tec = new Scanner(System.in);
        Auto auto3 = new Auto();
        System.out.print("Ingrese el material de los asienos: ");
        auto3.setMat_asientos(tec.next());
        System.out.print("/nIngrese la cantidad de caballos: ");
        auto3.setCant_caballos(tec.next());
        System.out.println("Ingrese la patente: ");
        auto3.setCant_caballos(tec.next());
        vehiculo[2] = auto3;
        
        
        
    }
    
}
