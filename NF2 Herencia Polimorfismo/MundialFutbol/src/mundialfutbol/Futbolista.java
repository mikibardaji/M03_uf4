/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundialfutbol;

/**
 *
 * @author 43720186S
 */
public class Futbolista extends EquipFutbol{
    private int num_goles;

    //constructor
    public Futbolista( int id, String nombre, int Edad, int num_goles) {
        super(id, nombre, Edad); //constructor pare
        this.num_goles = num_goles;
    }


    
    
    
    
    public int getNum_goles() {
        return num_goles;
    }

    @Override
    public void Viajar() {
        super.Viajar(); //si quiero llamar al metodo superior siempre tiene que ir en la primera linea
        System.out.println("Viajo en primera clase");
    }
    
    public void jugarPartido()
    {
        System.out.println("Estoy jugando el partido dentro del campo");
    }
    
    
    
    
}
