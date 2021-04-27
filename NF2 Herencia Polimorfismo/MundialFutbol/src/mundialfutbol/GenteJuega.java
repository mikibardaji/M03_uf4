/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundialfutbol;

/**
 *
 * @author mati
 */
public abstract class GenteJuega extends EquipFutbol {
    protected boolean entreno;
    public GenteJuega(int id, String nombre, int Edad) {
        super(id, nombre, Edad);
        //entreno = entrena;
        entreno = true;
    }
    
    public abstract void entrenar();
}
    
