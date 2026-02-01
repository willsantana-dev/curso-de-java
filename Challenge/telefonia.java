package DesafioEmVideo;

import java.util.Locale;
import java.util.Scanner;

public class telefonia {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Tempo usado: ");
        int tempo = sc.nextInt();

        double valor;
        if (tempo > 100) {
            valor = 50.0 + (tempo - 100) * 2;
            System.out.printf("Valor da conta: R$%.2f", valor);
        }
        else {
            System.out.print("Valor da conta: R$50,00");
        }

        sc.close();
    }
}
