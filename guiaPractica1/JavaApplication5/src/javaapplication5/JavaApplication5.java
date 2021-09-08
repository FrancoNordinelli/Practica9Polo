/*1) Una pequeña despensa desea calcular los sueldos de sus empleados. 
Los puestos de los mismos pueden tener 3 categorías: 1- repositor, 2-cajero y 3-supervisor.
a) Los repositores cobran $15.890 + un bono de 10%.
b) Los cajeros cobran $25.630,89 fijos.
c) Los supervisores cobran $35.560,20 en bruto al cual se les descuenta un 11% de jubilación.
2)Se necesita una aplicación que, dependiendo el tipo de empleado del que se trate, 
calcule y muestre en pantalla el correspondiente sueldo.
Una mercería vende canutillos y mostacillas al por mayor mediante su página web. 
Como se trata de una mercería mayorista, solicita la cantidad de paquetes en cada venta y 
dependiendo de esta realiza los siguientes controles:
a) Si la cantidad de productos es menor a 5: 
Se debe emitir un mensaje indicando que no se permiten compras inferiores a 5 productos.
b) Si la cantidad de productos es mayor o igual a 5 pero menor o igual a 15: 
Se debe emitir un mensaje que el costo de envío es de $200.
c) Si la cantidad de productos es mayor o igual a 5 y es mayor a 15: 
Se debe emitir un mensaje de que el envío es gratuito.
Realizar el programa necesario para llevar a cabo los 3 controles citados.
Un instituto de inglés desea informar a sus alumnos los días y horarios de sus clases. 
Para ello, decidió la creación de una aplicación que, a partir del ingreso de la edad del alumno, 
le informe en qué días y horarios los alumnos tienen clases. Como información, 
la academia proporciona los siguientes datos respecto a los grupos y los diferentes horarios.
a) Kinder (de 4 a 6 años inclusive): Lunes y Miércoles de 16 a 17
b) 1st year (de 7 a 8 años inclusive): Martes y Jueves de 16:30 a 17:30
c) 2nd year (de 9 a 10 años inclusive): Martes y Jueves de 17:30 a 19
d) 3rd year (de 11 a 13 años inclusive): Lunes y Miércoles de 17 a 18:30
Realizar el programa solicitado por el instituto, donde a partir del ingreso de la EDAD del alumno, 
el sistema informe por pantalla los días y horarios de cursada.*/
package javaapplication5;
//esta CLASE permite obtener datos por teclado

import java.util.Scanner;

public class JavaApplication5 {

    public static void main(String[] args) {
        //variable punto para seleccion ejercicio
        int punto;
        //variable tipo Scanner, nombre = seleccionPunto que guardara el dato ingresado por teclado
        Scanner seleccionPunto = new Scanner(System.in);
        System.out.println("Ingrese el punto que desea visualizar");
        //lo ingresado por teclado se guardara en punto
        punto = seleccionPunto.nextInt();
        //Para el punto 3
        int edadAlumno;
        if (punto == 1) {
            System.out.println("PUNTO 1");
            double repositor = 15890 + ((10 * 15890) / 100); //también 15890+(15890*0.1)
            double cajero = 25630;
            double supervisor = 35560 - ((11 * 35560) / 100);
            System.out.println("Ingrese una opcion: ");
            //se crea una variable teclado de tipo Scanner que permite agregar datos al sistema
            Scanner teclado = new Scanner(System.in);
            //.nextInt() permite leer el próximo entero que se ingrese por teclado
            int opcion = teclado.nextInt();
            //La opcion debe cambiarse manualmente por programa
            switch (opcion) {
                case 1:
                    System.out.println("El repositor debe cobrar:" + repositor);
                    break;
                case 2:
                    System.out.println("El cajero debe cobrar:" + cajero);
                    break;
                case 3:
                    System.out.println("El supervisor debe cobrar:" + supervisor);
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        } else if (punto == 2) {
            System.out.println("PUNTO 2");
            //La cantidad de productos debe ser cambiada por porgama
            System.out.println("Ingrese la cantidad de productos");
            Scanner selectCantProd = new Scanner(System.in);
            int cantProd = selectCantProd.nextInt();
            if (cantProd < 5) {
                System.out.println("¡LA CANTIDAD DEBE SER MAYOR A 5!");
            }
            if (cantProd >= 5 && cantProd <= 15) {
                System.out.println("El costo de envío es de $200");
            }
            if (cantProd > 15) {
                System.out.println("El envío es gratuito");
            }
        }
        if (punto == 3) {
            System.out.println("PUNTO 3");
            Scanner seleccionEdad = new Scanner(System.in);
            System.out.println("Seleccione la edad: ");
            edadAlumno=seleccionEdad.nextInt();
            if (edadAlumno >= 4 && edadAlumno <= 6) {
                System.out.println("Kinder (de 4 a 6 años inclusive): Lunes y Miércoles de 16 a 17");
            } else {
                if (edadAlumno > 6 && edadAlumno <= 8) {
                    System.out.println("1st year (de 7 a 8 años inclusive): Martes y Jueves de 16:30 a 17:30");
                }
                if (edadAlumno > 8 && edadAlumno <= 10) {
                    System.out.println("2nd year (de 9 a 10 años inclusive): Martes y Jueves de 17:30 a 19");
                }
                if (edadAlumno > 10 && edadAlumno <= 13) {
                    System.out.println("3rd year (de 11 a 13 años inclusive): Lunes y Miércoles de 17 a 18:30");
                }
            }
        }
    }

}
