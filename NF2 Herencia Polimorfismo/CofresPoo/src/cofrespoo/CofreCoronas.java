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
public class CofreCoronas extends Cofre{
    private int gemas;
    
    
    @Override
    public void abrir_cofre() {
         System.out.println("Abriendo cofre...");
        monedas = encontrar_monedas(150, 1050);
        Carta escogida;
        for (int i = 0; i < 3; i++) {
            escogida = cartaAleatoria();
            System.out.println("añadiendo carta");
            salen.add(escogida);
        }
        
        gemas = (int) (Math.random() * 5) + 1;
    }

    @Override
    public void mostrar_cofre() {
        super.mostrar_cofre();
        System.out.println("gemas " + this.gemas);
    }
    
    
    
    
}
