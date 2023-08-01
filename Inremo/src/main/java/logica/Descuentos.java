/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author USER
 */
public class Descuentos {
    
    private int idDto;
    private float procentajeDto; 

    public Descuentos() {
    }

    public Descuentos(int idDto, float procentajeDto) {
        this.idDto = idDto;
        this.procentajeDto = procentajeDto;
    }

    public int getIdDto() {
        return idDto;
    }

    public void setIdDto(int idDto) {
        this.idDto = idDto;
    }

    public float getProcentajeDto() {
        return procentajeDto;
    }

    public void setProcentajeDto(float procentajeDto) {
        this.procentajeDto = procentajeDto;
    }
    
    
}
