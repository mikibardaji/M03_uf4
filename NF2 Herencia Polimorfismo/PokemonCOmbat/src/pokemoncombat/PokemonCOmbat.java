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
public class PokemonCOmbat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Pokemon> gimmnasio=new ArrayList<Pokemon>();
        PokemonDAO utils = new PokemonDAO();
        int opcion;
         do {
            //mostrar el nombre del jugador
            System.out.println("Elige cofre a abrid");
            opcion = mostrar_opciones_menu();
            switch (opcion) {
                    case 1:
                        utils.AfegirPokemon(gimmnasio);
                    break;
                    case 2:
                        utils.LlistarPokemons(gimmnasio);
                    break;
                    case 3:
                    
                    break;
                    case 4:
                        utils.Combat(gimmnasio);
                    break;
                    default:
                    System.out.println("Opción incorrecta");
                    break;
            }
    }while(opcion!=0);
        
    }

    private static int mostrar_opciones_menu() {
        int opcion;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1.-Afegir Pokemon");
            System.out.println("2.-Llistar Pokemons");
            System.out.println("3.-Llistar Pokemons vius");
            System.out.println("4.-Combat Pokemon");
            System.out.println("0.-Sortir");
            System.out.print("Pon opcion: ");
            opcion = sc.nextInt();
        } while (opcion < 0 || opcion > 4);

        return opcion;

    }
    
}
