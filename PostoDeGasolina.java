package ListaExercicios;

import java.util.Scanner;

public class PostoDeGasolina {
    public static void main(String[] args) {
        var gasolina = 2.50;
        var refrigerante = 3.00;
        Scanner read = new Scanner(System.in);
        System.out.println("Quantos litros de gasolina foram necessários?");
        float gas = read.nextFloat();
        System.out.println("Quantos refrigerantes foram comprados?");
        float ref = read.nextFloat();

        gas = (float) (gasolina * gas);
        ref = (float) (refrigerante * ref);

        System.out.println("Total a pagar:"+ (gas + ref)+ " reais");
    }
}
