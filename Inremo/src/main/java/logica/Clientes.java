
package logica;

import java.util.List;

/**
 *
 * @author USER
 */
public class Clientes extends FormasPago{
    
    private int idCliente;
    private int idpago;
    private String nombreCliente;
    private String ApelligoCliente;
    private String telefonoCliente;
    private String dniCliente;
    private String direcionCliente;
    private String cpCliente;
    private float dtoCliente;
    private String poblacionCliente;
    private String mailCliente;
    private String formapago;
    private List<HeadOrdenes>listaOrdenes;

    public Clientes() {
    }

    public Clientes(int idCliente, int idpago, String nombreCliente, String ApelligoCliente, String telefonoCliente, String dniCliente, String direcionCliente, String cpCliente, float dtoCliente, String poblacionCliente, String mailCliente, String formapago, List<HeadOrdenes> listaOrdenes, int idPago, String formaPago) {
        super(idPago, formaPago);
        this.idCliente = idCliente;
        this.idpago = idpago;
        this.nombreCliente = nombreCliente;
        this.ApelligoCliente = ApelligoCliente;
        this.telefonoCliente = telefonoCliente;
        this.dniCliente = dniCliente;
        this.direcionCliente = direcionCliente;
        this.cpCliente = cpCliente;
        this.dtoCliente = dtoCliente;
        this.poblacionCliente = poblacionCliente;
        this.mailCliente = mailCliente;
        this.formapago = formapago;
        this.listaOrdenes = listaOrdenes;
    }

    public List<HeadOrdenes> getListaOrdenes() {
        return listaOrdenes;
    }

    public void setListaOrdenes(List<HeadOrdenes> listaOrdenes) {
        this.listaOrdenes = listaOrdenes;
    }


    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdpago() {
        return idpago;
    }

    public void setIdpago(int idpago) {
        this.idpago = idpago;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApelligoCliente() {
        return ApelligoCliente;
    }

    public void setApelligoCliente(String ApelligoCliente) {
        this.ApelligoCliente = ApelligoCliente;
    }

    public String getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(String telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    public String getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(String dniCliente) {
        this.dniCliente = dniCliente;
    }

    public String getDirecionCliente() {
        return direcionCliente;
    }

    public void setDirecionCliente(String direcionCliente) {
        this.direcionCliente = direcionCliente;
    }

    public String getCpCliente() {
        return cpCliente;
    }

    public void setCpCliente(String cpCliente) {
        this.cpCliente = cpCliente;
    }

    public float getDtoCliente() {
        return dtoCliente;
    }

    public void setDtoCliente(float dtoCliente) {
        this.dtoCliente = dtoCliente;
    }

    public String getPoblacionCliente() {
        return poblacionCliente;
    }

    public void setPoblacionCliente(String poblacionCliente) {
        this.poblacionCliente = poblacionCliente;
    }

    public String getMailCliente() {
        return mailCliente;
    }

    public void setMailCliente(String mailCliente) {
        this.mailCliente = mailCliente;
    }

    public String getFormapago() {
        return formapago;
    }

    public void setFormapago(String formapago) {
        this.formapago = formapago;
    }
    

    
}
