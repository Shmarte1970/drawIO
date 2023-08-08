
package Persisten;

import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Usuario;

/**
 *
 * @author Pedro Ríos
 */
public class ControladoraPersisten {
    
    HorarioJpaController horaJPA = new HorarioJpaController();
    OdontologoJpaController odontologoJPA = new OdontologoJpaController();
    PacienteJpaController pacienteJPA = new PacienteJpaController();
    PersonaJpaController personaJPA = new PersonaJpaController();
    ResponsableJpaController responsableJPA = new ResponsableJpaController();
    SecretarioJpaController secretarioJPA = new SecretarioJpaController();
    TurnoJpaController turnoJPA = new TurnoJpaController();
    UsuarioJpaController usuarioJPA = new UsuarioJpaController();

    public void crearUsuario(Usuario usu) {
        try {
            usuarioJPA.create(usu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersisten.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    
    
    
}
