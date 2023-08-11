/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package logica;

/**
 *
 * @author USER
 */
public class Z1Poo {

    public static void main(String[] args) {
        
        Persona person1 = new Persona(5,"Pedro","Rios");
        vehiculo model1 = new vehiculo(1, "Mercedes", "SL250", "2015");
        
        System.out.println("La id es "+person1.getId());
        System.out.println("El nombre es "+person1.getNombre());
        System.out.println("El apellido es "+person1.getApellido());
        
        System.out.println("El Coche es un "+model1.getMarca());
        
        
    }
}
