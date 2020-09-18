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
public class Oviparo {
    protected boolean poneHuevos = true;
    
    public Oviparo (boolean poneHuevos){
        this.poneHuevos = poneHuevos;
        
    }
    public boolean getPoneHevos(){
        return poneHuevos;
    }
}
