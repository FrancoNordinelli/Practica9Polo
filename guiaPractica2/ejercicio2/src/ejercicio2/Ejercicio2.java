/*Un niño de primaria necesita realizar 10 cálculos diferentes entre dos números. 
Para esto necesita un programa que, para cada cálculo, permita el ingreso de los dos números por separado 
al igual que la operación que desea hacer entre ambos. 
Al mismo tiempo debe poder realizar el cálculo en cuestión y mostrar el resultado por pantalla.
Por ejemplo:
Número 1 = 25 Número 2 = 15 Operador = +*/
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        int cont = 0;
        int num1, num2;
        String operador;
        double resultado=0;
        while (cont < 10) {
            System.out.println("Ingrese el primer numero");
            Scanner tec = new Scanner(System.in);
            num1 = tec.nextInt();
            System.out.println("Ingrese el segundo numero");
            Scanner teclado=new Scanner(System.in);
            num2=teclado.nextInt();
            System.out.println("Ingrese el operador");
            Scanner oper=new Scanner(System.in);
            operador=oper.nextLine();
            if(operador.equals("+")){
                resultado=num1+num2;
            }
            if(operador.equals("-")){
                resultado=num1-num2;
            }
            if(operador.equals("*")){
                resultado=num1*num2;
            }
            if(operador.equals("/")){
                resultado=num1/num2;
            }
            System.out.println("El resultado es: "+resultado);
            
        }
    }

}
