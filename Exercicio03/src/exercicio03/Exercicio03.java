package exercicio03;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Base: ");
        int base = Integer.parseInt(input.nextLine());

        System.out.print("Altura: ");
        int altura = Integer.parseInt(input.nextLine());

        int area = (base * altura);

        int perimetro = 2 * (base + altura);

        System.out.println("Base:" + base);
        System.out.println("altura:" + altura);
        System.out.println("Area:" + area);
        System.out.println("Perimetro:" + perimetro);
    }

}
