package ListaExercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Number7 {


    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        var diaria = 40.0;
        var taxa = 0;
        var total = 0;
        var i = 0;
        while (i < 5) {
            System.out.println("\nQual o seu nome? ");
            var nome = read.next();
            System.out.println("Qual a quantidade de dias na pousada? ");
            var dias = read.nextInt();
            if (dias < 10) {
                taxa = 15;
            }
            else {
                taxa = 10;
            }
            int valorTotal = (int) ((dias * diaria) + taxa);
            System.out.println("Nome: " + nome + "\n" +
                    "Valor da conta:" +valorTotal);
            i++;
            total += valorTotal;

        }
        System.out.println("Valor arrecadado :"+total);
    }
}
