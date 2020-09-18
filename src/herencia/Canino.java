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
public class Canino extends Mamifero {
    protected boolean ladra = true;
    
    public Canino(int edad, boolean dientes, boolean ladra){
        super(edad, dientes);
        this.ladra=ladra;
    }
    public boolean getLadra() {
        return ladra;
    }
}

