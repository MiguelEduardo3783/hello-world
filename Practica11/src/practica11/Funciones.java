/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica11;

import java.util.Arrays;

/**
 *
 * @author migue
 */
//1.- Recibe numero string y lo vuelve int
//2.- Recibe 3 numeros y los compara para obtener el mayor
//3.- Recibe 10 strings y las ordena de acuerdo a su longitud
//4.- Recibe 10 strings y los separa con (-,|)
//5.- Obten la longitud de una string
//6.- Reciba un String y devuelva la posicion de cada letra
//7.- Imprimir los elementos de un arreglo de 10 strings que comiencen con a
//8.- Imprimir los elementos de un arreglo de 10 strings que terminen con s
//9.- Imprimir los elementos de un arreglo de 10 strings que contengan a
//10.- Recibe una string y imprime el abecedario con su posicion en la string
//11.- Recibe un string y te dice si es palidromo o no
//12.- Divide una string por espacios
//13.- Divide una string en espacios y devuelve la substring mayor
public class Funciones {
    public int convStr2Int(String li){
        return Integer.parseInt(li);
    }
    
    public int comparador(int x, int y, int z){
        int mayor = x;
        if(y>x){
            mayor = y;
            if(z>y){
                mayor =z;
            }
        }
        else{
            if(z>x){
                mayor=z;
            }
        }
        return mayor;
    }
    
    public String[] ordenarA(String[] nom){
        String aux;
        int min;
        min=nom[0].length();
        for (int i = 0; i < 10; i++) {
            for (int j = i+1; j < 10; j++) {
               if(nom[j].length()<nom[min].length()){
                   min=j;
                }  
            }
            aux = nom[i];
            nom[i]=nom[min];
            nom[min]=aux;  
        }
        
        return nom;
    }
    
    public int longitud(String lo){
        int i=0;
        for ( ; i < lo.length(); i++) {
            
        }   
        return i;
    }
    
    public String separador(String e){
        String[] le= {"JAVA", "uno", "Holland", "Newt", "MAnzana", "NirvanA", "iNGE", "galo", "rosy", "yuo"};
        String n = null;
        for (int i = 0; i < 10; i++) {
            n = ""+le[i]+"|";
            System.out.print(n);
        }
        return n;
    }
    
    public int[] posicion(String p){
        int[] pos = new int[p.length()];
        for (int i = 0; i < p.length(); i++) {
            pos[i]=i;
        }
      
      return pos;
    }
    
    public String[] empiezaA(String[] st){
        String[] lst = new String[10];
        int j=0;
        for (int i = 0; i < 10; i++) {
            if(st[i].startsWith("a")||st[i].startsWith("A")){
                lst[j]=st[i];
                j+=1;
            }
        }
        return lst;
    }
    
    public String[] terminaS(String[] ps){
        String[] lps = new String[10];
        int j=0;
        for (int i = 0; i < 10; i++) {
            if(ps[i].endsWith("S")||ps[i].endsWith("s")){
                lps[j]=ps[i];
                j+=1;
            }
        }
        return lps;
    }
    
    public String[] contieneA(String[] p){
        String[] lp = new String[10];
        int j=0;
        for (int i = 0; i < 10; i++) {
            if(p[i].contains("a")||p[i].contains("A")){
                lp[j]= p[i];
                j+=1;
            }
        }
        return lp;
    }
    
    public void abecedario(String e){
        char[] l = new char[e.length()];
        e=e.toUpperCase();
        for (int i = 0; i < e.length(); i++) {
            l[i]=e.charAt(i);
        }
        for (int i = 0; i < 26; i++) {
            System.out.printf("%c", 65+i);
            for (int j = 0; j < e.length(); j++) {
             if(l[j] == i+65){
                System.out.print("= "+j + " ");
            }
                System.out.print("");
            }
 
                
        }
    }
        
    
    public String palidromo(String pa){
        int inc = 0;
        int des = pa.length()-1;
        String F= null;
        boolean bError = false;
        while((inc<des)&&(!bError)){
            if(pa.charAt(inc)==pa.charAt(des)){
                inc++;
                des--;
            }
            else{
                bError= true;
            }
            if(!bError){
                F="Es un palidromo";
            }
            else{
                F="No es un palidromo";
            }
        }
        return F;
    }
    
    public String[] DivideStr(String fr){
        String[] arrayfr = fr.split(" ");
        return arrayfr;
    }
    public String MayorSt(String FR){
        int max;
        String mayor = null;
        String[] arrayFR = FR.split(" ");
        max = arrayFR[0].length();
        for (int i = 0; i < arrayFR.length; i++) {
            for (int j = i+1; j < arrayFR.length; j++) {
                if(arrayFR[j].length()>arrayFR[i].length()){
                    mayor = arrayFR[j];
                }
            }
            
        }
        return mayor;
    }
}
