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
public class Salmon extends Pez {
    protected boolean rio = true;

    public Salmon(boolean poneHuevos, boolean nada) {
        super(poneHuevos, nada);
    }

    public boolean isRio() {
        return rio;
    }
    
    
}
