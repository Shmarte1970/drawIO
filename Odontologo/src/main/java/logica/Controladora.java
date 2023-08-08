
package logica;


import  Persisten.ControladoraPersisten;

/**
 *
 * @author Pedro Ríos
 */
public class Controladora {
    
    ControladoraPersisten controlPersis = new ControladoraPersisten();
    
    public void creaUsuario(int id_usuario, String nombreUsuario, String password, String rol){
        
        Usuario usu = new Usuario(id_usuario, nombreUsuario, password, rol);
        controlPersis.crearUsuario(usu);
        
    }
    
}
