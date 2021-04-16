/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storeapp2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mati
 */
public class StoreApp2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         ArrayList<Cancion> canciones = new ArrayList();
        CancionDAO utils = new CancionDAO();
        int opcion;
        
        cargarCanciones(canciones);
       
        do {
            System.out.println("\nTotal de canciones dentro: " + canciones.size());
            opcion = menuOpciones();
            System.out.println("");
            switch (opcion) {
                case 1:
                    utils.insertarCancion(canciones);
                    break;
                case 2:
                    utils.borrarCancion(canciones);
                    break;
                case 3:
                    utils.listarCanciones(canciones);
                    break;
                case 4:
                    utils.generarListaDinamica(canciones);
                    break;
                case 5:
                    utils.listarCancionesAlbum(canciones);
                    break;
                case 6:
                    //utils.listarDiferentesAlbums(canciones);
                    break;
                case 0:
                    System.out.println("Saliendo de la aplicación.");
                    break;
                default:
                    System.out.println("Error.");
            }

        } while (opcion != 0);
        
    }

    private static void cargarCanciones(ArrayList<Cancion> Canciones) {
            
        Canciones.add(new Cancion("Mi Agüita Amarilla", "Toreros Muertos","Toreros Muertos por Biafra", 330));
        Canciones.add(new Cancion("Yo no me llamo Javier", "Toreros Muertos", "Toreros Muertos por Biafra", 349));
        Canciones.add(new Cancion("Smells like Teen Spirit", "Nirvana", "Nevermind", 311));
        Canciones.add(new Cancion("Come as You Are", "Nirvana", "Nevermind", 222));
        Canciones.add(new Cancion("In the End", "Linkin Park", "Living Things", 341));
        Canciones.add(new Cancion("ThunderStruck", "AC/DC", "The Razors Edge", 304));
        Canciones.add(new Cancion("Highway to Hell", "AC/DC", "Highway to Hell", 554));
        Canciones.add(new Cancion("Himne del Lleida", "Jordi Gonzalvo", "Grans exits del lleida", 554));
    }
    
 private static int menuOpciones() {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("1. Insertar Canción\n"
                    + "2. Borrar Canción\n"
                    + "3. Listar Canciones\n"
                    + "4. Generar Lista de canciones dinámica para reproducir\n"
                    + "5. Listar canciones de un album\n"
                    + "0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
        } while (opcion < 0 || opcion > 5);
        return opcion;
    }   
    
    
    
}
