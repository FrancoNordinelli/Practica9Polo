
package LOGICA;

public class main {

    public static void main(String[] args) {
        Charmander charmander = new Charmander();
        //charmander.nombre="MiChar";
        //charmander.atacarPlacaje();
        //charmander.atacarPunioFuego();
        charmander.setNombre("Char1");
        System.out.println("Nombre Charmander: "+charmander.getNombre());
        Pikachu pika = new Pikachu();
        pika.nombre="MiPika";
        pika.numPokedex=123;
        pika.peso=16;
        pika.temporada=1;
        pika.sexo="Masculino";
        pika.tipo="Eléctrico";
        System.out.println("Nombre: "+pika.nombre+" Pokedex: "+pika.numPokedex+" Peso:"+pika.peso);
        System.out.println("Ataque: "); pika.atacarImpactTrueno();
        
    }
    
}
