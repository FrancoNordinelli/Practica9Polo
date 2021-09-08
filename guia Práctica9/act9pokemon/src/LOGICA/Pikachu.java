
package LOGICA;

public class Pikachu extends Pokemon implements IElectrico{
    
    

    @Override
    public void atacarPlacaje() {
        System.out.println("Ataca con Placaje");
    }

    @Override
    public void atacarArañazo() {
    }

    @Override
    public void atacarMordizco() {
    }

    @Override
    public void atacarImpactTrueno() {
        System.out.println("Ataque ImpactTrueno");
    }
    
}
