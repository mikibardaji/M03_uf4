/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cofrespoo;

import java.util.ArrayList;

/**
 *
 * @author mati
 */
public abstract class Cofre {
    protected int monedas;
    protected ArrayList<Carta> salen; //cartas que salen en el cofre
    protected ArrayList<Carta> disponibles; //todas las cartas del juego

    public Cofre() {
        //inicializar variables que no son primitivas
        salen = new ArrayList<>();
        disponibles = new ArrayList<>();
        cargar_disponibles(); //cargamos a mano todas las cartas

    }
    
    
    
    public void mostrar_cofre()
    {
        System.out.println("mostrando cofre********** ");
        System.out.println("Monedas del cofre: " + monedas);
        System.out.println("te han tocado...");
        for (int i = 0; i < salen.size(); i++) {
            System.out.println(salen.get(i).toString());
        }
       
    }

    
    /**
     * metodo que dara monedas y cartas segun
     * el tipo
     */
    public abstract void abrir_cofre();
    
    
        /**
     * 
     * @param quantitat_numeros numeros diferents que pot donar el aleatori
     * @param inici es el numero mínim que donara aquest aleatori
     * @return 
     */
    protected static int encontrar_monedas(int quantitat_numeros, int inici) {
        int monedas = (int) (Math.random() * quantitat_numeros) + inici;
        
        return monedas;
    }
    
    /**
     * 
     * retorna una carta aleatoria de las disponibles, con un numero de puntos 
    de carta informad
    
     * @param disponibles todas las posibles
     * @return objeto carta informado nombre, elixir y puntos carta (level no)
     */
    
    protected Carta cartaAleatoria() {

        int random = (int) (Math.random() * disponibles.size());
        int puntos = (int) (Math.random() * 19) + 1;

        Carta cartaAleatoria = new Carta(disponibles.get(random).getNombre(), puntos, disponibles.get(random).getTipo());
        
        System.out.println("la carta nueva es " + cartaAleatoria.nombre + "\ntiene " + puntos + " puntos");

        return cartaAleatoria;

    }
    
    

    private void cargar_disponibles() {
        Carta nueva = new Carta("Pekka", 7, Tipo_carta.EPICA);
        disponibles.add(nueva);
        nueva = new Carta("Mini Pekka", 4, Tipo_carta.RARA);
        disponibles.add(nueva);
        nueva = new Carta("Leñador", 4, Tipo_carta.LEGENDARIA);
        disponibles.add(nueva);
        
        nueva = new Carta("Descarga", 2, Tipo_carta.COMUN);
        disponibles.add(nueva);
        
    }
    
    
    
}
