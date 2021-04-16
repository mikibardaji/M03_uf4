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
public class Alumno extends Persona{
    private long expediente;
    private String ciclo;

    public Alumno( String nombre, long DNI, String direccion, int telefono, long expediente, String ciclo) {
        super(nombre, DNI, direccion, telefono);
        this.expediente = expediente;
        this.ciclo = ciclo;
    }

    
    
    public long getExpediente() {
        return expediente;
    }

    public void setExpediente(int expediente) {
        this.expediente = expediente;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    @Override
    public void saludo() {
        super.saludo(); 
        System.out.println("Apruebame por favor");
    }
    
    
    
}
