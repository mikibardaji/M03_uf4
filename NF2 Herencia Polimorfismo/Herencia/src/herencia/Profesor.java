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
public class Profesor extends Persona{
    private int cod_prof;
    private String Departamento;

    public Profesor(String nombre, long DNI, String direccion, int telefono,int cod_prof, String Departamento) {
        super(nombre, DNI, direccion, telefono);
        this.cod_prof = cod_prof;
        this.Departamento = Departamento;
    }

    public int getCod_prof() {
        return cod_prof;
    }

    public void setCod_prof(int cod_prof) {
        this.cod_prof = cod_prof;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }

    @Override
    public void saludo() {
        System.out.println("no me molestes");
    }

    
    

    
    
    
}
