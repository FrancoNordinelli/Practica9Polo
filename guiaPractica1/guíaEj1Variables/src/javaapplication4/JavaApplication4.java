/*1)a. Declarar una variable de tipo entero, otra de tipo double y otra de tipo String.
b. Asignar un valor a la variable de tipo entero y asignar esta última a la variable de tipo double. 
¿Existe un error? ¿Se puede hacer esta operación?
c. Asignar un valor a la variable de tipo double y asignar esta última a la variable de tipo entero.
¿Existe un error? ¿Se puede hacer esta operación?
d. Asignar el valor 35 a la variable de tipo String. 
¿Existe un error? ¿Se puede hacer esta operación?
e. Si quiero almacenar el número 48 en la variable String. ¿Cómo debo realizar la asignación?
2)Realizar un programa que permita el intercambio de valores entre dos variables. 
Por ejemplo: Si una variable numero vale 35, y una variable numero2 vale 20, 
realizar las acciones necesarias para que numero pase a valer 20 y numero2 pase a valer 35. 
Una vez realizado el cambio mostrar el resultado por pantalla.*/
package javaapplication4;

public class JavaApplication4 {
    public static void main(String[] args) {
        //declaro las variables
        int num;
        double num2;
        String nombre;
        //asigno un valor a num
        num=5;
        //asigno el valor guardado en num a num2(double)
        num2=num;
        //No se puede num=num2 Existe la conversión directa de entero a double, pero no visceversa
        //Para asignar valores a string se debe usar ""
        nombre="48";
        System.out.println("En la string nombre esta guardado:"+nombre);
        //punto 2
        int num3=35;
        int num4=20;
        //copio en variable auxiliar lo asignado a la variable num3 para que no se borre
        int aux=num3;
        //ahora en num3 está el 20;
        num3=num4;
        //y en el num4 lo que guardé en aux=35
        num4=aux;
        System.out.println("En la variable num3 hay un:"+num3);
        System.out.println("En la variable num4 hay un:"+num4);
    }
    
}
