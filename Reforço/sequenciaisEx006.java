package Reforço;

import java.util.Scanner;

public class sequenciaisEx006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Custo de fábrica do carro: ");
        double fabrica = sc.nextDouble();

        double imposto = fabrica * 0.30;
        double distribuidor = fabrica * 0.12;
        double valor = fabrica + imposto + distribuidor;

        System.out.printf("O valor do carro é: R$%.2f", valor);

        sc.close();
    }
}
