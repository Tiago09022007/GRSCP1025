package FichaPratica1;

import java.util.Scanner;

public class EX02 {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double numero1, numero2, resultado;


        System.out.print("Insira o numero : ");
        numero1 = input.nextDouble();

        System.out.print("Insira outro numero: ");
        numero2 = input.nextDouble();


        resultado = numero1 + numero2;
        System.out.println("Soma: " + resultado);



        resultado = numero1 - numero2;
        System.out.println("Subtração: " + resultado);



        resultado = numero1 * numero2;
        System.out.println("Multiplicaçao: " + resultado);



        resultado = numero1 / numero2;
        System.out.println("Divisão: " + resultado);



    }
}
