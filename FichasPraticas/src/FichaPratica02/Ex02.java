package FichaPratica02;

import java.util.Scanner;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduza um salario: ");
        double salario = input.nextDouble();

        double taxa;
        if (salario <= 15000) {
            taxa = salario * 0.20;
        } else {
            taxa = salario * 0.30;
        }

        double imposto = salario * taxa;

        System.out.printf("Paga taxa de %.0f%%: %.0f%%n", taxa * 100, imposto);


    }
}