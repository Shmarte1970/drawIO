
package logica;

import java.util.List;

/**
 *
 * @author USER
 */
public class Especialidad extends CategoriaProfesional{
    
    private int idEspecialidad;
    private String nombreEspecialidad;
    private List<CategoriaProfesional>idCategoria;

    public Especialidad() {
    }

    public Especialidad(int idEspecialidad, String nombreEspecialidad, List<CategoriaProfesional> idCategoria, int idCategoriaProfesional, String nombreCategoria) {
        super(idCategoriaProfesional, nombreCategoria);
        this.idEspecialidad = idEspecialidad;
        this.nombreEspecialidad = nombreEspecialidad;
        this.idCategoria = idCategoria;
    }

    public List<CategoriaProfesional> getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(List<CategoriaProfesional> idCategoria) {
        this.idCategoria = idCategoria;
    }

   

    public int getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(int idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }

    public String getNombreEspecialidad() {
        return nombreEspecialidad;
    }

    public void setNombreEspecialidad(String nombreEspecialidad) {
        this.nombreEspecialidad = nombreEspecialidad;
    }

   
    
    

    
    
}
