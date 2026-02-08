package Exercises;

import java.util.Locale;
import java.util.Scanner;

public class ex014 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números você quer somar? ");
        System.out.print("R: ");
        int N = sc.nextInt();

        System.out.println("\nNúmeros: ");
        int soma = 0;
        for (int i = 0; i < N; i++) {
            System.out.print("R: ");
            int x = sc.nextInt();
            soma += x;
        }

        System.out.print("\nResultado: " + soma);
        sc.close();
    }
}