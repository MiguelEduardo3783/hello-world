/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica10;

/**
 *
 * @author migue
 */
public class Man extends Superman{
    private int Edad;
    private String Nombre;
    private String Habilidad;
    private String Poder; 

    public Man(int Edad, String Nombre, String Habilidad) {
        this.Edad = Edad;
        this.Nombre = Nombre;
        this.Habilidad = Habilidad;
    }
    
    public String getHabilidad() {
        return Habilidad;
    }

    public void setHabilidad(String Habilidad) {
        this.Habilidad = Habilidad;
    }

    public String getPoder() {
        return Poder;
    }

    public void setPoder(String Poder) {
        this.Poder = Poder;
    }
    
    public String caminar()
    {
        return("Camina");
    }
    
    public String Correr()
    {
        return("Corre");
    }

    @Override
    public String SuperFuerza() {
        return("Hombre con superfuerza");
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public String tostring() {
        return "Nombre: "+Nombre+"\nEdad: "+Edad+"\nHabilidad: "+Habilidad;    
    }
}
