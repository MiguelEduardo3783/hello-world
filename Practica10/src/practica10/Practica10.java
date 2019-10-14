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
public class Practica10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Man[] superH = new Man[3];
    superH[0] = new Man(32, "Rodo", "Correr");
    superH[1] = new Man(27, "Lucas", "Brincar");
    superH[2] = new Man(34, "Laura", "Brincar");
        System.out.println("Superheroes");
    for(int i=0; i<3; i++)
    {
        System.out.println(superH[i].tostring());
        if(superH[i].getHabilidad().equalsIgnoreCase("Brincar")){
            System.out.println(""+superH[i].BrincaMasAlto());
        }
        else
        {
            System.out.println(""+superH[i].CorrerMasRapido());
        }
        System.out.println("\n");
    }
    
   }
}
