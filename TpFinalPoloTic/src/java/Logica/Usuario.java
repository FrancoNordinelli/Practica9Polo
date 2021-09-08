package Logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Usuario implements Serializable {
    @Id
    private int id;
    @Basic
    private String contraseña;
    private String usuario;

    public Usuario() {
    }

    public Usuario(String contraseña, String usuario, int id) {
        this.contraseña = contraseña;
        this.usuario = usuario;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
}
