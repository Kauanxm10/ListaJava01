package exercicio13;

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu peso:");
        float peso = Float.parseFloat(input.nextLine());

        float eng = peso + ((peso * 15) / 100);

        float emag = peso - ((peso * 20) / 100);

        System.out.println("Peso se engordar:" + eng);
        System.out.println("Peso se emagrecer:" + emag);
    }

}
