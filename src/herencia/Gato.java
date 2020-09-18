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
public class Gato extends Felinos {
    protected boolean domestico = true;
    
    public Gato (int edad, boolean dientes, boolean flexible, boolean bigotesGrandes, boolean domestico ){
        super(edad, dientes, flexible, bigotesGrandes);
        this.domestico = domestico;
    }
    public boolean getDomestico(){
        return domestico;
    }
    
}
