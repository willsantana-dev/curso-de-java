package Reforço;

import java.util.Scanner;

public class sequenciaisEx009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Defina o valor de x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Defina o valor de x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Defina o valor de y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Defina o valor de y2: ");
        double y2 = sc.nextDouble();

        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("\n=========================");

        System.out.printf("A distância entre A e B é: %.2f", distancia);


    }
}
