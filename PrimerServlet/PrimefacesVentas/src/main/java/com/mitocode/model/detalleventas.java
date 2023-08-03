
package com.mitocode.model;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Pedro Ríos
 */
public class detalleventas extends Ventas{
    
    private Integer idDetalleVentas;
    private Ventas idVentas;
    private List<Producto>listaProductos;

    public detalleventas() {
    }

    public detalleventas(Integer idDetalleVentas, Ventas idVentas, List<Producto> listaProductos, Integer idVentas, Date fechaVentas, Persona IdPersona, float canticad, Integer Idpersona, String nombrePersona, String apellidoPersona, String movilPersona, String direccionPersona, String cpPersona, String poblacionPersona, String provinciaPersona) {
        super(idVentas, fechaVentas, IdPersona, canticad, Idpersona, nombrePersona, apellidoPersona, movilPersona, direccionPersona, cpPersona, poblacionPersona, provinciaPersona);
        this.idDetalleVentas = idDetalleVentas;
        this.idVentas = idVentas;
        this.listaProductos = listaProductos;
    }

   
    
}
R10