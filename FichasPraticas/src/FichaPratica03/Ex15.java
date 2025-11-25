package FichaPratica03;

import java.util.Scanner;

public class Ex15 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro não-negativo: ");
        int n = input.nextInt();

        int i = n;
        long fatorial = 1;

        while (i > 1) {
            fatorial *= i;
            i--;
        }

        System.out.println("Fatorial de " + n + " = " + fatorial);
    }
}
