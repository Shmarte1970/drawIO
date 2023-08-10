
package logica;


import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Odontologo extends Persona implements Serializable{
    
    /*@Id
    private Integer id_odontolog;*/
    private String especialidad;
    @OneToMany(mappedBy = "odont")
    private List<Turno>unaListadeTurnos; // Lista de relacion con turno de 1 a n
    @OneToOne
    private Horario unHorario; // Objeto relacional de 1 a 1 con Horario
    @OneToOne
    private Usuario unUsuario; // Objeto relaciona de 1 a 1 con usuarios

    public Odontologo() {
    }

    public Odontologo(String especialidad, List<Turno> unaListadeTurnos, Horario unHorario, Usuario unUsuario, int id, String dni, String nombre_persona, String apellidos, String telefono, String direccion, Date fecha_nacimiento) {
        super(id, dni, nombre_persona, apellidos, telefono, direccion, fecha_nacimiento);
        this.especialidad = especialidad;
        this.unaListadeTurnos = unaListadeTurnos;
        this.unHorario = unHorario;
        this.unUsuario = unUsuario;
    }

    

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public List<Turno> getUnaListadeTurnos() {
        return unaListadeTurnos;
    }

    public void setUnaListadeTurnos(List<Turno> unaListadeTurnos) {
        this.unaListadeTurnos = unaListadeTurnos;
    }

    public Horario getUnHorario() {
        return unHorario;
    }

    public void setUnHorario(Horario unHorario) {
        this.unHorario = unHorario;
    }

    public Usuario getUnUsuario() {
        return unUsuario;
    }

    public void setUnUsuario(Usuario unUsuario) {
        this.unUsuario = unUsuario;
    }

 
}
