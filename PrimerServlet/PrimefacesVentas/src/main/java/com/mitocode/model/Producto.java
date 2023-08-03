
package com.mitocode.model;

/**
 *
 * @author Pedro Ríos
 */
public class Producto extends detalleventas{
    
    private Integer idProducto;
    private String descripcionProducto;
    private float precioProducto;

    public Producto() {
    }

    public Producto(Integer idProducto, String descripcionProducto, float precioProducto) {
        this.idProducto = idProducto;
        this.descripcionProducto = descripcionProducto;
        this.precioProducto = precioProducto;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public float getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(float precioProducto) {
        this.precioProducto = precioProducto;
    }
    
    
    
}
