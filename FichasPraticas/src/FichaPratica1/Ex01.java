package FichaPratica1;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero1, numero2, soma;

        System.out.print("Insira o número : ");
        numero1 = input.nextInt();


        System.out.print("Insira outro número : ");
        numero2 = input.nextInt();


        soma = numero1 + numero2;


        System.out.println("Soma: " + soma);


    }
}