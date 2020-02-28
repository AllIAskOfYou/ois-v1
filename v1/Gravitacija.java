import java.util.Scanner;

public class Gravitacija {
    public static void main (String args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        Double izracunanPospesek = izracun(n);
        izpis(n, izracunanPospesek);
    }
}
