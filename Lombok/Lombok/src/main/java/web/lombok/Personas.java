
package web.lombok;

/**
 *
 * @author USER
 */
public class Personas {
    
    private int Id_persona;
    private String nombre;
    private String email;

    public Personas() {
    }

    public Personas(int Id_persona, String nombre, String email) {
        this.Id_persona = Id_persona;
        this.nombre = nombre;
        this.email = email;
    }

    public int getId_persona() {
        return Id_persona;
    }

    public void setId_persona(int Id_persona) {
        this.Id_persona = Id_persona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
