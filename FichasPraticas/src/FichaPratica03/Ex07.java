package FichaPratica03;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {


        // Declarar variáveis
        int num = 1, somatorio = 0;

        while (num <= 100) {
            System.out.println(num);
            somatorio = somatorio + num;
            num = num + 1;
        }

        System.out.println("Somatório: " + somatorio);
    }
}
