package Logica;

import Persistencia.ControladoraPer;
import java.util.Date;

public class Controladora {

    ControladoraPer controlP = new ControladoraPer();
    public void altaProducto(int cod_prod, String nombre, int cantidad, String marca, String tipo, Date fec_vencimiento) {

        Producto prod = new Producto();
        prod.setCod_prod(cod_prod);
        prod.setCantidad(cantidad);
        prod.setNombre(nombre);
        prod.setMarca(marca);
        prod.setTipo(tipo);
        prod.setFec_vencimiento(fec_vencimiento);
        
        controlP.altaProducto(prod);

    }

}
