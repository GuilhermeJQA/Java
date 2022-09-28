package ListaExercicios;

import java.util.Scanner;

public class Number5 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Qual o seu salário bruto?");
        float sal = read.nextFloat();
        System.out.println("Qual o valor da prestação");
        float prest = read.nextFloat();
        var x = (sal * 0.3);
        if (prest < x){
            System.out.println("Empréstimo concedido!");
        }
        else {
            System.out.println("Empréstimo não concedido!");
        }
    }
}
