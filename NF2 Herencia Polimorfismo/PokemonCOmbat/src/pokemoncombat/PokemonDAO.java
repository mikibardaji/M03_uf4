/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemoncombat;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mati
 */
public class PokemonDAO implements OperacionsBasiques{

    @Override
    public void AfegirPokemon(ArrayList<Pokemon> gimnasio) {
       Scanner sc = new Scanner(System.in); //codi profesor
        System.out.println("Pon el nombre del pokemon");//codi profesor
        String nombre = sc.nextLine();//codi profesor
        System.out.println("Pon el tipo de pokemon (Electric/Agua/Veri");//codi profesor
        String tipus = sc.nextLine();//codi profesor
        Pokemon afegir=null;
        if (tipus.equalsIgnoreCase("Electric"))
        {
           afegir = new PokemonElectric(nombre);
        }
        else if (tipus.equalsIgnoreCase("Agua"))
        {
            afegir = new PokemonAigua(nombre);
        }
        else if (tipus.equalsIgnoreCase("Veri"))
          {
           afegir = new PokemonVeri(nombre);
        }
       
        if (gimnasio.contains(afegir))
        {
         System.out.println("ya existe pokemon");
        }
        else
        {
            gimnasio.add(afegir);
            System.out.println("pokemons" + gimnasio.size());
        }
        
        //afegir el pokemon al gimnas
        //mostrar que s'ha insertat i quants pokemons existeixen
        
        
        
        
        
        
        
        
        
        
        
    }

    @Override
    public void LlistarPokemons(ArrayList gimnasio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mostrarPokemonsVius(ArrayList<Pokemon> gimnasio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Combat(ArrayList<Pokemon> gimnasio) {
         Scanner sc = new Scanner(System.in); //codi profesor
       int posPokemon1 , posPokemon2;
       do{
        System.out.println("Pon la posición del primer pokemon");//codi profesor
        posPokemon1 = sc.nextInt();//codi profesor
         System.out.println("Pon la posición del segundo pokemon");//codi profesor
         posPokemon2 = sc.nextInt();//codi profesor
       }while (posPokemon1<0 || posPokemon1>gimnasio.size() || posPokemon2<0 || posPokemon2>gimnasio.size()  );
       
       
       do
       { //lucha hasta que alguno este muerto el primero recibe el impacto y despues lo recibe el 2
           gimnasio.get(posPokemon1).recibirImpacto(gimnasio.get(posPokemon2));
           if (gimnasio.get(posPokemon1).isViu()) //aun esta vivo ahora taca el 1
           {
               gimnasio.get(posPokemon2).recibirImpacto(gimnasio.get(posPokemon1));
           }
       }while(gimnasio.get(posPokemon1).isViu() && gimnasio.get(posPokemon2).isViu() );
       if (gimnasio.get(posPokemon1).isViu())
       {
           System.out.println(gimnasio.get(posPokemon1).getNomPokemon() + " gano el combate");
       }
       else
       {
         System.out.println(gimnasio.get(posPokemon2).getNomPokemon() + " gano el combate");  
       }
    }
    
}
