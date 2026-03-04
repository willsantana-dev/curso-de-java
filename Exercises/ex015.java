package Exercises;

import java.util.Scanner;

public class ex015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double xA, xB, xC, yA, yB, yC;

        System.out.println("Medidas do triângulo X: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.println("Medidas do triângulo Y: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double p, area1, area2;

        p = (xA + xB + xC) / 2;
        area1 = Math.sqrt(p * (p-xA) * (p-xB) * (p-xC));

        p = (yA + yB + yC) / 2;
        area2 = Math.sqrt(p * (p-yA) * (p-yB) * (p-yC));

        System.out.printf("Área do triângulo 1: %.4f%n", area1);
        System.out.printf("Área do triângulo 2: %.4f%n", area2);

        if (area1 > area2) {
            System.out.println("Maior triângulo: X");
        } else {
            System.out.println("Maior triângulo: Y");
        }

        sc.close();
    }
}