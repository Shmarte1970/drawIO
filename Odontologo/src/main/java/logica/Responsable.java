
package logica;

import java.util.Date;
import javax.persistence.Id;


public class Responsable extends Persona{
    
    @Id
    private Integer id_reponsable;
    private String tipo_resposable;

    public Responsable() {
    }

    public Responsable(Integer id_reponsable, String tipo_resposable, String dni, String nombre_persona, String apellidos, String telefono, String direccion, Date fecha_nacimiento) {
        super(dni, nombre_persona, apellidos, telefono, direccion, fecha_nacimiento);
        this.id_reponsable = id_reponsable;
        this.tipo_resposable = tipo_resposable;
    }

    public Integer getId_reponsable() {
        return id_reponsable;
    }

    public void setId_reponsable(Integer id_reponsable) {
        this.id_reponsable = id_reponsable;
    }

    public String getTipo_resposable() {
        return tipo_resposable;
    }

    public void setTipo_resposable(String tipo_resposable) {
        this.tipo_resposable = tipo_resposable;
    }
    
    

 

   


    
}
