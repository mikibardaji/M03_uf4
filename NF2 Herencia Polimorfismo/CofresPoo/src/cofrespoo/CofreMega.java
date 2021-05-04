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
public class CofreMega extends Cofre{

    @Override
    public void abrir_cofre() {
        monedas = 7614;
        Carta escogida;
        int epicas=0;
        for (int i = 0; i < 5; i++) {
            escogida = cartaAleatoria();
            if(epicas>=2)
            {
             System.out.println("añadiendo carta");
             salen.add(escogida);  
            }
            else if (escogida.getTipo() == Tipo_carta.EPICA && (epicas < 2))
            {
            System.out.println("añadiendo carta");
            salen.add(escogida);
            epicas++;
            }
            else
            {
                i--; //porque 
                //esta carta no me vale
            }
        }
    }
    
}
