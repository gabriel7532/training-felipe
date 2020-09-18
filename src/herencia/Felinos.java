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
public class Felinos extends Mamifero implements Corrible {
    
    private boolean flexibles = true;
    private boolean bigotesGrandes = true;
    
    public Felinos (int edad, boolean dientes, boolean flexibles, boolean bigotesGrandes){
        super(edad, dientes);
        this.flexibles = flexibles;
        this.bigotesGrandes = bigotesGrandes;
        
    }
    public boolean getFlexibles(){

            return flexibles;
     }
    public boolean getBigotesGrandes() {
        return bigotesGrandes;
    }
    
    
    
    public void mostrarCaracteristicas(){
        System.out.println("Edad: " + getEdad()
        + "\nDientes" + getDientes() + "\nFlexibles" + flexibles + "\nBigotes grandes" + bigotesGrandes);
    }

    
}
