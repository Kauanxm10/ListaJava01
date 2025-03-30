package exercicio10;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Peso Inicial:");
        float peso = Float.parseFloat(input.nextLine());

        double pesoPrato = peso - 0.450;
        double ValorTotal = (pesoPrato * 39.00);

        System.out.println("Peso Final(com o prato incluso):" + pesoPrato);
        System.out.println("Valor Total:" + ValorTotal);
    }

}
