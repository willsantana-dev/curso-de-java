package Reforço;

import java.util.Scanner;

public class sequenciaisEx001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a idade: ");
        int idade = sc.nextInt();

        double minuto = 60.0;
        double hora = minuto * 60.0;
        double dia = hora * 24.0;
        double ano = dia * 365.25;

        double batimentos;
        if (idade >= 0) {
            batimentos = idade * ano;
            System.out.printf("Se a pessoa vivesse %d anos, seu coração iria bater %.2f vezes", idade, batimentos);
        }
        else {
            System.out.print("Informação inválida.");
        }

        sc.close();
    }
}
