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
public class PokemonAigua extends Pokemon {
    private int corassa;
    public PokemonAigua(String NomPokemon) {
        super(NomPokemon);
        CP = 45;
        corassa=2;
    }

    @Override
    public int atac() {
        int ataque= super.atac(); 
        System.out.println("ataco con fuerza" + (ataque +2));
        return ataque+2;
    }

    @Override
    public void recibirImpacto(Pokemon atacante) {
        if (corassa>0)
        {
            System.out.println("no recibo impacto" + this.getNomPokemon());
            corassa--;
        }
        else
        {
            int fuerza_ataque = atacante.atac();
            
            
            if(atacante instanceof PokemonVeri)
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
    
    
    
}
