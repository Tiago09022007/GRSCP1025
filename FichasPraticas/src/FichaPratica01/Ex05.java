package FichaPratica01;

import java.util.Scanner;

public class Ex05 {


    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Introduza a primeira nota: ");
        double nota1 = input.nextDouble();


        System.out.print("Introduza a segunda nota: ");
        double nota2 = input.nextDouble();


        System.out.print("Introduza a terceira nota: ");
        double nota3 = input.nextDouble();


        double media = (nota1 + nota2 + nota3) / 3;

        double mediaAritmética = (nota1 * 0.2) + (nota2 * 0.3) + (nota3 * 0.5);

        System.out.println("mediaAritmética: " + mediaAritmética);





    }
}
