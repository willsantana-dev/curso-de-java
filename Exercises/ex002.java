package Exercises;
import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        if (numero >= 1 ) {
            System.out.println("POSITIVO");
        }
        else if (numero == 0) {
            System.out.println("NEUTRO");
        }
        else {
            System.out.println("NEGATIVO");
        }
        sc.close();
    }
}
