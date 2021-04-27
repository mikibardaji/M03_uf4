/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundialfutbol;

import java.util.ArrayList;

/**
 *
 * @author 43720186S
 */
public class MundialFutbol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //
        
        Futbolista jug1 = new Futbolista(1, "Messi", 34, 700);
        Futbolista jug2 = new Futbolista(2, "Pedri", 25, 700);
        Entrenador ent1 = new Entrenador(3, "Koeman", 50);
        Masajista mas1 = new Masajista(4, "Paco", 100, "deportivo");
        Presidente pres = new Presidente(5, "Laporta", 70, 8);
        ArrayList<EquipFutbol> convocados = new ArrayList<>();
        
        convocados.add(jug1);
        convocados.add(jug2);
        convocados.add(ent1);
        convocados.add(mas1);
        convocados.add(pres);
        //dia antes del partido
        for (int i = 0; i < convocados.size(); i++) {
            convocados.get(i).Viajar();
            convocados.get(i).Concentrarse();
        }
        System.out.println("****dia del partido ***");
        //dia partido
        for (int i = 0; i < convocados.size(); i++) {
            if (convocados.get(i) instanceof Futbolista)
            {
               Futbolista aux = (Futbolista) convocados.get(i);
               aux.jugarPartido(2);
            }
             if (convocados.get(i) instanceof Entrenador)
            {
               Entrenador aux = (Entrenador) convocados.get(i);
               aux.dirigirPartido();
            }
            if (convocados.get(i) instanceof Presidente)
            {
               Presidente aux = (Presidente) convocados.get(i);
               aux.palco(); 
            }
            if (convocados.get(i) instanceof Masajista)
            {
               Masajista aux = (Masajista) convocados.get(i);
               aux.dar_masaje();
            }
            System.out.println("Por este dia cobro " + convocados.get(i).getSalary());
            
        }
        System.out.println("****dia despues del partido ***");
        //dia despues del partido
        for (int i = 0; i < convocados.size(); i++) {
            if (!(convocados.get(i) instanceof Presidente))
            {
                pres.tratar_contrato(convocados.get(i));
            }
            
            
        }
        
       // EquipFutbol ejemplo = new EquipFutbol(10, "nombre", 10);
    }
    
}
