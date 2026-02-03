package Reforço;

import java.util.Scanner;

public class sequenciaisEx005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Diga o valor de A: ");
        double a = sc.nextDouble();
        System.out.print("Diga o valor de B: ");
        double b = sc.nextDouble();
        System.out.print("Diga o valor de C: ");
        double c = sc.nextDouble();

        double delta = Math.pow(b, 2) - 4 * a * c;
        System.out.printf("O valor de Delta é: %.2f", delta);

        sc.close();
    }
}
