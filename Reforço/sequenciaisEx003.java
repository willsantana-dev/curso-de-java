package Reforço;

import java.util.Scanner;

public class sequenciaisEx003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho do maior lado do triângulo: ");
        double m = sc.nextDouble();
        System.out.print("Agora o lado menor: ");
        double n = sc.nextDouble();

        double l1 = Math.pow(m, 2) - Math.pow(n, 2);
        double l2 = 2 * m * n;
        double hipotenusa = Math.pow(m, 2) + Math.pow(n, 2);

        System.out.println("L1: " + l1);
        System.out.println("L2: " + l2);
        System.out.println("HIPOTENUSA: " + hipotenusa);

        sc.close();
    }
}
