package Exercises;

import java.util.Locale;
import java.util.Scanner;

public class ex009 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Defina um valor decimal para x: ");
        double x = sc.nextDouble();
        System.out.print("Defina um valor decimal para y: ");
        double y = sc.nextDouble();

        if (x > 0 && y > 0) {
            System.out.print("Q1");
        }
        else if (x < 0 && y > 0) {
            System.out.print("Q2");
        }
        else if (x < 0 && y < 0) {
            System.out.print("Q3");
        }
        else if (x > 0 && y < 0) {
            System.out.print("Q4");
        }
        else {
            System.out.print("Origem");
        }

        sc.close();
    }
}
