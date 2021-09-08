
package logica;

public class Pr7Coches {


    public static void main(String[] args) {
       
        //instancio objeto vacío
        Auto auto = new Auto();
        //instancio objetos por parámetro
        Auto auto1 = new Auto("rojo", "Ford","'86", "kilu345",5);
        Auto auto2 = new Auto("azul", "Fiat","'96", "zur345",4);
        Auto auto3 = new Auto("rojo", "Chevrolet","'00", "alu345",5);
        
        System.out.println("--------AUTO 1--------");
        System.out.println("Color:"+auto1.getColor()+" Marca:"+auto1.getMarca()+
        " Modelo:"+auto1.getModelo()+" Patente:"+auto1.getPatente()+" Puertas:"+auto1.getCantPuertas());
        System.out.println("--------AUTO 2--------");
        System.out.println("Color:"+auto2.getColor()+" Marca:"+auto2.getMarca()+
        " Modelo:"+auto2.getModelo()+" Patente:"+auto2.getPatente()+" Puertas:"+auto2.getCantPuertas());
        System.out.println("--------AUTO 3--------");
        System.out.println("Color:"+auto3.getColor()+" Marca:"+auto3.getMarca()+
        " Modelo:"+auto3.getModelo()+" Patente:"+auto3.getPatente()+" Puertas:"+auto3.getCantPuertas());
    }
    
}
