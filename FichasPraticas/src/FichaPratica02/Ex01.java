package FichaPratica02;

import java.util.Scanner;


public class Ex01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int num1;
        int num2;


        System.out.print("Insira o 1ª número: ");
        num1 = input.nextInt();


        System.out.print("Insira o 2ª número:"  );
        num2 = input.nextInt();

        if (num1 > num2) {

            System.out.println("Maior: " + num1);

        } else {

            System.out.println("Maior: " + num2);
        }

    }
}
