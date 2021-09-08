/*Un gerente de una empresa prestadora de servicios de internet necesita un programa que permita realizar 
el cálculo del monto a pagar de la factura de consumo de internet de 5 clientes de una empresa. 
Para ello, el algoritmo debe solicitar por teclado dos datos: DNI del cliente y el tipo de servicio. 
Los tipos de servicio son 3:
i. Internet 30 megas (cuyo valor es de $890 – 10% de descuento)
ii. Internet 50 megas (Cuyo valor es de $1050 – 5% de descuento)
iii. Internet 100 megas (Cuyo valor fijo es de $1600)
El programa debe poder calcular el monto a pagar (dependiendo del tipo de servicio con el que cuente el cliente)
e informar por pantalla el DNI del mismo junto con el monto a pagar y el número de servicio con el que cuenta.*/
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        int dni, opcion;
        double plan = 0;
        int cont = 0;
        double clientes[][] = new double[5][2];
        double filas=0, columnas=0;
        while (cont < 5) {
            System.out.println("Ingrese el dni");
            Scanner tec = new Scanner(System.in);
            dni = tec.nextInt();
            
            System.out.println("Ingrese una opcion");
            System.out.println("1)Plan básico");
            System.out.println("2)Plan medio");
            System.out.println("3)Plan full");
            Scanner teclado = new Scanner(System.in);
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    plan = 890 - (890 * 0.1);
                    break;
                case 2:
                    plan = 1050 - (1050 * 0.05);
                    break;
                case 3:
                    plan = 1600;
                    break;
                default:
                    System.out.println("Opcion inválida");
            }
            cont++;
            System.out.println("El cliente con dni: " + dni + " debe abonar: " + plan);
        }

    }

}
