package exercicio06;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Salario Miinimo: ");
        int Smin = Integer.parseInt(input.nextLine());

        System.out.print("Quantidade Vendida: ");
        int Qnt = Integer.parseInt(input.nextLine());

        System.out.print("Valor das Vendas:");
        int valor = Integer.parseInt(input.nextLine());

        int salarioLiquido = (Smin * 2) + (Qnt * 150) + ((valor * 5) / 100);

        System.out.println("Salario minimo:" + Smin);
        System.out.println("Quantidade  Vendida:" + Qnt);
        System.out.println("Valor das Vendas:" + valor);
        System.out.println("Salario Bruto:" + salarioLiquido);
    }

}
