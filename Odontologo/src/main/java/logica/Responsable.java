
package logica;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Responsable extends Persona{
    
   /* @Id
    private Integer id_reponsable; */
    private String tipo_resposable;

    public Responsable() {
    }

    public Responsable(String tipo_resposable) {
        this.tipo_resposable = tipo_resposable;
    }

    public String getTipo_resposable() {
        return tipo_resposable;
    }

    public void setTipo_resposable(String tipo_resposable) {
        this.tipo_resposable = tipo_resposable;
    }
    
    

  
    
}
