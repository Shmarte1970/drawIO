
package logicas;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Pedro Ríos
 */

@Entity
public class vehiculos {
    
    @Id
    @GeneratedValue
    private int Id_vehiculos;
    private String marca;
    private String modelo;
    @Temporal(TemporalType.DATE)
    private Date matriculacion;
    

    public vehiculos() {
    }

    public vehiculos(int Id_vehiculos, String marca, String modelo, Date matriculacion, String color) {
        this.Id_vehiculos = Id_vehiculos;
        this.marca = marca;
        this.modelo = modelo;
        this.matriculacion = matriculacion;       
    }

    public int getId_vehiculos() {
        return Id_vehiculos;
    }

    public void setId_vehiculos(int Id_vehiculos) {
        this.Id_vehiculos = Id_vehiculos;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Date getMatriculacion() {
        return matriculacion;
    }

    public void setMatriculacion(Date matriculacion) {
        this.matriculacion = matriculacion;
    }

    
}
