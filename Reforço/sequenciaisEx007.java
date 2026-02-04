package Reforço;

import java.util.Scanner;

public class sequenciaisEx007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Comprimento do lado 1: ");
        double l1 = sc.nextDouble();
        System.out.print("Comprimento do lado 2: ");
        double l2 = sc.nextDouble();
        System.out.print("Comprimento do lado 3: ");
        double l3 = sc.nextDouble();

        double t = (l1 + l2 + l3) / 2;
        double area = Math.sqrt(t * (t - l1) * (t - l2) * (t - l3));

        System.out.printf("A área do triângulo é: %.15f", area);

        sc.close();
    }
}
