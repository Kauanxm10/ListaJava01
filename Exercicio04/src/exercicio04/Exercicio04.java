package exercicio04;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Temperatura em Celsius: ");
        float C = Float.parseFloat(input.nextLine());

        //double F = (C * 1.8) + 32;
        float F = (C * 9 / 5) + 32;

        System.out.println("Celsius:" + C);
        System.out.println("Fahrenheit:" + F);

    }

}
