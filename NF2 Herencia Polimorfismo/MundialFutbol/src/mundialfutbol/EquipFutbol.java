/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundialfutbol;

/**
 *clase abstracta no podre crear objetos
 * de esta clase
 * aqui si puedo definir atributos y metodos
 * 
 * @author 43720186S
 */
public abstract class EquipFutbol {
    protected int id; //protected es similar al private, pero permite que las clases hijas puedan acceder a ella directamente , sin el setter
    protected String nombre;
    protected int edad;
    protected int salary;

    public EquipFutbol(int id, String nombre, int Edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = Edad;
        salary = 1500;
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
        if(Edad > 0)
        {
            this.edad = Edad;
        }
        else
        {
            this.edad = 0;
        }
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final EquipFutbol other = (EquipFutbol) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    public int getSalary() {
        return salary;
    }
    
    
    
    
    
    
}
