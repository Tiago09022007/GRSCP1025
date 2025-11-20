package FichaPratica03;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {

        // CTRL + ALT + L

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num = 0, limite;

        // Ler limite
        System.out.print("Insira o limite: ");
        limite = input.nextInt();

        while (num <= limite){
            System.out.println(num);
            num = num + 1;
        }


    }
}