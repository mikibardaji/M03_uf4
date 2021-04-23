/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionapp;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 43720186S
 */
public class ElectrodomesticosDAO {

    void AnyadirElectrodomestico(ArrayList<Electrodomesticos> inventario) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon el nombre ");
        String nombre = sc.nextLine();
    
        System.out.println("Pon el consumo energetico");
        char consumo_energetico = sc.nextLine().charAt(0);
 
        Electrodomesticos anyadir = new Electrodomesticos(nombre, 0, consumo_energetico);
        if (inventario.contains(anyadir))
        {
            System.out.println("Electrodomestico existente");
        }
        else
        {
            //afegir
            System.out.println("Pon el color ");
            String color = sc.nextLine();
    
            System.out.println("Pon el precio");
            double precio = sc.nextDouble();
            Electrodomesticos afegir = new Electrodomesticos(nombre, precio, color, consumo_energetico);
            inventario.add(afegir);
            System.out.println("electrodomesticos " + inventario.size());
        }
        
    }

    void BorrarElectrodomestico(ArrayList<Electrodomesticos> inventario) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Pon el nombre ");
        String nombre = sc.nextLine();
    
        System.out.println("Pon el consumo energetico");
        char consumo_energetico = sc.nextLine().charAt(0);
 
        Electrodomesticos borrar = new Electrodomesticos(nombre, 0, consumo_energetico);
        if(inventario.remove(borrar))
        {
            System.out.println("Electrodomesticos borrado");
        }
        else
        {
            System.out.println("Electrodomesticos no borrado");
        }
        
    }

    void listarElectrodomestico(ArrayList<Electrodomesticos> inventario) {
        for (int i = 0; i < inventario.size(); i++) {
            System.out.println("Electrodomestico" + (i+1) + "-" + inventario.get(i).toString());  
        }
        System.out.println("numero de electrodomestico:" + inventario.size() );
    }

    void ListarPrecio(ArrayList<Electrodomesticos> inventario) {
          Scanner sc = new Scanner(System.in);
                    System.out.println("Pon el precio a filtrar");
            double precio = sc.nextDouble();
            int contador=0;
            for (int i = 0;  i < inventario.size(); i++) {
                if(inventario.get(i).precio_final()<precio)
                {
                     System.out.println("Electrodomestico-" + inventario.get(i).toString());  
                     contador++;
                }
            
        }
            System.out.println("numero de electrodomestico mostrados:" + contador );
    }

    void cambiarPrecio(ArrayList<Electrodomesticos> inventario) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Pon el nombre ");
        String nombre = sc.nextLine();
    
        System.out.println("Pon el consumo energetico");
        char consumo_energetico = sc.nextLine().charAt(0);
 
        Electrodomesticos buscar = new Electrodomesticos(nombre, 0, consumo_energetico);
        int posicion = inventario.indexOf(buscar);
        if(posicion==-1) //no existe 
        {
            System.out.println("no existe electromestico");
        }
        else
        {
                    System.out.println("Pon el nuevo precio ");
                  double precio = sc.nextDouble();
                  inventario.get(posicion).setPrecio_base(precio);
                  System.out.println("precio cambiado");
                  System.out.println("->" + inventario.get(posicion).toString());
        }
    }
    
}
