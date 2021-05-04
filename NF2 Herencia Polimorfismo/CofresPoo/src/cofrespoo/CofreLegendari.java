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
public class CofreLegendari extends Cofre{

    @Override
    public void abrir_cofre() {
        Carta escogida;
        do{
            escogida = cartaAleatoria();
          
        }while(escogida.tipo!= Tipo_carta.LEGENDARIA);
        salen.add(escogida);
    }
    
}
