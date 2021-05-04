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
public class Carta {
    String nombre;
    int elixir;
    int level;
    int puntos_carta;
    Tipo_carta tipo;
    int arena;
    //String tipo

    public Carta(String nombre, int elixir, Tipo_carta tipo) {
        this.nombre = nombre;
        this.elixir = elixir;
        this.tipo = tipo;
        level = 0;
        puntos_carta = 0;
        arena = 1;
    }

    @Override
    public String toString() {
        return "Carta{" + "nombre=" + nombre + ", elixir=" + elixir + ", level=" + level + ", puntos_carta=" + puntos_carta + ", tipo=" + tipo + ", arena=" + arena + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public int getElixir() {
        return elixir;
    }

    public int getLevel() {
        return level;
    }

    public int getPuntos_carta() {
        return puntos_carta;
    }

    public Tipo_carta getTipo() {
        return tipo;
    }

    public int getArena() {
        return arena;
    }
    
    
    
}


