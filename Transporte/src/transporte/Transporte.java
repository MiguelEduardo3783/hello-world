/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transporte;

/**
 *
 * @author aula209
 */
public class Transporte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Autobus dina=new Autobus();
        dina.setGasolina(6);
        Autobus inter= new Autobus(5);
        inter.Acelerar();
        Automovil dino=new Automovil();
        dino.setGasolina(6);
        Automovil nev=new Automovil(5);
        nev.Acelerar();
        
    }
    
}
