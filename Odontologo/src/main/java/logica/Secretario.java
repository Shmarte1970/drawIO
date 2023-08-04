
package logica;

import java.util.Date;
import javax.persistence.Id;


public class Secretario extends Persona{
    
    @Id
    private Integer id_secretario;
    private String secretario;
    private Usuario unsuario; // Objeto relacional de 1 a 1 con Usuarios.

    public Secretario() {
    }

    public Secretario(Integer id_secretario, String secretario, Usuario unsuario, String dni, String nombre_persona, String apellidos, String telefono, String direccion, Date fecha_nacimiento) {
        super(dni, nombre_persona, apellidos, telefono, direccion, fecha_nacimiento);
        this.id_secretario = id_secretario;
        this.secretario = secretario;
        this.unsuario = unsuario;
    }

    public Integer getId_secretario() {
        return id_secretario;
    }

    public void setId_secretario(Integer id_secretario) {
        this.id_secretario = id_secretario;
    }

    public String getSecretario() {
        return secretario;
    }

    public void setSecretario(String secretario) {
        this.secretario = secretario;
    }

    public Usuario getUnsuario() {
        return unsuario;
    }

    public void setUnsuario(Usuario unsuario) {
        this.unsuario = unsuario;
    }
    
    
    
}
