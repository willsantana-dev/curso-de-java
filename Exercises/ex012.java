package Exercises;

import java.util.Scanner;
import java.util.zip.ZipEntry;

public class ex012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Defina o valor de X: ");
        double x = sc.nextDouble();
        System.out.print("Defina o valor de Y: ");
        double y = sc.nextDouble();

        while (x != 0 || y != 0) {
            if (x >= 1 && y >= 1) {
                System.out.println("Q1");
                x = sc.nextDouble();
                y = sc.nextDouble();
            }
            else if (x >= 1 && y <= -1) {
                System.out.println("Q2");
                x = sc.nextDouble();
                y = sc.nextDouble();
            }
            else if (x <= -1 && y >= 1) {
                System.out.println("Q3");
                x = sc.nextDouble();
                y = sc.nextDouble();
            }
            else if (x <= -1 && y <= -1) {
                System.out.println("Q4");
                x = sc.nextDouble();
                y = sc.nextDouble();
            }
            else {
                break;
            }
        }

        sc.close();
    }
}
