/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

/**
 *
 * @author migue
 */
public class Calculadora {
    public void Suma(int x, int y){
    int c;
    c=x + y;
    System.out.print("c=");
    System.out.println(c);
    }
    public void Resta(int x, int y){
    int c;
    c=x - y;
    System.out.print("c=");
    System.out.println(c);
}
    public void Multi(int x, int y){
    int c;
    c=x * y;
    System.out.print("c=");
    System.out.println(c);
    }
    public void Div(int x, int y){
    int c;
    c=x / y;
    System.out.print("c=");
    System.out.println(c);
    }
}

