package FichaPrática06;

import java.util.Scanner;

public class Ex03 {

    public static double media(int a, int b, int c) {
        double resultado;

        resultado = (a + b + c) / 3.0;
        return resultado;
    }

    // Função principal
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, n3;
        double res;

        System.out.print("Introduza o primeiro número: ");
        n1 = input.nextInt();

        System.out.print("Introduza o segundo número: ");
        n2 = input.nextInt();

        System.out.print("Introduza o terceiro número: ");
        n3 = input.nextInt();

        res = media(n1, n2, n3);

        System.out.println("A média é: " + res);
    }
}
