package Exercises;

import java.util.Scanner;

public class ex007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número de 0-100: ");
        double numero = sc.nextDouble();

        if (numero < 0.0 || numero > 100.0) {
            System.out.print("Fora de intervalo");
        }
        else if (numero <= 25.0) {
            System.out.print("Intervalo: 0 - 25");
        }
        else if (numero <= 50.0) {
            System.out.print("Intervalo: 25 - 50");
        }
        else if (numero <= 75.01) {
            System.out.print("Intervalo: 50 - 75");
        }
        else {
            System.out.print("Intervalo: 75 - 100");
        }

        sc.close();
    }
}
