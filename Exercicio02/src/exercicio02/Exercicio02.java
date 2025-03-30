package exercicio02;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insira o primeiro valor: ");
        int A = Integer.parseInt(input.nextLine());

        System.out.print("Insira o segundo valor: ");
        int B = Integer.parseInt(input.nextLine());

        int SQ = (A + B) * (A + B);

        System.out.println("A:" + A);
        System.out.println("B:" + B);
        System.out.println("SQ:" + SQ);

    }

}
