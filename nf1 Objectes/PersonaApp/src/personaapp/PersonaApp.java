/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personaapp;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 43720186S
 */
public class PersonaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Pon el nombre de vacia");
        String nombre = sc.nextLine();
        System.out.println("Pon la edat");
        int edad = sc.nextInt();
        sc.nextLine();//limpie buffer
        System.out.println("Pon el sexo");
        char sexo = sc.nextLine().charAt(0);
        System.out.println("Pon la altura");
        double altura = sc.nextDouble();
        System.out.println("Pon el peso");
        double peso = sc.nextDouble();
        Persona vacia = new Persona();
        
        vacia.setAltura(altura);
        vacia.setEdad(edad);
        vacia.setNombre(nombre);
        vacia.setSexo(sexo);
        vacia.setPeso(peso);
        
        System.out.println("vacia  " + vacia.toString());
        System.out.println("IMC  " + vacia.calcula_IMC());
       
           sc.nextLine();//limpie buffer
        System.out.println("Pon el nombre de personaPesoAltura");
        nombre = sc.nextLine();
        System.out.println("Pon la edat");
        edad = sc.nextInt();
           sc.nextLine();//limpie buffer
        System.out.println("Pon el sexo");
        sexo = sc.nextLine().charAt(0);
        System.out.println("Pon la altura");
        altura = sc.nextDouble();
        System.out.println("Pon el peso");
        peso = sc.nextDouble();
           sc.nextLine();//limpie buffer
        
        
        Persona pesoAltura = new Persona(altura, peso);
        pesoAltura.setEdad(edad);
        pesoAltura.setNombre(nombre);
        pesoAltura.setSexo(sexo);
        
         System.out.println("PesoAltura  " + pesoAltura.toString());
        System.out.println("IMC  " + pesoAltura.calcula_IMC());
 
        System.out.println("Pon el nombre de todo");
        nombre = sc.nextLine();
        System.out.println("Pon la edat");
        edad = sc.nextInt();
           sc.nextLine();//limpie buffer
        System.out.println("Pon el sexo");
        sexo = sc.nextLine().charAt(0);
        System.out.println("Pon la altura");
        altura = sc.nextDouble();
        System.out.println("Pon el peso");
        peso = sc.nextDouble();
        
        
        
        
        Persona todo = new Persona(nombre, edad, sexo, altura, peso);
        System.out.println("todo  " + todo.toString());
        System.out.println("IMC  " + todo.calcula_IMC());
        
        ArrayList<Persona> listin = new ArrayList();
        
        System.out.println("1.- Añadir persona");
        System.out.println("2.- Mostrar datos persona buscando por nombre"); //bucle para buscar por nombre
        System.out.println("3.- Eliminar persona");
        System.out.println("4.- Canviar edad persona");
        System.out.println("0.- Salir");
    }
    
}
