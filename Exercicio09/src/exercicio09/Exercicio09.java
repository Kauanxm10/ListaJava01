package exercicio09;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Digite os segundos do video:");
        int video = Integer.parseInt(input.nextLine());
        
        int sec = video % 60;
       int restMin = video / 60;
        int min = restMin % 60;      
        int hora = restMin / 60;
        
        System.out.println(hora+"h"+min+"m"+sec+"s");
        
        

        
        
        
      
    }

}
