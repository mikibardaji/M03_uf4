/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cofrespoo;

/**
 *
 * @author mati
 */
public class CofreOr extends Cofre{

    @Override
    public void abrir_cofre() {
        System.out.println("Abriendo cofre...");
        monedas = encontrar_monedas(60, 420);
        Carta escogida;
        for (int i = 0; i < 3; i++) {
            escogida = cartaAleatoria();
            System.out.println("añadiendo carta");
            salen.add(escogida);
        }
    }
    
}
