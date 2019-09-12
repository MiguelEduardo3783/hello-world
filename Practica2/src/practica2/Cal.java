
package practica2;

public class Cal implements ICalculadora{
  public void Suma(int a, int b){
    int c;
    c=a + b;
    System.out.print("c=");
    System.out.println(c);
    }
    public void Resta(int a, int b){
    int c;
    c=a - b;
    System.out.print("c=");
    System.out.println(c);
}
    @Override
    public double Div(double a, double b) {
    double c;
    c=a / b;
    System.out.print("c=");
    System.out.println(c);
      return 0;
    }

    @Override
    public int Multi(int a, int b) {
    int c;
    c=a * b;
    System.out.print("c=");
    System.out.println(c);
    return 0;
    }
   
}
