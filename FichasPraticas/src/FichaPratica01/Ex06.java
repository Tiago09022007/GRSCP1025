package FichaPratica01;

import java.util.Scanner;

public class Ex06 {

    public static void main (String[] args){


        Scanner input = new Scanner(System.in);

        int valor1, valor2, aux;

        // Ler valores
        System.out.print("Insira o 1º valor: ");
        valor1 = input.nextInt();

        System.out.print("Insira o 2º valor: ");
        valor2 = input.nextInt();

        // Troca
        System.out.println("\nTroca efetuada...");

        aux = valor1;
        valor1 = valor2;
        valor2 = aux;


        // Apresentar os valores
        System.out.println("\nValor 1: " + valor1);
        System.out.println("Valor 2: " + valor2);
    }


    }



