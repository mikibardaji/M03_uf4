/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemoncombat;

import java.util.Objects;

/**
 *
 * @author mati
 */
public abstract class Pokemon {
    private String NomPokemon;
    protected int CP;
    protected boolean viu;

    public Pokemon(String NomPokemon) {
        this.NomPokemon = NomPokemon;
        viu = true;
    }

    
    
    
    public void setNomPokemon(String NomPokemon) {
        this.NomPokemon = NomPokemon;
    }

    public String getNomPokemon() {
        return NomPokemon;
    }

    public int getCP() {
        return CP;
    }

    public boolean isViu() {
        return viu;
    }

    
    
    @Override
    public String toString() {
        return "Pokemon-> " + "NomPokemon=" + NomPokemon + ", CP=" + CP + '}';
    }

    public int atac()
    {
        return (int) Math.random()*10 +1;
    }
    
    public abstract void recibirImpacto(Pokemon atacante);
    
    protected void mostrar_datos_despuesImpacto()
    {
        System.out.print(NomPokemon+ "he recibido impacto tengo de vida " + CP);
        if (viu)
        {
            System.out.println(" Estoy Vivo");
        }
        else
        {
            System.out.println(" Estoy muerto");
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pokemon other = (Pokemon) obj;
        if (!this.NomPokemon.equalsIgnoreCase(other.NomPokemon)) {
            return false;
        }
        return true;
    }
    
    
}
