/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author mati
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Persona x = new Persona("Pau Cañizares", 10, "carrer de baix", 666666);
        //Persona x = new Persona();
        //System.out.println(x.getNombre());
       // System.out.println(x.getDNI());
        
        Alumno al = new Alumno("Pau Cañizares", 10, "carrer de baix", 666666,12,"DAW");
        al.setExpediente(12);
        al.setCiclo("DAW");
        System.out.println(al.getExpediente());
        System.out.println(al.getCiclo());
        System.out.println(al.getNombre());
        System.out.println(al.getDNI());
        al.saludo();
        Profesor x = new Profesor("Pau Cañizares Profe", 10, "carrer de baix", 666666,12,"DAW");
        System.out.println(x.getDepartamento());
        System.out.println(x.getCod_prof());
        System.out.println(x.getNombre());
        System.out.println(x.getDNI());
        x.saludo();
    }
    
}
