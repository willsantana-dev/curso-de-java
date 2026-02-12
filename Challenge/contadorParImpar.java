package Challenge;

import java.util.Scanner;

public class contadorParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contadorPar = 0;
        int contadorImpar = 0;
        int soma = 0;

        for (int i=0; i<10; i++) {
            int numero = sc.nextInt();
            soma += numero;

            if (numero % 2 == 0) {
                contadorPar += 1;
            }
            else {
                contadorImpar += 1;
            }
        }

        double media = soma / 10.0;

        System.out.println("\nTotal de números pares: " + contadorPar);
        System.out.println("Total de números impares: " + contadorImpar);
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);

        sc.close();
    }
}