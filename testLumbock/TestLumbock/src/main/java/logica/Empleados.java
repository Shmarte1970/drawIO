
package logica;

import javax.persistence.Id;
import lombok.Data;


@Data
public class Empleados {
    
    @Id
    private int id;
    private String Nombre;
    private String Apellido;
    
}
