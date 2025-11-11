package FichaPratica02;

import java.util.Scanner;

public class Ex16 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduza um valor em euros (múltiplo de 5): ");
        int valor = scanner.nextInt();

        // Verifica se o valor é múltiplo de 5
        if (valor % 5 != 0 || valor <= 0) {
            System.out.println("Valor inválido! Deve ser um múltiplo positivo de 5.");
        } else {
            int valorOriginal = valor;

            int notas200 = valor / 200;
            valor %= 200;

            int notas100 = valor / 100;
            valor %= 100;

            int notas50 = valor / 50;
            valor %= 50;

            int notas20 = valor / 20;
            valor %= 20;

            int notas10 = valor / 10;
            valor %= 10;

            int notas5 = valor / 5;
            valor %= 5;

            // Exibe o resultado
            System.out.println("\nValor lido: " + valorOriginal + "€");
            System.out.println("Relação de notas necessárias:");
            if (notas200 > 0) System.out.println("Notas de 200€: " + notas200);
            if (notas100 > 0) System.out.println("Notas de 100€: " + notas100);
            if (notas50 > 0)  System.out.println("Notas de 50€: " + notas50);
            if (notas20 > 0)  System.out.println("Notas de 20€: " + notas20);
            if (notas10 > 0)  System.out.println("Notas de 10€: " + notas10);
            if (notas5 > 0)   System.out.println("Notas de 5€: " + notas5);
        }
    }
}
