package Revisoes;

import java.util.Scanner;

public class condicionalTernaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Preço do produto: R$");
        double preco = sc.nextDouble();
        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;

        System.out.printf("O desconto é: R$%.2f", desconto);
    }
}
