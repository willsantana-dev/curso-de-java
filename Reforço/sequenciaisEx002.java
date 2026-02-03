package Reforço;

import java.util.Scanner;

public class sequenciaisEx002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o raio da lata: ");
        double raio = sc.nextDouble();
        System.out.print("Digite a altura da lata: ");
        double altura = sc.nextDouble();

        double m2 = (Math.PI * Math.pow(raio, 2) * 2) + (2 * Math.PI * raio * altura);
        double valor = m2 * 100.0;
        System.out.printf("O valor é: R$%.2f", valor);

        sc.close();
    }
}
