package LOGICA;



public class Nintengo64 extends Consola {
    
    private  String norma;
    private String juego;
    private boolean cartuchosPiratos;

    public Nintengo64() {
    }
    
    
    //constructor que permite trabajar con métodos a partir de los atributos
    public Nintengo64(String norma, String juego, boolean cartuchosPiratos) {
        this.norma = norma;
        this.juego = juego;
        this.cartuchosPiratos = cartuchosPiratos;
    }

    public void leerCartucho(String juego){
        System.out.println("Leyendo cartucho: "+juego);
    }

    @Override
    public void cargarJuego() {
        System.out.println("Cargando juego");
    }
    
}
