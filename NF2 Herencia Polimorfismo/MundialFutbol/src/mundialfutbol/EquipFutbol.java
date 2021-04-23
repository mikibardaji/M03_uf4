/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundialfutbol;

/**
 *
 * @author 43720186S
 */
public class EquipFutbol {
    protected int id; //protected es similar al private, pero permite que las clases hijas puedan acceder a ella directamente , sin el setter
    protected String nombre;
    protected int edad;

    public EquipFutbol(int id, String nombre, int Edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = Edad;
    }
    
    
    
    
    
    public void Viajar()
    {
        System.out.println("Hola soy "+ nombre + " viajo para el partido");
     
    }
    
    
    public void Concentrarse()
    {
        System.out.println("Hola "+ nombre + " me concentro en el hotel para el partido");
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int Edad) {
        this.edad = Edad;
    }
    
    
    
    
    
    
}
