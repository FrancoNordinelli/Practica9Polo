package Logica;

//Clase para controlar métodos de otras clases.
//Como acercamiento a MVC, armo el procedimiento altaMascota en la clase Controladora (cotrola otras clases)de la Lógica
//(y lo elimino de la interfaz) para pasarle luego los objtos nuevaMascota a la BD
import Persistencia.ControlPersistencia;
import java.util.Date;

//Como acercamiento a MVC, armo el procedimiento altaMascota en la clase controladora de la lógica
    //(y lo elimino de la interfaz) para pasarle luego los objtos nuevaMascota a la BD gracias a la import
    //Persistencia.ControlPersistencia
public class Controladora {
    
    ControlPersistencia controlPersis = new ControlPersistencia();

    
    public void altaMascota(String alergiasM, String contactoM, Date fecha_cargaM,
            String observacionesM, String razaM, String nomMascota, String idM, String nombreDueño, String atEspecial) {
        
            Mascota nuevaMascota = new Mascota();
            nuevaMascota.setAlergias(alergiasM);
            nuevaMascota.setNumMascota(idM);
            nuevaMascota.setFecha_carga(fecha_cargaM);
            nuevaMascota.setObservaciones(observacionesM);
            nuevaMascota.setRaza(razaM);
            nuevaMascota.setNombreMascota(nomMascota);
            nuevaMascota.setContacto(contactoM);
            nuevaMascota.setNombeDueño(nombreDueño);
            nuevaMascota.setAtEspecial(atEspecial);
            
            controlPersis.altaMascota(nuevaMascota);
            
    }
}
