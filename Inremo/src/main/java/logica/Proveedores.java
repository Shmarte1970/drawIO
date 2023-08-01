
package logica;

import java.util.List;

/**
 *
 * @author USER
 */
public class Proveedores extends FormasPago{
    
     private int idProveedor;
     private String codigoProveedor;
     private List<FormasPago>idpago;
     private String nombreProveedor;
     private String cifProveedor;
     private String telefonoProveedor;
     private String mailProveedor;
     private String cpProveedor;
     private String provinciaProveedor;
     private FormasPago formadepago;

    public Proveedores() {
    }

    public Proveedores(int idProveedor, String codigoProveedor, List<FormasPago> idpago, String nombreProveedor, String cifProveedor, String telefonoProveedor, String mailProveedor, String cpProveedor, String provinciaProveedor, FormasPago formadepago, int idPago, String formaPago) {
        super(idPago, formaPago);
        this.idProveedor = idProveedor;
        this.codigoProveedor = codigoProveedor;
        this.idpago = idpago;
        this.nombreProveedor = nombreProveedor;
        this.cifProveedor = cifProveedor;
        this.telefonoProveedor = telefonoProveedor;
        this.mailProveedor = mailProveedor;
        this.cpProveedor = cpProveedor;
        this.provinciaProveedor = provinciaProveedor;
        this.formadepago = formadepago;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getCodigoProveedor() {
        return codigoProveedor;
    }

    public void setCodigoProveedor(String codigoProveedor) {
        this.codigoProveedor = codigoProveedor;
    }

    public List<FormasPago> getIdpago() {
        return idpago;
    }

    public void setIdpago(List<FormasPago> idpago) {
        this.idpago = idpago;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getCifProveedor() {
        return cifProveedor;
    }

    public void setCifProveedor(String cifProveedor) {
        this.cifProveedor = cifProveedor;
    }

    public String getTelefonoProveedor() {
        return telefonoProveedor;
    }

    public void setTelefonoProveedor(String telefonoProveedor) {
        this.telefonoProveedor = telefonoProveedor;
    }

    public String getMailProveedor() {
        return mailProveedor;
    }

    public void setMailProveedor(String mailProveedor) {
        this.mailProveedor = mailProveedor;
    }

    public String getCpProveedor() {
        return cpProveedor;
    }

    public void setCpProveedor(String cpProveedor) {
        this.cpProveedor = cpProveedor;
    }

    public String getProvinciaProveedor() {
        return provinciaProveedor;
    }

    public void setProvinciaProveedor(String provinciaProveedor) {
        this.provinciaProveedor = provinciaProveedor;
    }

    public FormasPago getFormadepago() {
        return formadepago;
    }

    public void setFormadepago(FormasPago formadepago) {
        this.formadepago = formadepago;
    }

  

     
     
    
}
