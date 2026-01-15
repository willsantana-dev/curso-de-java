import java.util.Scanner;
import java.util.Locale;

public class ex001 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double a = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        double b = sc.nextDouble();
        System.out.print("Digite o terceiro número: ");
        double c = sc.nextDouble();

        double triangulo = a * c / 2;
        double circulo = Math.PI * Math.pow(c, 2);
        double trapezio = (a + b) * c / 2;
        double quadrado = b * b;
        double retangulo = a * b;

        System.out.printf("%nTriângulo: %.3f", triangulo);
        System.out.printf("%nCírculo: %.3f", circulo);
        System.out.printf("%nTrapézio: %.3f", trapezio);
        System.out.printf("%nQuadrado: %.3f", quadrado);
        System.out.printf("%nRetângulo: %.3f", retangulo);

        sc.close();
    }
}