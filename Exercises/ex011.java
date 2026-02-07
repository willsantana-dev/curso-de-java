package Exercises;

import java.util.Scanner;

public class ex011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a senha: ");
        int senha = sc.nextInt();
        int permitido = 2002;

        while (senha != permitido) {
            System.out.println("Senha inválida");
            System.out.print("\nDigite a senha novamente: ");
            senha = sc.nextInt();
        }

        System.out.print("Acesso permitido");

        sc.close();
    }
}
