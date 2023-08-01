

package logica;

import java.util.List;

/**
 *
 * @author USER
 */
public class Articulos {
    
    private int idArticulo;
    private int idproveedor;
    private String codigoProvedor;
    private String codigoArticulo;
    private String descripcionArticulo;
    private float  precioCompra;
    private float dtoArticulo;
    private float idIva;
    private float ivaCompraArticulo;
    private float precioVentaArticulo;
    private List<Descuentos> idDto;
    private List<Iva>idIvas;

    public Articulos() {
    }

    public Articulos(int idArticulo, int idproveedor, String codigoProvedor, String codigoArticulo, String descripcionArticulo, float precioCompra, float dtoArticulo, float idIva, float ivaCompraArticulo, float precioVentaArticulo, List<Descuentos> idDto, List<Iva> idIvas) {
        this.idArticulo = idArticulo;
        this.idproveedor = idproveedor;
        this.codigoProvedor = codigoProvedor;
        this.codigoArticulo = codigoArticulo;
        this.descripcionArticulo = descripcionArticulo;
        this.precioCompra = precioCompra;
        this.dtoArticulo = dtoArticulo;
        this.idIva = idIva;
        this.ivaCompraArticulo = ivaCompraArticulo;
        this.precioVentaArticulo = precioVentaArticulo;
        this.idDto = idDto;
        this.idIvas = idIvas;
    }

    public List<Iva> getIdIvas() {
        return idIvas;
    }

    public void setIdIvas(List<Iva> idIvas) {
        this.idIvas = idIvas;
    }

    
    public List<Descuentos> getIdDto() {
        return idDto;
    }

    public void setIdDto(List<Descuentos> idDto) {
        this.idDto = idDto;
    }

   

    public int getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }

    public int getIdproveedor() {
        return idproveedor;
    }

    public void setIdproveedor(int idproveedor) {
        this.idproveedor = idproveedor;
    }

    public String getCodigoProvedor() {
        return codigoProvedor;
    }

    public void setCodigoProvedor(String codigoProvedor) {
        this.codigoProvedor = codigoProvedor;
    }

    public String getCodigoArticulo() {
        return codigoArticulo;
    }

    public void setCodigoArticulo(String codigoArticulo) {
        this.codigoArticulo = codigoArticulo;
    }

    public String getDescripcionArticulo() {
        return descripcionArticulo;
    }

    public void setDescripcionArticulo(String descripcionArticulo) {
        this.descripcionArticulo = descripcionArticulo;
    }

    public float getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(float precioCompra) {
        this.precioCompra = precioCompra;
    }

    public float getDtoArticulo() {
        return dtoArticulo;
    }

    public void setDtoArticulo(float dtoArticulo) {
        this.dtoArticulo = dtoArticulo;
    }

    public float getIdIva() {
        return idIva;
    }

    public void setIdIva(float idIva) {
        this.idIva = idIva;
    }

    public float getIvaCompraArticulo() {
        return ivaCompraArticulo;
    }

    public void setIvaCompraArticulo(float ivaCompraArticulo) {
        this.ivaCompraArticulo = ivaCompraArticulo;
    }

    public float getPrecioVentaArticulo() {
        return precioVentaArticulo;
    }

    public void setPrecioVentaArticulo(float precioVentaArticulo) {
        this.precioVentaArticulo = precioVentaArticulo;
    }
    
    
    
    
    
    
    
    
}
