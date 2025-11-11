package FichaPratica02;

import java.util.Scanner;

public class Ex13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduza horas: ");
        int horas = scanner.nextInt();

        System.out.print("Introduza minutos: ");
        int minutos = scanner.nextInt();

        String periodo; // AM ou PM

        if (horas == 0) {
            horas = 12;
            periodo = "AM";
        } else if (horas == 12) {
            periodo = "PM";
        } else if (horas > 12) {
            horas -= 12;
            periodo = "PM";
        } else {
            periodo = "AM";

            System.out.printf("- %02d:%02d %s%n", horas, minutos, periodo);

        }
    }
}
