package Exercises;

import java.util.Scanner;

public class ex013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Vote no produto de sua prefêrencia.");
        System.out.println("\n1. Álcool");
        System.out.println("2. Gasolina");
        System.out.println("3. Diesel");
        System.out.println("4. Fim\n");

        System.out.println("------------------\n");

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (true) {
            int codigo = sc.nextInt();

            if (codigo == 4) {
                break;
            }

            switch (codigo) {
                case 1:
                    alcool++;
                    break;
                case 2:
                    gasolina++;
                    break;
                case 3:
                    diesel++;
                    break;
                default:
                    // código inválido, ignora
                    break;
            }
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}
