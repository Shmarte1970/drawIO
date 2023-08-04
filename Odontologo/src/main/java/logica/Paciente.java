
package logica;

import java.util.Date;
import java.util.List;
import javax.persistence.Id;


public class Paciente extends Persona{
    
    @Id
    private Integer id_paciente;
    private boolean n_seg_social;
    private String tipo_sanguieno;
    private Responsable unResponsable; //Objeto relacional 1-1 con responsable
    private List<Turno>listaTurno; // Lista relacional 1-N con Turno 

    public Paciente() {
    }

 

    public Paciente(Integer id_paciente, boolean n_seg_social, String tipo_sanguieno, Responsable unResponsable, List<Turno> listaTurno, String dni, String nombre_persona, String apellidos, String telefono, String direccion, Date fecha_nacimiento) {
        super(dni, nombre_persona, apellidos, telefono, direccion, fecha_nacimiento);
        this.id_paciente = id_paciente;
        this.n_seg_social = n_seg_social;
        this.tipo_sanguieno = tipo_sanguieno;
        this.unResponsable = unResponsable;
        this.listaTurno = listaTurno;
    }

    public Responsable getUnResponsable() {
        return unResponsable;
    }

    public void setUnResponsable(Responsable unResponsable) {
        this.unResponsable = unResponsable;
    }

    public List<Turno> getListaTurno() {
        return listaTurno;
    }

    public void setListaTurno(List<Turno> listaTurno) {
        this.listaTurno = listaTurno;
    }
    

   
   

    public Integer getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(Integer id_paciente) {
        this.id_paciente = id_paciente;
    }

    public boolean isN_seg_social() {
        return n_seg_social;
    }

    public void setN_seg_social(boolean n_seg_social) {
        this.n_seg_social = n_seg_social;
    }

    public String getTipo_sanguieno() {
        return tipo_sanguieno;
    }

    public void setTipo_sanguieno(String tipo_sanguieno) {
        this.tipo_sanguieno = tipo_sanguieno;
    }
  
    
}
