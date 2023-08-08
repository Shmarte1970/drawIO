
package logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Turno implements Serializable {
    
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTurno;
    @Temporal(TemporalType.DATE)
 
    private Date fechaTurno;
    private String horaTurno;
    private String afeccion;    
    @ManyToOne
    @JoinColumn(name = "id_turno")
    private Odontologo odont;
    
    @ManyToOne
    @JoinColumn(name = "id_turno2")
    private Paciente pacient;

    public Turno() {
    }

    public Turno(Integer idTurno, Date fechaTurno, String horaTurno, String afeccion, Odontologo odont, Paciente pacient) {
        this.idTurno = idTurno;
        this.fechaTurno = fechaTurno;
        this.horaTurno = horaTurno;
        this.afeccion = afeccion;
        this.odont = odont;
        this.pacient = pacient;
    }


       public Integer getIdTurno() {
        return getIdTurno();
    }

    public void setIdTurno(Integer idTurno) {
        this.idTurno=idTurno;
    }


    public Date getFechaTurno() {
        return fechaTurno;
    }

    public void setFechaTurno(Date fechaTurno) {
        this.fechaTurno = fechaTurno;
    }

    public String getHoraTurno() {
        return horaTurno;
    }

    public void setHoraTurno(String horaTurno) {
        this.horaTurno = horaTurno;
    }

    public String getAfeccion() {
        return afeccion;
    }

    public void setAfeccion(String afeccion) {
        this.afeccion = afeccion;
    }

    public Odontologo getOdont() {
        return odont;
    }

    public void setOdont(Odontologo odont) {
        this.odont = odont;
    }

    public Paciente getPacient() {
        return pacient;
    }

    public void setPacient(Paciente pacient) {
        this.pacient = pacient;
    }

    
    
}
