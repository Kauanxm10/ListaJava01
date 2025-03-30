package exercicio08;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Numero:");
        int num = Integer.parseInt(input.nextLine());

        int Resto = num % 2;
        int Quociente = (num / 2);

        System.out.println("Numero:" + num);
        System.out.println("Quociente:" + Quociente);
        System.out.println("Resto:" + Resto);

    }

}
