/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica11;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author migue
 */
public class Practica11 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Funciones f = new Funciones();
        int x = f.convStr2Int("124");
        System.out.println("Numero convertido: " + x);
        System.out.println("\n");
        int d = f.comparador(21, 9, 5);
        System.out.println("Número mayor: " + d);
        System.out.println("\n");
        //int y = f.longitud("Malta");
        System.out.println("Longitud del String: "+f.longitud("Malcom"));
        System.out.println("\n");
        String[] nom = {"Pepe", "Rosa", "Silvestre", "Salomon", "Rex", "Jonah", "Krieg", "Gabriel", "Fabiola", "Juan"};
        String[] D = f.ordenarA(nom);
        for (int i = 0; i < D.length; i++) {
            if(D[i]!=null){
                System.out.println(D[i]);
            }
        }
        System.out.println("\n");
        String p = "Some";
        System.out.println(""+p+"/");
        int[] pos = new int[p.length()];
        int[] E = f.posicion(p);
        for (int i = 0; i < E.length; i++) {
            System.out.print(E[i]);
        }
        System.out.println("\n");
        String n = null;
        f.separador(n);
        System.out.println("\n");
        String[] lst={"Ana", "Jorge", "ale", "Molly", "Gabriel", "Alex", "allyx", "ellie", "furia", "juan"};
        String[] B = f.empiezaA(lst);
        for (int i = 0; i < B.length; i++) {
            if(B[i]!=null){
                System.out.println(B[i]);
            }
        }
        System.out.println("\n");
        String[] lps={"Sals", "ballaS", "YUR", "GRAcis", "familiAS", "graztie", "kul", "sultur", "troy", "errar"};
        String[] C = f.terminaS(lps);
        for (int i = 0; i < 10; i++) {
            if(C[i]!=null){
                System.out.println(C[i]);
            }
        }
        System.out.println("\n");
        //String[] lp = new String[10];
        String[] lp= {"JAVA", "uno", "Holland", "Newt", "MAnzana", "NirvanA", "iNGE", "galo", "rosy", "yuo"};
        /*for(String a: f.contieneA(lp)){
            System.out.println(a);
        }*/
        String[] A = f.contieneA(lp);
        for (int i = 0; i < A.length; i++) {
            if(A[i]!=null){
                System.out.println(A[i]);
            }
            
        }
        System.out.println("\n");
        String e = "Perro";
        f.abecedario(e);
        System.out.println("\n");
        String pa="anna";
        System.out.println(""+pa+" "+f.palidromo(pa));
        System.out.println("\n");
        String fr = "Hola Mundo";
        String[] U = f.DivideStr(fr);
        for (int i = 0; i < U.length; i++) {
            System.out.println(U[i]);
        }
        System.out.println("\n");
        String FR = "Hola Mundo";
        System.out.println(f.MayorSt(FR));
    }
    
}
