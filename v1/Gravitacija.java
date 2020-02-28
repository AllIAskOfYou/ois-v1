import java.util.*;

public class Gravitacija {
    public double izracun(double v){
        double c =6.674*Math.pow(10,-11);
        double M =5.972*Math.pow(10,24);
        double r =6.371*Math.pow(10,6);
        double sum =v+r;
        return (c*m)/(Math.pow((sum,2);

    }
    public static void main (String args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double izracunanPospesek = izracun(n);
        izpis(n, izracunanPospesek);
    }
}


