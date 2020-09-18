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
public class perro extends Canino{
    protected boolean olfatoFuerte = true;
    
    public perro(int edad, boolean dientes, boolean ladra, boolean olfatoFuerte){
        super (edad, dientes, ladra);
        this.olfatoFuerte = olfatoFuerte;
                
    }
    public boolean getOlfatoFuerte(){
        return olfatoFuerte;
    }
}
