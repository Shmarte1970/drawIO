
package logica;

import java.util.Date;
import java.util.List;

/**
 *
 * @author USER
 */
public class HeadOrdenes {
    
    private int idOrdentrabajo;
    private int idOperatio;
    private int idCliente;
    private String nombreOperario;
    private String nombreCliente;
    private String telefonoCliente;
    private Date fechaOrden;
    private String direccionOrden;
    private String cpOrden;
    private String poblacionOrden;
    private List<Clientes>listaClienteses;
    private List<Operarios>listaOperario;

    public HeadOrdenes() {
    }

    public HeadOrdenes(int idOrdentrabajo, int idOperatio, int idCliente, String nombreOperario, String nombreCliente, String telefonoCliente, Date fechaOrden, String direccionOrden, String cpOrden, String poblacionOrden, List<Clientes> listaClienteses, List<Operarios> listaOperario) {
        this.idOrdentrabajo = idOrdentrabajo;
        this.idOperatio = idOperatio;
        this.idCliente = idCliente;
        this.nombreOperario = nombreOperario;
        this.nombreCliente = nombreCliente;
        this.telefonoCliente = telefonoCliente;
        this.fechaOrden = fechaOrden;
        this.direccionOrden = direccionOrden;
        this.cpOrden = cpOrden;
        this.poblacionOrden = poblacionOrden;
        this.listaClienteses = listaClienteses;
        this.listaOperario = listaOperario;
    }

    public Date getFechaOrden() {
        return fechaOrden;
    }

    public void setFechaOrden(Date fechaOrden) {
        this.fechaOrden = fechaOrden;
    }

    
  
    public int getIdOrdentrabajo() {
        return idOrdentrabajo;
    }

    public void setIdOrdentrabajo(int idOrdentrabajo) {
        this.idOrdentrabajo = idOrdentrabajo;
    }

    public int getIdOperatio() {
        return idOperatio;
    }

    public void setIdOperatio(int idOperatio) {
        this.idOperatio = idOperatio;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreOperario() {
        return nombreOperario;
    }

    public void setNombreOperario(String nombreOperario) {
        this.nombreOperario = nombreOperario;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(String telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

  

    public String getDireccionOrden() {
        return direccionOrden;
    }

    public void setDireccionOrden(String direccionOrden) {
        this.direccionOrden = direccionOrden;
    }

    public String getCpOrden() {
        return cpOrden;
    }

    public void setCpOrden(String cpOrden) {
        this.cpOrden = cpOrden;
    }

    public String getPoblacionOrden() {
        return poblacionOrden;
    }

    public void setPoblacionOrden(String poblacionOrden) {
        this.poblacionOrden = poblacionOrden;
    }

    public List<Clientes> getListaClienteses() {
        return listaClienteses;
    }

    public void setListaClienteses(List<Clientes> listaClienteses) {
        this.listaClienteses = listaClienteses;
    }

    public List<Operarios> getListaOperario() {
        return listaOperario;
    }

    public void setListaOperario(List<Operarios> listaOperario) {
        this.listaOperario = listaOperario;
    }
    
    
    
}
