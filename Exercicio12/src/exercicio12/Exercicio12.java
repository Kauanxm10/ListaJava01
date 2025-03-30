package exercicio12;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Dgite a hora:");
        int hora = Integer.parseInt(input.nextLine());

        System.out.print("Digite os minutos:");
        int min = Integer.parseInt(input.nextLine());

        System.out.print("Digite os segundos:");
        int sec = Integer.parseInt(input.nextLine());

        int calc = 86400 - ((hora * 3600) + (min * 60) + sec);

        System.out.println("Faltam:" + calc + "segundos para acabar o dia.");
    }

}
