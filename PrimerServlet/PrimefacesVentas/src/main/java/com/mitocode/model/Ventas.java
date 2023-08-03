
package com.mitocode.model;

import java.util.Date;

/**
 *
 * @author Pedro Ríos
 */
public class Ventas extends Persona{
    
    private Integer idVentas;
    private Date fechaVentas;
    private Persona IdPersona;
    private float canticad;

    public Ventas() {
    }

    public Ventas(Integer idVentas, Date fechaVentas, Persona IdPersona, float canticad, Integer Idpersona, String nombrePersona, String apellidoPersona, String movilPersona, String direccionPersona, String cpPersona, String poblacionPersona, String provinciaPersona) {
        super(Idpersona, nombrePersona, apellidoPersona, movilPersona, direccionPersona, cpPersona, poblacionPersona, provinciaPersona);
        this.idVentas = idVentas;
        this.fechaVentas = fechaVentas;
        this.IdPersona = IdPersona;
        this.canticad = canticad;
    }

    public Integer getIdVentas() {
        return idVentas;
    }

    public void setIdVentas(Integer idVentas) {
        this.idVentas = idVentas;
    }

    public Date getFechaVentas() {
        return fechaVentas;
    }

    public void setFechaVentas(Date fechaVentas) {
        this.fechaVentas = fechaVentas;
    }

    public Persona getIdPersona() {
        return IdPersona;
    }

    public void setIdPersona(Persona IdPersona) {
        this.IdPersona = IdPersona;
    }

    public float getCanticad() {
        return canticad;
    }

    public void setCanticad(float canticad) {
        this.canticad = canticad;
    }
    
    
    
}
