/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storeapp2;

import java.util.Objects;

/**
 *
 * @author mati
 */
public class Cancion {
    private String titulo;
    private String interprete;
    private String album;
    private int duracion;
    //
    public Cancion() { // Sin informar nada de entrada(donde se informará todos los strings a blanco
        this.titulo = "";
        this.interprete = "";
        this.album = "";
    }

    public Cancion(String titulo, String interprete) { // Informando el nombre y el autor
        this.titulo = titulo;
        this.interprete = interprete;
        this.album = "";
    }

    public Cancion(String titulo, String interprete, String album, int duracion) { // informando todos sus valores 
        this.titulo = titulo;
        this.interprete = interprete;
        this.album = album;
        this.setDuracion(duracion);
    }
    
    public void setTitulo(String titulo) { // Se tiene que cumplir el principio de encapsulación con los métodos de acceso para los atributos.
        this.titulo = titulo;
    }

    public void setInterprete(String interprete) {
        this.interprete = interprete;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public void setDuracion(int duracion) {
        if (duracion>0)
        {
            this.duracion = duracion;
        }
        else
        {
            this.duracion = 0;
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public String getInterprete() {
        return interprete;
    }

    public String getAlbum() {
        return album;
    }

    public int getDuracion() {
        return duracion;
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
        final Cancion other = (Cancion) obj;
        if (!this.titulo.equalsIgnoreCase(other.titulo)) {
            return false;
        }
        if (!this.interprete.equalsIgnoreCase(other.interprete)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "->" + "titulo=" + titulo + ", interprete=" + interprete + ", album=" + album + ", duracion=" + duracion + '}';
    }

    
}
