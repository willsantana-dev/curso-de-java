package Exercises;
import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n1 = scanner.nextInt();

        if (n1 % 2 == 0) {
            System.out.print("PAR");
        }
        else {
            System.out.print("ÍMPAR");
        }
        scanner.close();
    }
}
