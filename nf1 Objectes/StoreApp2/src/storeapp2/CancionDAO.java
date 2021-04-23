/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storeapp2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mati
 */
public class CancionDAO {
/*clase es para interaccion con el objeto cancion y con el main*/
    

    void insertarCancion(ArrayList<Cancion> canciones) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre de la canción: ");
        String titulo = sc.nextLine();

        System.out.print("Nombre del autor: ");
        String autor = sc.nextLine();
        Cancion afegir = new Cancion(titulo, autor);
        
        //substitueix el for  get(i).getTitulo
        if (canciones.contains(afegir))
        { System.out.println("ya existe la cancion"); }
        else
        {
            System.out.print("Nombre del album: ");
            String album = sc.nextLine();

            System.out.print("Duración de la canción: ");
            int duracion = sc.nextInt();
            
            afegir.setAlbum(album);
            afegir.setDuracion(duracion);
            canciones.add(afegir);
        }
    }

    void borrarCancion(ArrayList<Cancion> canciones) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre de la canción a borrar: ");
        String titulo = sc.nextLine();

        System.out.print("Nombre del autor: ");
        String autor = sc.nextLine();
        Cancion borrar = new Cancion(titulo, autor);
        
        //podria hacer con un for
        //posicion por posicon con get(i)
        //getTitulo y GetInterprete
        if (canciones.remove(borrar))
        {
            System.out.println("Cancion borrada");
            System.out.println(borrar.toString());
            System.out.println("Canciones restantes" + canciones.size());
        }
        else
        {
            System.out.println("No existe la canción");
        }
        
        
        
    }

    void listarCanciones(ArrayList<Cancion> canciones) {
        //System.out.println(canciones.toString());
        for (int i = 0; i < canciones.size(); i++) {
            System.out.println("Cancion " + (i+1) + "- " + canciones.get(i).toString());
            
        }
    }

    void listarCancionesAlbum(ArrayList<Cancion> canciones) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Pon el titulo del album: ");
        String album_buscado = sc.nextLine();
        boolean existe = false;
        
        for (int i = 0; i < canciones.size(); i++) 
        {
            if (canciones.get(i).getAlbum().equalsIgnoreCase(album_buscado))
            {
             System.out.println(canciones.get(i).toString());
            existe = true;
            }
        }
        
        if (!existe)
        {
            System.out.println("No hay canciones de este album");
        }

    }

    void generarListaDinamica(ArrayList<Cancion> canciones) {
        ArrayList<Cancion> aleatoria = new ArrayList<>();
        int pos_cancion;
        Random r = new Random();
        for (int i = 0; i < 3; i++) {
            pos_cancion = (int) r.nextInt(canciones.size());
            System.out.println("Cancion random" + pos_cancion);
            if (!aleatoria.contains(canciones.get(pos_cancion)))
            {
                aleatoria.add(canciones.get(pos_cancion));
            }
            else
            {
                i = i-1;
            }
   
        }
        System.out.println("las 3 elegidas");
        System.out.println(aleatoria.toString());
        
    }
    
}

