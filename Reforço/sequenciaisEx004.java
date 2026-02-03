package Reforço;

import java.util.Scanner;

public class sequenciaisEx004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Diga a temperatura em Fahrenheit: ");
        double f = sc.nextDouble();
        double c = (f - 32) / 1.8;

        System.out.print("Quantas polegadas teve de chuva: ");
        double p = sc.nextDouble();
        double m = p * 25.4;

        System.out.printf("Temperatura em Celsius: %.2f%n", c);
        System.out.printf("Chuva em milímetros: %.2f", m);

        sc.close();
    }
}
