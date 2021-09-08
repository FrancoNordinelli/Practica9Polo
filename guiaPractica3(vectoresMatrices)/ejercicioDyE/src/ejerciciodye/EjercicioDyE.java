package ejerciciodye;

import java.util.Scanner;

public class EjercicioDyE {

    public static void main(String[] args) {
        /* 
        int vector[] = new int [12];
        int suma = 0;
        Scanner teclado = new Scanner (System.in);
        for(int i=0;i<vector.length;i++){
            System.out.print("Ingrese el sueldo para el mes "+i+":");
            vector[i]=teclado.nextInt();
            suma = suma + vector[i];
            System.out.println();
        }
        double promedio = suma/12;
        System.out.println("La suma total es: "+suma+" y el promedio es de: "+promedio);
 Un empleado desea almacenar en un vector sus 12 sueldos del año. A partir de esto, necesita un programa que determine 
y muestre por pantalla la suma total de sus 12 sueldos y el promedio de sueldo que tuvo en el año.* 
 
         */
 /*En tres vectores diferentes se guardan los nombres, temperaturas mínimas y máximas de 5 ciudades de la provincia de Misiones. 
        En el primer vector se guardan los nombres de las ciudades, en el segundo las temperaturas mínimas alcanzadas y en el tercero 
        las temperaturas máximas alcanzadas en la última semana. Se necesita un programa que permita la carga de las ciudades, 
        sus temperaturas mínimas y máximas; además, deberá poder informar por pantalla cual fue la ciudad con la temperatura más baja 
        y cual con la temperatura más alta (dando a conocer al mismo tiempo la cantidad de grados).*/

        String ciudades[] = new String[3];
        int tempMax[] = new int [3];
        int tempMin[] = new int [3];
        Scanner tecl = new Scanner(System.in);
        Scanner tec2 = new Scanner(System.in);
        for (int i = 0; i < ciudades.length; i++) {
            System.out.println("ingrese el nombre de la ciudad: ");
            ciudades[i] = tecl.next();
            System.out.println("Ingrese la temp. maxima para la ciudad");
            tempMax[i] =  tec2.nextInt();
            System.out.println("Ingrese la temp. minima para la ciudad");
            tempMin[i]= tec2.nextInt();
        }
        int min = tempMin[0];
        int max = tempMax[0];
        int contMin=0;
        int contMax=0;
        for(int i=0;i<tempMax.length;i++){
            if(tempMax[i]>max){
                max=tempMax[i];
                contMax=i;
            }
            if(tempMin[i]<min){
                min=tempMin[i];
                contMin=i;
            }
        }
        for(int i=0;i<ciudades.length;i++){
            System.out.println("Ciudad: "+ciudades[i]+" temp.Max: "+tempMax[i]+" temp.Min: "+tempMin[i]);
        }
        System.out.println("La temperatura mas baja fue de: "+min+" en la ciudad de "+ciudades[contMin]);
        System.out.println("La temperatura mas alta fue de: "+max+" en la ciudad de "+ciudades[contMax]);
        
    }

}
