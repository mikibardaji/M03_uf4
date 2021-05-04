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
public class CofreArgent extends Cofre{

    @Override
    public void abrir_cofre() {
        System.out.println("Abriendo cofre...");
        //se guardan en su atributo de monedas
        monedas = encontrar_monedas(15, 105);
        Carta escogida;
        for (int i = 0; i < 2; i++) {
            escogida = cartaAleatoria();
            System.out.println("añadiendo carta");
            salen.add(escogida);
        }
    }
    
    

}
