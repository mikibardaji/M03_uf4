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
public class Entrenador extends GenteJuega{
    private boolean tiene_titulo;

    public Entrenador(int id, String nombre, int Edad) {
        super(id, nombre, Edad);
        tiene_titulo=true;
    }

    /* polimorfismo*/
    public Entrenador(boolean tiene_titulo, int id, String nombre, int Edad) {
        super(id, nombre, Edad);
        this.tiene_titulo = tiene_titulo;
    }

    
    
    public boolean isTiene_titulo() {
        return tiene_titulo;
    }

    public void setTiene_titulo(boolean tiene_titulo) {
        this.tiene_titulo = tiene_titulo;
    }

    //override quiere decir que sobre escribe el metodo que Ya esta definido en la clase padre
    @Override
    public void Viajar() {
        super.Viajar(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Viajo en segunda clase");
       // System.out.println(this.edad);
        //this.edad = 25;//al ser protected puedo acceder
    }
    
    public void dirigirPartido()
    {
        System.out.println("Estoy diriengo al equipo en el partido ");
    }

    @Override
    public void entrenar() {
        System.out.println("Dirijo el entreno");
    }
    
   
}
