package LOGICA;

public class PlayStatio2 extends Consola {
    
    private  int tamMemoryCard;
    private String juego;
    private boolean chipeadaONo;

    public PlayStatio2() {
    }

    public PlayStatio2(int tamMemoryCard, String juego, boolean chipeadaONo) {
        this.tamMemoryCard = tamMemoryCard;
        this.juego = juego;
        this.chipeadaONo = chipeadaONo;
    }

   public void leerDvs(String juego){
       System.out.println("Leyendo: "+juego);
   }

    
    @Override
    public void cargarJuego() {
        System.out.println("Leyendo cartucho: "+juego);
    }
    
    
    
}
