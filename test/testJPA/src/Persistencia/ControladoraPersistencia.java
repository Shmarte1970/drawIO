
package Persistencia;

import Logica.Alumno;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pedro Ríos
 */
public class ControladoraPersistencia {
    
    AlumnoJpaController aluJPA = new AlumnoJpaController();
    
    public void  crearAlumno (Alumno alu){
        
        try {
            aluJPA.create(alu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public void eliminarAlumno(String idAlumno) {
        try {
            aluJPA.destroy(idAlumno);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void modificarAlumno(Alumno alumno2) {
        try {
            aluJPA.edit(alumno2);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Alumno> traerAlumnos() {
        List<Alumno> listaAlumno = aluJPA.findAlumnoEntities();
        return listaAlumno;
    }

    public Alumno traerAlumnoEnParticular(String id) {
        Alumno alu = aluJPA.findAlumno(id);
        return alu;
    }
    
}
