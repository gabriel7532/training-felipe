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
public class Tigre extends Felinos {
    protected boolean salvaje = true;
    
    public Tigre (int edad, boolean dientes, boolean flexibles, boolean bigotesGrandes, boolean salvaje){
        super(edad , dientes, flexibles, bigotesGrandes);
        this.salvaje = salvaje;
    }
    
    public boolean getSalvaje(){
        return salvaje;
    }
    
}
