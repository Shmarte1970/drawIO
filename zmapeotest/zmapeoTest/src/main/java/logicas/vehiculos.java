
package logicas;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Pedro Ríos
 */

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class vehiculos {
    
    @Id
    @GeneratedValue
    private int Id_vehiculos;
    private String marca;
    private String modelo;
    @Temporal(TemporalType.DATE)
    private Date matriculacion;

}
