package Exercises;

import java.security.cert.CertPathValidatorResult;
import java.util.Scanner;

public class ex006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Cachorro quente - R$4.00");
        System.out.println("2. X-Salada - R$4.50");
        System.out.println("3. X-Bacon - R$5.00");
        System.out.println("4. Torrada simples - R$2.00");
        System.out.println("5. Refrigerante - R$1.50");

        System.out.println("\n=======================");

        System.out.print("\nEscolha um produto: ");
        int codigo = sc.nextInt();
        System.out.print("Escolha a quantidade: ");
        int quantidade = sc.nextInt();

        if (codigo == 1) {
            double valor = 4.00;
            double total = quantidade * valor;
            System.out.printf("\nValor a pagar: R$%.2f", total);
        }
        else if (codigo == 2) {
            double valor = 4.50;
            double total = quantidade * valor;
            System.out.printf("\nValor a pagar: R$%.2f", total);
        }
        else if (codigo == 3) {
            double valor = 5.00;
            double total = quantidade * valor;
            System.out.printf("\nValor a pagar: R$%.2f", total);
        }
        else if (codigo == 4) {
            double valor = 2.00;
            double total = quantidade * valor;
            System.out.printf("\nValor a pagar: R$%.2f", total);
        }
        else if (codigo == 5) {
            double valor = 1.50;
            double total = quantidade * valor;
            System.out.printf("\nValor a pagar: R$%.2f", total);
        }
        else {
            System.out.print("\nInformações inválidas!");
        }

        sc.close();
    }
}
