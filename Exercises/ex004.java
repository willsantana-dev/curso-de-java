package Exercises;
import java.util.Scanner;

public class ex004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int a = sc.nextInt();
        System.out.print("Digite outro número: ");
        int b = sc.nextInt();

        if (a % b == 0 || b % a == 0) {
            System.out.print("São multiplos");
        }
        else {
            System.out.print("Não são multiplos");
        }

        sc.close();
    }
}
