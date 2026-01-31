package Exercises;
import java.util.Scanner;

public class ex005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("O jogo começou: ");
        int inicio = scanner.nextInt();
        System.out.print("O jogo terminou: ");
        int fim = scanner.nextInt();

        int duracao = inicio + fim;
        if (inicio < fim) {
            duracao = fim - inicio;
        }
        else {
            duracao = 24 - inicio + fim;
        }

        System.out.printf("O jogo durou %d horas", duracao);

    }
}
