package Persistencia;

import Logica.Mascota;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControlPersistencia {
    
    
    MascotaJpaController jpaMascota = new MascotaJpaController();
    
    public void altaMascota(Mascota nuevaMas){
        try {
            jpaMascota.create(nuevaMas);
        } catch (Exception ex) {
            Logger.getLogger(ControlPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
