package FichaPratica02;

import java.util.Scanner;

public class Ex09 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int num1, num2, num3;

        System.out.print("Insira o 1ª número: ");
        num1 = input.nextInt();

        System.out.print("Insira o 2ª número");
        num2 = input.nextInt();

        System.out.print("Insira o 3ª número");
        num3 = input.nextInt();

        if (num1 < num2 && num1 < num3) {
            System.out.println("Menor: " + num1);

        }

    }

}
