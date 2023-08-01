
package logica;

import java.util.List;

/**
 *
 * @author USER
 */
public class Operarios extends Especialidad{
    
    private int idOperario;
    private String nombreOperario;
    private String ApellidosOperario;
    private String dniOperario;
    private String telefonoOperario;
    private String direccionOperario;
    private String cpOperario;
    private String poblacionOperario;
    private String categoriaProfesiona;
    private String especialidad;
    
    

    public Operarios() {
    }

    public Operarios(int idOperario, String nombreOperario, String ApellidosOperario, String dniOperario, String telefonoOperario, String direccionOperario, String cpOperario, String poblacionOperario, String categoriaProfesiona, String especialidad, int idEspecialidad, String nombreEspecialidad, List<CategoriaProfesional> idCategoria, int idCategoriaProfesional, String nombreCategoria) {
        super(idEspecialidad, nombreEspecialidad, idCategoria, idCategoriaProfesional, nombreCategoria);
        this.idOperario = idOperario;
        this.nombreOperario = nombreOperario;
        this.ApellidosOperario = ApellidosOperario;
        this.dniOperario = dniOperario;
        this.telefonoOperario = telefonoOperario;
        this.direccionOperario = direccionOperario;
        this.cpOperario = cpOperario;
        this.poblacionOperario = poblacionOperario;
        this.categoriaProfesiona = categoriaProfesiona;
        this.especialidad = especialidad;
    }

    public int getIdOperario() {
        return idOperario;
    }

    public void setIdOperario(int idOperario) {
        this.idOperario = idOperario;
    }

    public String getNombreOperario() {
        return nombreOperario;
    }

    public void setNombreOperario(String nombreOperario) {
        this.nombreOperario = nombreOperario;
    }

    public String getApellidosOperario() {
        return ApellidosOperario;
    }

    public void setApellidosOperario(String ApellidosOperario) {
        this.ApellidosOperario = ApellidosOperario;
    }

    public String getDniOperario() {
        return dniOperario;
    }

    public void setDniOperario(String dniOperario) {
        this.dniOperario = dniOperario;
    }

    public String getTelefonoOperario() {
        return telefonoOperario;
    }

    public void setTelefonoOperario(String telefonoOperario) {
        this.telefonoOperario = telefonoOperario;
    }

    public String getDireccionOperario() {
        return direccionOperario;
    }

    public void setDireccionOperario(String direccionOperario) {
        this.direccionOperario = direccionOperario;
    }

    public String getCpOperario() {
        return cpOperario;
    }

    public void setCpOperario(String cpOperario) {
        this.cpOperario = cpOperario;
    }

    public String getPoblacionOperario() {
        return poblacionOperario;
    }

    public void setPoblacionOperario(String poblacionOperario) {
        this.poblacionOperario = poblacionOperario;
    }

    public String getCategoriaProfesiona() {
        return categoriaProfesiona;
    }

    public void setCategoriaProfesiona(String categoriaProfesiona) {
        this.categoriaProfesiona = categoriaProfesiona;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    
   
}
