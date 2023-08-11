/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 *
 * @author USER
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class vehiculo {
    
    @Id
    private int id_vehiculo;
    private String marca;
    private String modelo;
    private String matriculacion;
    
}
