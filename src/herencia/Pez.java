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
public class Pez extends Oviparo{
    protected boolean nada = true;
    
    public Pez (boolean poneHuevos, boolean nada){
        super(poneHuevos);
        
    }
    
    public boolean getNada(){
        return nada;
    }
}
