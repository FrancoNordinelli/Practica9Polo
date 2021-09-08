/*
Llevar a cabo un programa que incluya un vector que almacene los nombres: Alejandra, Leonardo, Rosa, Guillermo, Gabriel, 
Daniel, Luisa y Ludmila. Realizar un recorrido del vector para cargar los datos y otro recorrido para mostrar los mismos 
por pantalla.
 */
package javaapplication9;

import java.util.Scanner;

public class JavaApplication9 {
    
    public static void main(String[] args) {
/*Llevar a cabo un programa que incluya un vector que almacene los nombres: Alejandra, Leonardo, Rosa, Guillermo, Gabriel, 
Daniel, Luisa y Ludmila. Realizar un recorrido del vector para cargar los datos y otro recorrido para mostrar los mismos 
por pantalla.

        
        String vector[] = {"Alejandra", "Leonardo", "Rosa", "Guillermo", "Gabriel", "Daniel", "Luisa" , "Ludmila"};
        
        for (int i=0;i<vector.length;i++) {
            System.out.println("Nombre: " + vector[i]);
         }*/
/*Realizar un programa que permita la carga de 10 números en un vector. 
Una vez cargados, se necesita que el programa determine cual es el mayor y cuál es el menor de ellos.*/
    
        int vector2[] = new int [10];
        Scanner teclado = new Scanner(System.in);//al objeto lo creamos fuera para que no se cree una y otra vez en el loop
        //Carga
        for(int i=0;i<vector2.length;i++){
           System.out.println("Ingrese un numero: ");
           vector2[i]=teclado.nextInt();         
        }
        int menor=vector2[0];
        int mayor=vector2[0];
        for(int i=0;i<vector2.length;i++){
            if(vector2[i]>mayor){
                mayor=vector2[i];
            }
            if(vector2[i]<menor){
                menor=vector2[i];
            }
        }
        for(int i=0;i<vector2.length;i++){
            System.out.print(vector2[i] + " ");
        }
        System.out.println();
        System.out.println("El menor es: "+menor);
        System.out.println("El mayor es: "+mayor);
    }
    
}
