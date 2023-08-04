
package logica;

import javax.persistence.Id;


public class Usuario {
    
    @Id
    private Integer id_usuario;
    private String nombreUsuario;
    private String password;
    private String rol;

    public Usuario() {
    }

    public Usuario(Integer id_usuario, String nombreUsuario, String password, String rol) {
        this.id_usuario = id_usuario;
        this.nombreUsuario = nombreUsuario;
        this.password = password;
        this.rol = rol;
    }

    public Integer getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
    
    
}
