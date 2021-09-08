
package Logica;

public class Colectivo extends Vehiculo{
    
    private boolean aptoDiscapacitados, poseeLectorSube;
    private String tipoColectivo;

    public Colectivo() {
    }

    public Colectivo(boolean aptoDiscapacitados, boolean poseeLectorSube, String tipoColectivo) {
        this.aptoDiscapacitados = aptoDiscapacitados;
        this.poseeLectorSube = poseeLectorSube;
        this.tipoColectivo = tipoColectivo;
    }

    public boolean isAptoDiscapacitados() {
        return aptoDiscapacitados;
    }

    public void setAptoDiscapacitados(boolean aptoDiscapacitados) {
        this.aptoDiscapacitados = aptoDiscapacitados;
    }

    public boolean isPoseeLectorSube() {
        return poseeLectorSube;
    }

    public void setPoseeLectorSube(boolean poseeLectorSube) {
        this.poseeLectorSube = poseeLectorSube;
    }

    public String getTipoColectivo() {
        return tipoColectivo;
    }

    public void setTipoColectivo(String tipoColectivo) {
        this.tipoColectivo = tipoColectivo;
    }
    
    
    
}
