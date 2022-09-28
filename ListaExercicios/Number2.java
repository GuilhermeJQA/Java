package ListaExercicios;

import java.util.Scanner;

public class Number2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int i = 0;
        while ( i < 10 ) {
            System.out.println("Digite um número inteiro: ");
            int number = read.nextInt();
            if (number % 2 == 0) {
                System.out.println(number + " É par");
                i = i + 1;
            } else {
                System.out.println(number + " É ímpar");
                i = i + 1;
            }

        }
    }
}
