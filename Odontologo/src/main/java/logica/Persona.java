
package logica;

import java.util.Date;



public class Persona {
    
   
    private String dni;
    private String nombre_persona;
    private String apellidos;
    private String telefono;
    private String direccion;
    private Date fecha_nacimiento;

    public Persona() {
    }

    public Persona( String dni, String nombre_persona, String apellidos, String telefono, String direccion, Date fecha_nacimiento) {      
        this.dni = dni;
        this.nombre_persona = nombre_persona;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.direccion = direccion;
        this.fecha_nacimiento = fecha_nacimiento;
    }


    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre_persona() {
        return nombre_persona;
    }

    public void setNombre_persona(String nombre_persona) {
        this.nombre_persona = nombre_persona;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
    
    
    
}
