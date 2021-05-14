/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemoncombat;

/**
 *
 * @author mati
 */
public class PokemonVeri extends Pokemon {
    private boolean veri;
    public PokemonVeri(String NomPokemon) {
        super(NomPokemon);
        CP=40;
        veri=true;
    }
    
    @Override
    public int atac() {
        int ataque= super.atac(); 
         System.out.println("ataco con fuerza" + (ataque +1));
        return ataque+1;
    }

    @Override
    public void recibirImpacto(Pokemon atacante) {
      int fuerza_ataque = atacante.atac();
            
            
            if(atacante instanceof PokemonElectric)
            {
                fuerza_ataque = (int)(fuerza_ataque*0.75);
            }
            fuerza_ataque = fuerza_ataque/2;
            CP = CP - fuerza_ataque;
            if (CP<=0)
            {
                viu=false;
                CP=0;
            }
            mostrar_datos_despuesImpacto();
    }
}
