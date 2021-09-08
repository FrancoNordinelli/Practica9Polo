package LOGICA;

import java.util.Date;

//La clase abstracta oculta ciertos datos o métodos al usuario. No posee constructores porque no se instancia
public abstract class Consola {
    
    protected String cod_Consola;
    protected String empresaDesarrollo;
    protected Date añoLanzamiento;
 //Los métodos abstractos no tienen cuerpo. No llevan {}   
    public abstract void cargarJuego();
    
}
