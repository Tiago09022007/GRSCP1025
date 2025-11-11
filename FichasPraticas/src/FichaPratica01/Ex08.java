package FichaPratica01;

import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        // Declarar as variáveis
        int minutosLidos, segundosLidos, totalSegundos = 0;

        // Ler duração do album

        // ________________________________________ MÚSICA 1 ________________________________________
        System.out.print("Insira os minutos da 1º música: ");
        minutosLidos = input.nextInt();

        System.out.print("Insira os segundos da 1º música: ");
        segundosLidos = input.nextInt();

        totalSegundos = totalSegundos + (minutosLidos * 60) + segundosLidos;

        // ________________________________________ MÚSICA 2 ________________________________________
        System.out.print("Insira os minutos da 2º música: ");
        minutosLidos = input.nextInt();

        System.out.print("Insira os segundos da 2º música: ");
        segundosLidos = input.nextInt();

        totalSegundos = totalSegundos + (minutosLidos * 60) + segundosLidos;

        // ________________________________________ MÚSICA 3 ________________________________________
        System.out.print("Insira os minutos da 3º música: ");
        minutosLidos = input.nextInt();

        System.out.print("Insira os segundos da 3º música: ");
        segundosLidos = input.nextInt();

        totalSegundos = totalSegundos + (minutosLidos * 60) + segundosLidos;

        // ________________________________________ MÚSICA 4 ________________________________________
        System.out.print("Insira os minutos da 4º música: ");
        minutosLidos = input.nextInt();

        System.out.print("Insira os segundos da 4º música: ");
        segundosLidos = input.nextInt();

        totalSegundos = totalSegundos + (minutosLidos * 60) + segundosLidos;

        // ________________________________________ MÚSICA 5 ________________________________________
        System.out.print("Insira os minutos da 5º música: ");
        minutosLidos = input.nextInt();

        System.out.print("Insira os segundos da 5º música: ");
        segundosLidos = input.nextInt();

        totalSegundos = totalSegundos + (minutosLidos * 60) + segundosLidos;


        System.out.println("Tota Segundos: " + totalSegundos);

        // Calcular o total de: horas, minutos, segundos
        int horas, minutos, segundos;

        horas = totalSegundos / 3600;
        minutos = (totalSegundos / 60) - (horas * 60);
        segundos = totalSegundos - (horas * 3600) - (minutos * 60);

        System.out.println(horas + "h " + minutos + "m " + segundos + "s");
    }
}
