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
public class Masajista extends EquipFutbol{
    private String titulacion;

    public Masajista(int id, String nombre, int Edad, String titulacion) {
        super(id, nombre, Edad);
        titulacion = titulacion;
    }

    
    
    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

   
    @Override
    public void Viajar()
    {
        System.out.println("no viajo");
    }
    
    public void dar_masaje()
    {
        System.out.println("soy" + nombre + " doy masaje");
    }
    
    
    
}
