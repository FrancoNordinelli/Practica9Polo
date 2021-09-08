/*
 Llevar a cabo un programa que permita cargar mediante teclado una matriz de 3 x 3 (3 filas, 3 columnas) con razas de perros.
Una vez cargada, se debe permitir al usuario ingresar por teclado una raza de perro que quiera buscar; 
el programa deberá poder encontrarla y mostrar un mensaje con la posición (fila, columna) donde la encontró. 
En caso de que la raza de perro no se encuentre en la matriz, 
se deberá informar la situación mediante un mensaje por pantalla.
 */
package ejcmatrices;

import java.util.Scanner;

public class EjCMatrices {

    public static void main(String[] args) {
        String perros[][]=new String[3][3];
        Scanner tec = new Scanner (System.in);
        for(int f=0;f<3;f++){
            for(int c=0;c<3;c++){
                System.out.println("Ingres el nombre de la raza ");
                perros[f][c]=tec.next();
            }
        }
        String busca;
        System.out.println("Ingrese el nombre de la raza que desea buscar: ");
        busca=tec.next();
        int flag=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(perros[i][j].equals(busca)){
                    System.out.println("El perro está en la fila: " +i+ " columna: " +j);
                    flag=1;
                }
            }
        }
        if(flag!=1){
            System.out.println("No se encontro la raza");
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(" "+perros[i][j]);
            }
            System.out.println();
        }
    }
    
}
