package Challenge;

import java.util.Scanner;

public class maiorValor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();
        int n5 = sc.nextInt();

        int maior = n1;

        if (n2 > maior) {
            maior = n2;
        }
        if (n3 > maior) {
            maior = n3;
        }
        if (n4 > maior) {
            maior = n4;
        }
        if (n5 > maior) {
            maior = n5;
        }
        System.out.println("O maior número é: " + maior);
        sc.close();
    }
}