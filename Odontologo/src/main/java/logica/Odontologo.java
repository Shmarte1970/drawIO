
package logica;


import java.util.Date;
import java.util.List;
import javax.persistence.Id;

public class Odontologo extends Persona{
    
    @Id
    private Integer id_odontolog;
    private String especialidad;
    private List<Turno>unaListadeTurnos; // Lista de relacion con turno de 1 a n
    private Horario unHorario; // Objeto relacional de 1 a 1 con Horario
    private Usuario unUsuario; // Objeto relaciona de 1 a 1 con usuarios

    public Odontologo() {
    }

    public Odontologo(Integer id_odontolog, String especialidad, List<Turno> unaListadeTurnos, Horario unHorario, Usuario unUsuario, String dni, String nombre_persona, String apellidos, String telefono, String direccion, Date fecha_nacimiento) {
        super(dni, nombre_persona, apellidos, telefono, direccion, fecha_nacimiento);
        this.id_odontolog = id_odontolog;
        this.especialidad = especialidad;
        this.unaListadeTurnos = unaListadeTurnos;
        this.unHorario = unHorario;
        this.unUsuario = unUsuario;
    }

    public Integer getId_odontolog() {
        return id_odontolog;
    }

    public void setId_odontolog(Integer id_odontolog) {
        this.id_odontolog = id_odontolog;
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
