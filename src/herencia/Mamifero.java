/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author J
 */
public class Mamifero {
  protected int edad;
  protected boolean dientes = true;
    
           public Mamifero(int edad, boolean dientes){
               this.edad = edad;
               this.dientes = dientes;
               
           }
           public int getEdad (){
               return edad;
           }
           
           public boolean getDientes() {
               return dientes;
           }
}
