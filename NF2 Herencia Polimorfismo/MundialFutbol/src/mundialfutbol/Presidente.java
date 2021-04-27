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
public class Presidente extends EquipFutbol{
   private int anyos_cargos;

    public Presidente(int id, String nombre, int Edad, int anyos) {
        super(id, nombre, Edad);
        this.anyos_cargos=anyos;
    }

    public int getAnyos_cargos() {
        return anyos_cargos;
    }

    public void setAnyos_cargos(int anyos_cargos) {
        this.anyos_cargos = anyos_cargos;
    }

    //override quiere decir que sobre escribe el metodo que Ya esta definido en la clase padre
    @Override
    public void Viajar() {
        super.Viajar(); //llama al metodo padre
        System.out.println("Viajo en VIP clase");
      
    }
    
    public void palco()
    {
        System.out.println("estoy en el palco");
    }
    
    public void tratar_contrato(EquipFutbol persona)
    {
        //persona.Viajar();
        
        System.out.println("vamos a negociar ");
       if (persona instanceof Futbolista)
       {
           Futbolista aux = (Futbolista) persona;
           //aux.jugarPartido();
           System.out.println("te aumentare el sueldo si ganamos la liga");
       }
       else if (persona instanceof Entrenador)
       {
           System.out.println("Hazlos trabajar que son unos vagos");
       }
       else if (persona instanceof Masajista)
       {
           System.out.println("se lesionan demasiado");
       }
    }
    

    
}
