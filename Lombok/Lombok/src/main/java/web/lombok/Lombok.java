/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package web.lombok;

/**
 *
 * @author USER
 */
public class Lombok {

    public static void main(String[] args) {
       
        Personas person1 = new Personas(2, "Jack", "Jack@jotamail.com");
        PersonaLombok lom1 = new PersonaLombok(4,"Miriam","Indochina");
        
        System.out.println("Esta Clase Persona "+person1.getId_persona()+" "+person1.getNombre()+" "+person1.getEmail());
        System.out.println("Esta Clase es Lombok "+lom1.getId_lompok()+" "+lom1.getNom_lombok()+" "+lom1.getPais());
        
    }
}
