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
public class Lobo extends Canino{
    protected boolean andaEnManada = true;

    public Lobo(int edad, boolean dientes, boolean ladra) {
        super(edad, dientes, ladra);
        this.andaEnManada = andaEnManada;
        
    }

    public boolean isAndaEnManada() {
        return andaEnManada;
    }
    
   
    
}
