package exercicio05;

import java.util.Scanner;

public class Exercicio05 {

    //          System.out.println("Valor 3:" + V3);
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantidade do tipo 1:");
        int Q1 = Integer.parseInt(input.nextLine());

        System.out.print("Quantidade do tipo 2:");
        int Q2 = Integer.parseInt(input.nextLine());

        System.out.print("Quantidade do tipo 3:");
        int Q3 = Integer.parseInt(input.nextLine());

        double V1 = (1.5 * Q1);

        double V2 = (2.0 * Q2);

        double V3 = (0.75 * Q3);

        double Vtotal = (V1 + V2 + V3);

        System.out.println("Quantidade 1:" + Q1);
        System.out.println("Quantidade 2:" + Q2);
        System.out.println("Quantidade 3:" + Q3);
        System.out.println("Valor 1:" + V1);
        System.out.println("Valor 2:" + V2);
        System.out.println("Valor 3:" + V3);
        System.out.println("Total:" + Vtotal);

    }

}
