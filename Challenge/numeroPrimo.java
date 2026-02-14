package Challenge;

import java.util.Scanner;

public class numeroPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = scanner.nextInt();

        if (Primo(num)) {
            System.out.println(num + " é primo.");
        } else {
            System.out.println(num + " não é primo.");
        }
        scanner.close();
    }


    public static boolean Primo(int n) {
        if (n <= 1) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
