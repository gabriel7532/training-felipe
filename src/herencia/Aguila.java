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
public class Aguila extends Ave {
    protected boolean picoGrande = true;

    public Aguila(boolean poneHuevos, boolean vuela) {
        super(poneHuevos, vuela);
    }

    public boolean getPicoGrande() {
        return picoGrande;
    }
    
    
    
}
