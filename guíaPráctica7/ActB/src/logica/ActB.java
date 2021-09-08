
package logica;

public class ActB {

    public static void main(String[] args) {
       
        Mueble mueble1 = new Mueble("Silla", "vidrio",1.32, 58, 6);
        Mueble mueble2 = new Mueble("Sillón", "madera", 1.56, 90, 2);
        Mueble mueble3 = new Mueble("Mesa", "cerámica", 40, 40, 1);
        
        System.out.println("Mueble 1:");
        System.out.println("Mueble: "+mueble1.getNombre()+" Material: "+mueble1.getMaterial()+" Altura :"+mueble1.getAlto()+
                " Ancho: "+mueble1.getAncho()+" Cantidad: "+mueble1.getCantidad());
        System.out.println("Mueble 2:");
        System.out.println("Mueble: "+mueble2.getNombre()+" Material: "+mueble2.getMaterial()+" Altura :"+mueble2.getAlto()+
                " Ancho: "+mueble2.getAncho()+" Cantidad: "+mueble2.getCantidad());
        System.out.println("Mueble 3:");
        System.out.println("Mueble: "+mueble3.getNombre()+" Material: "+mueble3.getMaterial()+" Altura :"+mueble3.getAlto()+
                " Ancho: "+mueble3.getAncho()+" Cantidad: "+mueble3.getCantidad());
        
        mueble1.setMaterial("madera");
        mueble2.setMaterial("madera");
        mueble3.setMaterial("madera");
        
        System.out.println("Mueble 1:");
        System.out.println("Mueble: "+mueble1.getNombre()+" Material: "+mueble1.getMaterial()+" Altura :"+mueble1.getAlto()+
                " Ancho: "+mueble1.getAncho()+" Cantidad: "+mueble1.getCantidad());
        System.out.println("Mueble 2:");
        System.out.println("Mueble: "+mueble2.getNombre()+" Material: "+mueble2.getMaterial()+" Altura :"+mueble2.getAlto()+
                " Ancho: "+mueble2.getAncho()+" Cantidad: "+mueble2.getCantidad());
        System.out.println("Mueble 3:");
        System.out.println("Mueble: "+mueble3.getNombre()+" Material: "+mueble3.getMaterial()+" Altura :"+mueble3.getAlto()+
                " Ancho: "+mueble3.getAncho()+" Cantidad: "+mueble3.getCantidad());
        
    }
    
}
