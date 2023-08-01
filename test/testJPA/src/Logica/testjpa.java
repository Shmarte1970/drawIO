package Logica;

import Persistencia.ControladoraPersistencia;
import java.util.Date;
import java.util.List;



/**
 *
 * @author Pedro Ríos
 */
public class testjpa {


    public static void main(String[] args) {
        
        /*Alumno alumno = new Alumno("52391115J", "Pedro", "Rios Macias", new Date("05/02/1970"));
        Alumno alumno2 = new Alumno("00000023T", "Armando", "Bronca Segura", new Date("06/12/1978"));
       Alumno alumno3 = new Alumno("00000000Z", "John", "Weck", new Date("1986/04/15"));*/
        
        ControladoraPersistencia control = new ControladoraPersistencia();
        
        /*
        
        List<Alumno> listaAlumnos = control.traerAlumnos();
        
         for (Alumno alu:listaAlumnos){
             System.out.println(alu.getDni()+" "+alu.getNombre()+" "+alu.getApellido());
         }
        
        /*control.crearAlumno(alumno3);*/
        
        /*control.eliminarAlumno("00000000Z");
        
        alumno2.setApellido("Wick");
        alumno2.setNombre("Will");
        
        control.modificarAlumno(alumno2);*/
        
        Alumno alu = control.traerAlumnoEnParticular("00000023T");
             System.out.println(alu.getDni()+" "+alu.getNombre()+" "+alu.getApellido());
  
    }
    
}
