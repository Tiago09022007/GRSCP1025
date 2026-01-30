package FichaPrática06;

import java.util.Scanner;

public class Ex02 {

    public static int numeroMaisPequeno(int a, int b, int c) {
        int menor = a;

        if (b < menor) {
            menor = b;
        }
        if (c < menor) {
            menor = c;
        }

        return menor;
    }

    // Função principal
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, n3, resultado;

        System.out.print("Introduza o primeiro número: ");
        n1 = input.nextInt();

        System.out.print("Introduza o segundo número: ");
        n2 = input.nextInt();

        System.out.print("Introduza o terceiro número: ");
        n3 = input.nextInt();

        resultado = numeroMaisPequeno(n1, n2, n3);

        System.out.println("O número mais pequeno é: " + resultado);
    }
}
