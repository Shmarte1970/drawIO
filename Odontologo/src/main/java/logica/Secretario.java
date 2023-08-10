
package logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Secretario extends Persona implements Serializable{
    
   /* @Id
    private Integer id_secretario; */
    private String secretario;
    @OneToOne
    private Usuario unsuario; // Objeto relacional de 1 a 1 con Usuarios.

    public Secretario() {
    }

    public Secretario(String secretario, Usuario unsuario, int id, String dni, String nombre_persona, String apellidos, String telefono, String direccion, Date fecha_nacimiento) {
        super(id, dni, nombre_persona, apellidos, telefono, direccion, fecha_nacimiento);
        this.secretario = secretario;
        this.unsuario = unsuario;
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
