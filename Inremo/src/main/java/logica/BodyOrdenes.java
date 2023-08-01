
package logica;

import java.util.Date;
import java.util.List;

/**
 *
 * @author USER
 */
public class BodyOrdenes extends HeadOrdenes{
    
    private int idLineasOrden;
    private HeadOrdenes unidOrdentrabajo;
    private Articulos idArticulos;    
    private int idproveedor;
    private String nombreArticulo;
    private int cantidad;
    private float dtoArticulo;
    private float totalLineaArticulo;

    public BodyOrdenes() {
    }

    public BodyOrdenes(int idLineasOrden, HeadOrdenes unidOrdentrabajo, Articulos idArticulos, int idproveedor, String nombreArticulo, int cantidad, float dtoArticulo, float totalLineaArticulo, int idOrdentrabajo, int idOperatio, int idCliente, String nombreOperario, String nombreCliente, String telefonoCliente, Date fechaOrden, String direccionOrden, String cpOrden, String poblacionOrden, List<Clientes> listaClienteses, List<Operarios> listaOperario) {
        super(idOrdentrabajo, idOperatio, idCliente, nombreOperario, nombreCliente, telefonoCliente, fechaOrden, direccionOrden, cpOrden, poblacionOrden, listaClienteses, listaOperario);
        this.idLineasOrden = idLineasOrden;
        this.unidOrdentrabajo = unidOrdentrabajo;
        this.idArticulos = idArticulos;
        this.idproveedor = idproveedor;
        this.nombreArticulo = nombreArticulo;
        this.cantidad = cantidad;
        this.dtoArticulo = dtoArticulo;
        this.totalLineaArticulo = totalLineaArticulo;
    }

   

    public int getIdLineasOrden() {
        return idLineasOrden;
    }

    public void setIdLineasOrden(int idLineasOrden) {
        this.idLineasOrden = idLineasOrden;
    }

    public int getIdproveedor() {
        return idproveedor;
    }

    public void setIdproveedor(int idproveedor) {
        this.idproveedor = idproveedor;
    }

    public String getNombreArticulo() {
        return nombreArticulo;
    }

    public void setNombreArticulo(String nombreArticulo) {
        this.nombreArticulo = nombreArticulo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getDtoArticulo() {
        return dtoArticulo;
    }

    public void setDtoArticulo(float dtoArticulo) {
        this.dtoArticulo = dtoArticulo;
    }

    public float getTotalLineaArticulo() {
        return totalLineaArticulo;
    }

    public void setTotalLineaArticulo(float totalLineaArticulo) {
        this.totalLineaArticulo = totalLineaArticulo;
    }
    
    
    
    
}
