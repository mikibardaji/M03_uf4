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
public class MundialFutbol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Futbolista messi = new Futbolista(1, "Messi", 34, 700);
        System.out.println("nombre " + messi.getNombre());
        System.out.println("edat " + messi.getEdad());
        System.out.println("goles " + messi.getNum_goles());
        messi.Viajar();
        messi.jugarPartido();
        Entrenador Koeman = new Entrenador(2, "Koeman", 50);
        Koeman.setTiene_titulo(true);
        System.out.println("nombre " + Koeman.getNombre());
        System.out.println("edat " + Koeman.getEdad());
        System.out.println("Tiene titulo " + Koeman.isTiene_titulo());
        Koeman.Viajar();
        Koeman.dirigirPartido();
        
        EquipFutbol aux = new EquipFutbol(3,"pepe",24);
        
        aux.Viajar();
    }
    
}
