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
 * DAO --> Data Acces Object
 */
public class PersonaDAO {

    //acceder a los dato de persona
    public void AnyadirPersona(ArrayList<Persona> listin, Scanner sc) {
        System.out.println("Pon el nombre de la persona");
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
        sc.nextLine();//limpiamos buffer sc
               
        Persona anyadir = new Persona(nombre, edad, sexo, altura, peso); 
        listin.add(anyadir);
        //listin.add(new Persona(nombre, edad, sexo, altura, peso));
        //listin.get(listin.size()-1).toString();
        System.out.println("Persona añadida..." + anyadir.toString());
        System.out.println("Numero personas en lista: " + listin.size());
    }

    void BuscarPersonaxNombre(ArrayList<Persona> listin, Scanner sc) {
        System.out.println("Pon el nombre de la persona");
        String nombreBuscado = sc.nextLine();
        Persona aux = new Persona();
        aux.setNombre(nombreBuscado);
        //esto en nuestro caso no vale
        //porque el equals de persona es para dni
        //por tantno no lo encuentra si busco solo por nombre
        /*
        int posicion = listin.indexOf(aux); //si lo encuentra te da la posicion, sino devuelve un -1
        if (posicion!=-1) //oodria usar el contains y luego el index
        {
            System.out.println("persona existe");
            System.out.println("Persona encontrada" + listin.get(posicion).toString());
        }
        else
        {
            System.out.println("persona no existe");
        }
        */
        boolean encontrado =false;
        for (int i = 0; i < listin.size(); i++) {
            //opcion 1 : if(listin.get(i).getNombre().equals(nombreBuscado))
            if(listin.get(i).getNombre().equalsIgnoreCase(aux.getNombre()))
            {
                System.out.println("Persona encontrada->" + listin.get(i).toString());
                encontrado = true;
            }
        }
        if(!encontrado)
        {
            System.out.println("persona no existe");
        }
        
    }

    void eliminarPersona(ArrayList<Persona> listin, Scanner sc) {
        System.out.println("Pon el nombre de la persona");
        String nombreBuscado = sc.nextLine();

        boolean encontrado =false;
        for (int i = 0; i < listin.size(); i++) {
            
            if(listin.get(i).getNombre().equalsIgnoreCase(nombreBuscado))
            {
                System.out.println("Persona borrada->" + listin.get(i).toString());
                listin.remove(i);
                encontrado = true;
            }
        }
        if(!encontrado)
        {
            System.out.println("no hay esta persona");
        }
    }

    void listarTodo(ArrayList<Persona> listin) {
        System.out.println(listin.toString());
//        System.out.println("segundo listado");
//       for (int i = 0; i < listin.size(); i++) {
//                System.out.println("->" + listin.get(i).toString());
//        }
        System.out.println("numero de personas : " + listin.size());
    }

    void cambiarEdadPersona(ArrayList<Persona> listin, Scanner sc) {
        System.out.println("Pon el dni");
        long DNIBuscado = sc.nextLong();
        boolean encontrado =false;
        
        for (int i = 0; i < listin.size(); i++) {
            System.out.println(listin.get(i).getDNI() + "-" + DNIBuscado);
            if(listin.get(i).getDNI() == DNIBuscado)
            {
                System.out.println("Que edad quieres ponerle?");
                int edat = sc.nextInt();
                listin.get(i).setEdad(edat);
                encontrado = true;
                break; //rompo el for
            }
        }
        if(!encontrado)
        {
            System.out.println("no existe el tio");
        }
    }
    
    
    
}
