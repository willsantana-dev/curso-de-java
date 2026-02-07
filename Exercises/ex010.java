package Exercises;

import java.util.Locale;
import java.util.Scanner;

public class ex010 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int soma = x;

        while (x != 0) {
            x = sc.nextInt();
            soma += x;
        }

        System.out.printf("Soma: %d", soma);

        sc.close();
    }
}
