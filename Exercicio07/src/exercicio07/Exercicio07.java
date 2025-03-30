package exercicio07;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantidade Cafe:");
        int QCafe = Integer.parseInt(input.nextLine());

        System.out.print("Preco Cafe:");
        float CCafe = Float.parseFloat(input.nextLine());

        System.out.print("Quantidade Leite:");
        int LLeite = Integer.parseInt(input.nextLine());

        System.out.print("Preco Leite:");
        float CLeite = Float.parseFloat(input.nextLine());

        System.out.print("Quantidade Bolacha:");
        int BBolacha = Integer.parseInt(input.nextLine());

        System.out.print("Preco Bolacha:");
        float CBolacha = Float.parseFloat(input.nextLine());

        float TCafe = (QCafe * CCafe);
        float TLeite = (LLeite * CLeite);
        float TBolacha = (BBolacha * CBolacha);
        float GTotal = (TCafe + TLeite + TBolacha);
        //revisar o numero de casas decimais
        System.out.println(GTotal);

    }

}
