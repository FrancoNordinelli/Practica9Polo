package Lógica;

import java.util.Scanner;

public class EjercicioC {

    public static void main(String[] args) {
       
        Mascota mascotas[]=new Mascota[3];
        
        Scanner nombreT = new Scanner(System.in);
        Scanner especieT = new Scanner(System.in);
        Scanner sexoT = new Scanner(System.in);
        Scanner colorT = new Scanner(System.in);
        Scanner pelajeT = new Scanner(System.in);
        Scanner razaT = new Scanner(System.in);
        
        for(int i=0;i<mascotas.length;i++){
            mascotas[i] = new Mascota();
        }
        
        for(int i=0;i<mascotas.length;i++){
            System.out.println("Ingrese el nombre de la mascota");
            mascotas[i].setNombre(nombreT.next());
            System.out.println("Ingrese la especie de la mascota");
            mascotas[i].setEspecie(especieT.next());
            System.out.println("Ingrese el sexo de la mascota");
            mascotas[i].setSexo(sexoT.next());
            System.out.println("Ingrese el color de la mascota");
            mascotas[i].setColor(colorT.next());
            System.out.println("Ingrese el pelaje de la mascota");
            mascotas[i].setPelaje(pelajeT.next());
            System.out.println("Ingrese la raza de la mascota");
            mascotas[i].setRaza(razaT.next());
        }
        
        for(int i=0;i<mascotas.length;i++){
            System.out.println("------Mascota "+i+"-------");
            System.out.println("Nombre: "+mascotas[i].getNombre());
            System.out.println("Especie: "+mascotas[i].getEspecie());
            System.out.println("Sexo: "+mascotas[i].getSexo());
            System.out.println("Color: "+mascotas[i].getColor());
            System.out.println("Pelaje: "+mascotas[i].getPelaje());
            System.out.println("Raza: "+mascotas[i].getRaza());
        }
        
        mascotas[1].setNombre("Otro");
        mascotas[2].setNombre("Otra");
        
        System.out.println("---------Nombres cambiados----");
        System.out.println("Nombre cambiado 1: "+mascotas[1].getNombre());
        System.out.println("Nombre cambiado 2: "+mascotas[2].getNombre());
        
        for(int i=0;i<mascotas.length;i++){
            if(mascotas[i].getEspecie().equals("Perro")){
            System.out.println("------Perro "+i+"-------");
            System.out.println("Nombre: "+mascotas[i].getNombre());
            System.out.println("Especie: "+mascotas[i].getEspecie());
            System.out.println("Sexo: "+mascotas[i].getSexo());
            System.out.println("Color: "+mascotas[i].getColor());
            System.out.println("Pelaje: "+mascotas[i].getPelaje());
            System.out.println("Raza: "+mascotas[i].getRaza());
            }
        }
      
    }
    
}
