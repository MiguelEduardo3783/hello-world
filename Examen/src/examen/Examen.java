/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author migue
 */
public class Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Telefono[] t = new Telefono[3];
       Radio[] r = new Radio[3];
       t[0]= new Telefono(false, false, "123", "Samsung", "Galaxy 7");
       t[1]= new Telefono(true, false, "140", "Apple", "Iphone 7");
       t[2]= new Telefono(false, true, "200", "LG", "LG Xperia");
       r[0]= new Radio(false, "M", "L", "Rojo", "98.9","FM");
       r[1]= new Radio(false, "P", "O", "Gris", "690","AM");
       r[2]= new Radio(false, "Y", "D", "Verde", "104.5","FM");
       
        for (int i = 0; i < 3; i++) {
            System.out.println("Precio: "+ t[i].getPrecio()+"\nMarca: "+t[i].getMarca()+"\nModelo: "+t[i].getModelo());
            System.out.println(t[i].Encender());
            System.out.println(t[i].Llamada());
            System.out.println(t[i].Colgar());
            System.out.println(t[i].Apagar());
            System.out.println("\n");
        }
        System.out.println("\n");
        System.out.println("\n");
        for (int i = 0; i < 3; i++) {
            System.out.println("Marca: "+r[i].getMarca()+"\nModelo: "+r[i].getModelo()+"\nColor: "+r[i].getColor()+"\nEstacion Sintonizada: "+r[i].getEstacion()+"\nBanda Utilizada: "+r[i].getBanda());
            System.out.println(r[i].Encender());
            r[i].cambiarEstacion(r[i].getBanda(), r[i].getEstacion());
            System.out.println(r[i].cambiarBanda(r[i].getBanda()));
            System.out.println(r[i].Apagar());
            System.out.println("\n"); 
        }
    }
    
}
