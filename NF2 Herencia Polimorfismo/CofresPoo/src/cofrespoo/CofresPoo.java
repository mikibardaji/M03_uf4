/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cofrespoo;

import java.util.Scanner;

/**
 *
 * @author mati
 */
public class CofresPoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int opcion;
        
        
        
        do {
            //mostrar el nombre del jugador
            System.out.println("Elige cofre a abrid");
            opcion = mostrar_opciones_menu();
            switch (opcion) {
                case 1:
                    abrir_cofre_plata();
                    break;
                    case 2:
                    abrir_cofre_or();
                    break;
                    case 3:
                    abrir_cofre_coronas();
                    break;
                    case 4:
                    abrir_cofre_mega();
                    break;
                    case 5:
                    abrir_cofre_legendario();
                    break;
            }
    }while(opcion!=0);
        
    }
    
        private static int mostrar_opciones_menu() {
        int opcion;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1.-Cofre de plata");
            System.out.println("2.- Cofre d'or");
            System.out.println("3.- Cofre de corones");
            System.out.println("4.-Cofre Mega\n"
                    + "5.-Cofre Legendari\n"
                    + "6.- Cofre aleatori\n"
                    + "0. Sortir");
            System.out.print("Pon opcion: ");
            opcion = sc.nextInt();
        } while (opcion < 0 || opcion > 6);

        return opcion;

    }

    private static void abrir_cofre_plata() {
        CofreArgent cofre = new CofreArgent();
        cofre.abrir_cofre();
        cofre.mostrar_cofre();
    }

    private static void abrir_cofre_or() {
         CofreOr cofre = new CofreOr();
        cofre.abrir_cofre();
        cofre.mostrar_cofre();
    }

    private static void abrir_cofre_coronas() {
        CofreCoronas cofre = new CofreCoronas();
        cofre.abrir_cofre();
        cofre.mostrar_cofre();
    }

    private static void abrir_cofre_mega() {
        CofreMega cofre = new CofreMega();
        cofre.abrir_cofre();
        cofre.mostrar_cofre();
    }

    private static void abrir_cofre_legendario() {
          CofreLegendari cofre = new CofreLegendari();
        cofre.abrir_cofre();
        cofre.mostrar_cofre();
    }
    
    
}
