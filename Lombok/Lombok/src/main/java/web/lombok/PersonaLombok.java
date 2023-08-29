
package web.lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 *
 * @author USER
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PersonaLombok {
    
    private int id_lompok;
    private String nom_lombok;
  
    private String pais;
    
    
}
