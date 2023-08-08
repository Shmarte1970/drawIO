
package logica;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Secretario extends Persona{
    
   /* @Id
    private Integer id_secretario; */
    private String secretario;
    @OneToOne
    private Usuario unsuario; // Objeto relacional de 1 a 1 con Usuarios.

   
}
