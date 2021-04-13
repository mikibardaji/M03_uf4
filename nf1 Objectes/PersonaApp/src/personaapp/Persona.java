/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personaapp;

/**
 *
 * @author 43720186S
 */
public class Persona {
    private String nombre;
    private int edad;
    private long DNI;
    private char sexo;
    private double peso;
    private double altura;

    /* Un constructor con todos los atributos como parámetro*/
    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
       
        this.sexo = comprobar_sexo(sexo);
        setPeso(peso);
        setAltura(altura);
        this.DNI = generarDNI();
    }

    public Persona(double peso, double altura) {
        setPeso(peso);
        setAltura(altura);
        this.sexo = 'H';
         this.DNI = generarDNI();
           this.nombre = "";
    }

    /*Un constructor por defecto.
*/
    public Persona() {
         this.DNI = generarDNI();
         this.sexo = 'H';
         this.nombre = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 0)
        {
        this.edad = edad;    
        }
        else
            this.edad = 0;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = comprobar_sexo(sexo);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso>0)
        {
        this.peso = peso;
        }
        else
            this.peso = 0;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura>0)
        {
        this.altura = altura;    
        }
        else
        {
            this.altura = 0;
            System.out.println("la altura no puede ser negativa lo informo a 0");
        }
            
    }
    
    

    @Override
    public String toString() {
        return "\n  {" + "nombre=" + nombre + ", edad=" + edad + ", DNI=" + DNI + ",  sexo=" + sexo + ",  peso=" + peso + ", altura=" + altura + '}';
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
        final Persona other = (Persona) obj;
        if (this.DNI != other.DNI) {
            return false;
        }
        //if (this.dni = other.dni)
        //return true
        //else if (this.nombre.equals(nombre))
        //return true
        //else return false;
        return true;
    }



    
    /**
     * 
     * @return true si es mayor de edad 
     */
    public boolean esMayorDeEdad()
    {
        if (this.edad < 18)
        {
            return false;
        }
        else
            return true;
        
        //return this.edad>17;
    }
    
    private char comprobar_sexo(char sexo)
    {
        if (sexo=='H' || sexo=='M')
        {
            return sexo;
        }
        else //valor incorrecto devuelvo H
            return 'H';
    }
    
    private long generarDNI()
    {
        long edat = (long) (Math.random() * (10000000 - 99999999) + 10000000);
        if(edat<0)
            edat = edat*(-1);
        return edat;
    }
    
    public int calcula_IMC()
    {
        double IMC = (double) this.peso/(this.altura*this.altura);
        if (IMC<20)
            return -1;
        else if (IMC>=20 && IMC <= 25)
            return 0;
        else
           return 1;
    }

    public long getDNI() {
        return DNI;
    }
    
    
}
