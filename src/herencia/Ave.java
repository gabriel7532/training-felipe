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
public class Ave extends Oviparo{
    protected boolean vuela = true;    
    
    public Ave (boolean poneHuevos, boolean vuela){
        super(poneHuevos);
    this.vuela = vuela;

}


}