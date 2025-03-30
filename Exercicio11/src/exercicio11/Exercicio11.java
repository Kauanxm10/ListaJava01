package exercicio11;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Dgite a hora:");
        int hora = Integer.parseInt(input.nextLine());

        System.out.print("Digite os minutos:");
        int min = Integer.parseInt(input.nextLine());

        System.out.print("Digite os segundos:");
        int sec = Integer.parseInt(input.nextLine());

        int calc = (hora * 3600) + (min * 60) + sec;

        System.out.println("Ja se passaram:" + calc + "segundos.");

    }

}
