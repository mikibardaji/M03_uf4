/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionapp;

import java.util.Objects;

/**
 *
 * @author 43720186S
 */
public class Electrodomesticos {
    String nombre;
    double precio_base;
    String color;
    char consumo_energetico;

    public Electrodomesticos() {
        this.nombre = "lavadora";
        this.color = "blanco";
        this.consumo_energetico = 'D';
        this.precio_base = 100;
        
    }

    public Electrodomesticos(String nombre, double precio_base, char consumo_energetico) {
        this.nombre = nombre;
        setPrecio_base(precio_base);
        this.consumo_energetico = consumo_energetico(consumo_energetico);
         this.color = "blanco";
    }

    public Electrodomesticos(String nombre, double precio_base, String color, char consumo_energetico) {
        this.nombre = nombre;
       setPrecio_base(precio_base);
        this.color = comprobarColor(color);
        this.consumo_energetico = consumo_energetico(consumo_energetico);
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio_base() {
        return precio_base;
    }

    public void setPrecio_base(double precio_base) {
        if(this.precio_base>0)
            this.precio_base = precio_base;
        else
            this.precio_base = 0;
    }

    
    
    public String getColor() {
        return color;
    }

    public char getConsumo_energetico() {
        return consumo_energetico;
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
        final Electrodomesticos other = (Electrodomesticos) obj;
        if (this.consumo_energetico != other.consumo_energetico) {
            return false;
        }
        if (!this.nombre.equalsIgnoreCase(other.nombre) ) {
            return false;
        }
        return true;
    }
    
    private char consumo_energetico(char letra_consumo)
    {
        if (letra_consumo=='A' || letra_consumo == 'B' || letra_consumo=='C')
        {
            return letra_consumo;
        }
        else
        {
             return 'D';   
        }
    }
    
    private String comprobarColor(String color)
    {
        if (color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("azul"))
        {
            return color;
        }
        else
        {
            return "blanco";
        }
    }

    @Override
    public String toString() {
        return  "nombre=" + nombre + ", precio =" + this.precio_final() + ", consumo_energetico=" + consumo_energetico + '}';
    }
    
    
    public double precio_final()
    {
    if (this.consumo_energetico == 'A')
            return (this.precio_base + 100);
    else   if (this.consumo_energetico == 'B')
             return (this.precio_base + 80);
     else   if (this.consumo_energetico == 'C')
         return (this.precio_base + 60);
     else
         return (this.precio_base + 40);
}
}