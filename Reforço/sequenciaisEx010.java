package Reforço;

import java.util.Scanner;

public class sequenciaisEx010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro algarismo: ");
        int n1 = sc.nextInt();
        System.out.print("Digite o segundo algarismo: ");
        int n2 = sc.nextInt();
        System.out.print("Digite o terceiro algarismo: ");
        int n3 = sc.nextInt();

        double algoritmo = (n1 + n2 * 3) + (n3 * 5);
        double divisao = algoritmo / 7;
        String n4 = Double.toString(divisao);
        System.out.printf("%d%d%d", n1, n2, n3);
        System.out.print(n4.charAt(2));
        sc.close();
    }
}
