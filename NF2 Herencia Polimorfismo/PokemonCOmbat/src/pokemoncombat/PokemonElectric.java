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
public class PokemonElectric extends Pokemon {
    private int potenciador;
    
    public PokemonElectric(String NomPokemon) {
        super(NomPokemon);
        CP=50;
        potenciador =2;
    }
    
        @Override
    public int atac() {
        int ataque= super.atac(); 
        if (ataque<5 && potenciador>0)
        {
            ataque = ataque*2;
            potenciador--;
        }
         System.out.println("ataco con fuerza" + (ataque ));
        return ataque;
        
    }

    @Override
    public void recibirImpacto(Pokemon atacante) {
        int fuerza_ataque = atacante.atac();
            
            
            if(atacante instanceof PokemonAigua)
            {
                fuerza_ataque = (int)((int)fuerza_ataque*0.75);
            }
            CP = CP - fuerza_ataque;
            if (CP<=0)
            {
                viu=false;
                CP=0;
            }
            mostrar_datos_despuesImpacto();
    }
}
