package LOGICA;

public class XboxOne extends Consola {
    
    private boolean internet, calidad4k, actualizaciones;
    private String juego;

    public XboxOne() {
    }

    public XboxOne(boolean internet, boolean calidad4k, boolean actualizaciones, String juego) {
        this.internet = internet;
        this.calidad4k = calidad4k;
        this.actualizaciones = actualizaciones;
        this.juego = juego;
    }
    
    
    
    public void leerJuegoDigital(String juego){
        System.out.println("Leyendo juego digital: "+juego);
    }

    @Override
    public void cargarJuego() {
        System.out.println("Leyendo cartucho: "+juego);
    }
    
    
    
}
