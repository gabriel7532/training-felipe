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
public class Trucha extends Pez {
    protected boolean estanque = true;

    public Trucha(boolean poneHuevos, boolean nada) {
        super(poneHuevos, nada);
    }

    public boolean getEstanquie() {
        return estanque;
    }
    
}
