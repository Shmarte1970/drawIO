
package logica;

/**
 *
 * @author USER
 */
public class CategoriaProfesional {
    
    private int idCategoriaProfesional;
    private String nombreCategoria;

    public CategoriaProfesional() {
    }

    public CategoriaProfesional(int idCategoriaProfesional, String nombreCategoria) {
        this.idCategoriaProfesional = idCategoriaProfesional;
        this.nombreCategoria = nombreCategoria;
    }

    public int getIdCategoriaProfesional() {
        return idCategoriaProfesional;
    }

    public void setIdCategoriaProfesional(int idCategoriaProfesional) {
        this.idCategoriaProfesional = idCategoriaProfesional;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

   
    
    
}
