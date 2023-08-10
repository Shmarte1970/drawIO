
package logicas;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 *
 * @author Pedro Ríos
 */

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class produc {
    
    @Id    
    @GeneratedValue
    private int id_persona;
    private String nombre;
    private String apellido;
    private String dni;
    private String telefono;
    private String email;
    private String cp;
    private String pais;
    private String poblacion;
  
 
}
