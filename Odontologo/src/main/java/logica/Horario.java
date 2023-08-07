
package logica;

import java.util.Date;
import javax.persistence.Id;
import lombok.Data;

@Data
public class Horario {
    
    @Id
    private Integer id_horario;
    private String horario_inicio;
    private String horario_fin;


    
    
}
