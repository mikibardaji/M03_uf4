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
public class AplicacionApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         ArrayList<Electrodomesticos> inventario = new ArrayList();
        ElectrodomesticosDAO utilidades = new ElectrodomesticosDAO();
       int opcion;
        do{
            opcion = mostrar_menu();
               
            switch(opcion)
            {
                case 1: //Añadir persona
                    utilidades.AnyadirElectrodomestico(inventario);
                    break;
               case 2: //Mostrar datos persona buscando por nombre
                    utilidades.BorrarElectrodomestico(inventario);
                    break;
                case 3: //eliminarPersona
                    utilidades.listarElectrodomestico(inventario);
                    break;    
                case 4:
                    utilidades.ListarPrecio(inventario);
                    break;
                case 5:
                    utilidades.cambiarPrecio(inventario);
                    break;
                case 0:
                    System.out.println("Saliendo aplicacion ...");
                    break;
                default:
                    System.out.println("opcion incorrecta");
                    break;    
            }
            
        }while(opcion!=0);
        
    }

    private static int mostrar_menu() {
        System.out.println("1. Insertar Electrodoméstico");
        System.out.println("2. Borrar Electrodoméstico"); //bucle para buscar por nombre
        System.out.println("3. Listar Electrodomésticos");
        System.out.println("4. Mostrar Electrodomésticos que no superen el precio");
        System.out.println("5. Cambiar precio Electrodoméstico");
        System.out.println("0.- Salir");
        System.out.print("Pon la opcion: ");
        Scanner teclado = new Scanner(System.in);
        int opcion = teclado.nextInt();
        teclado.nextLine();
        return opcion; 
        //faltaria validar que la opcion fuera correcta
    }
    
}
