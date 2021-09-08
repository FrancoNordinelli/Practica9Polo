/*
 El evento cuenta con un día de inscripciones el día anterior a la carrera,
por lo que se desconoce la cantidad exacta de inscriptos que puede llegar a haber. 
Desde la Federación de Colectividades (Organismo que organiza), 
manifestaron que se solicitan los siguientes datos para la inscripción de cada participante: dni, nombre, apellido y edad.
En cuanto a las categorías posibles para una inscripción, se manejan las siguientes:
• Menores A (de 6 a 10 años)
• Menores B (de 11 a 17 años)
• Juveniles (de 18 a 30 años)
• Adultos (de 31 a 50 años)
• Adultos mayores (mayores de 50 años)
Se necesita un programa que, a partir del ingreso de los datos y edad de cada participante, 
se muestre por pantalla a qué categoría debe ser inscripto. Cabe destacar que, al finalizar el día, 
para dar fin a las inscripciones, se debe ingresar un dni con el valor 0 y un nombre con la palabra “fin”.
 */
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        String nombre="nombre";
        String apellido="apellido";
        int dni=1, edad;
        //¿por qué tira error de inicialización?
        while ((!nombre.equals("fin")||!apellido.equals("fin")) && dni != 0) {
            System.out.println("Ingrese el nombre");
            Scanner nom = new Scanner(System.in);
            nombre = nom.next();
            System.out.println("Ingrese el apellido");
            Scanner ape = new Scanner(System.in);
            apellido = ape.next();
            System.out.println("Ingrese el dni");
            Scanner documento = new Scanner(System.in);
            dni = documento.nextInt();
            System.out.println("Ingrese la edad");
            Scanner años = new Scanner(System.in);
            edad = años.nextInt();
            if (edad > 6 && edad < 10) {
                System.out.println("Nombre: " + nombre + " Apellido: " + " Edad: " + " Dni: " + " Grupo: menores A");
            }
            if (edad > 10 && edad < 17) {
                System.out.println("Nombre: " + nombre + " Apellido: " + " Edad: " + " Dni: " + " Grupo: menores B");
            }
            if (edad > 17 && edad < 30) {
                System.out.println("Nombre: " + nombre + " Apellido: " + " Edad: " + " Dni: " + " Grupo: juvenil");
            }
            if (edad > 30 && edad < 50) {
                System.out.println("Nombre: " + nombre + " Apellido: " + " Edad: " + " Dni: " + " Grupo: adulto");
            }
            if (edad > 50) {
                System.out.println("Nombre: " + nombre + " Apellido: " + " Edad: " + " Dni: " + " Grupo: Adulto mayor");
            }

        }

    }

}
