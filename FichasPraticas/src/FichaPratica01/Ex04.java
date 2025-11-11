package FichaPratica01;

import java.util.Scanner;

public class Ex04 {


       public static void main (String[] args) {

           Scanner input = new Scanner(System.in);


           System.out.print("Digite a area da circunferência: ");
           double raio = input.nextDouble();


           double area = Math.PI * Math.pow(raio,2);

           System.out.printf("A area da circunferência é; ", area);



       }
}


