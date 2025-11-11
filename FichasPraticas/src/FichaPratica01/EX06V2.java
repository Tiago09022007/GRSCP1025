package FichaPratica01;

import java.util.Scanner;

public class EX06V2 {

    public static void main (String[] args) {


        Scanner input = new Scanner(System.in);

        int valor1, valor2;

        System.out.print("Insira o valor1: ");
        valor1 = input.nextInt();


        System.out.print("Insira o valor2: ");
        valor2 = input.nextInt();

        System.out.println("\nTroca efetuada...");

        valor1 = valor1 + valor2;
        valor2 = valor1 - valor2;
        valor1 = valor1 - valor2;


        System.out.println("\nvalor1: " + valor1);
        System.out.println("valor2: " + valor2);


    }
}
