package Reforço;

import java.util.Locale;
import java.util.Scanner;

public class sequenciaisEx008 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome da primeira pessoa: ");
        String nome1 = sc.next();
        System.out.print("Idade da primeira pessoa: ");
        int idade1 = sc.nextInt();
        System.out.print("Peso da primeira pessoa: ");
        double peso1 = sc.nextDouble();

        System.out.print("Nome da segunda pessoa: ");
        String nome2 = sc.next();
        System.out.print("Idade da segunda pessoa: ");
        int idade2 = sc.nextInt();
        System.out.print("Peso da segunda pessoa: ");
        double peso2 = sc.nextDouble();

        System.out.print("Nome da terceira pessoa: ");
        String nome3 = sc.next();
        System.out.print("Idade da terceira pessoa: ");
        int idade3 = sc.nextInt();
        System.out.print("Peso da terceira pessoa: ");
        double peso3 = sc.nextDouble();

        double media = (peso1 + peso2 + peso3) / 3;

        System.out.println("Idade 1 = " + idade1);
        System.out.println("Idade 2 = " + idade2);
        System.out.println("Idade 3 = " + idade3);
        System.out.printf("O peso médio é: %.2f", media);

        sc.close();
    }
}
