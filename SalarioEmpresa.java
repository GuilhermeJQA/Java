package ListaExercicios;

import java.util.Scanner;

public class SalarioEmpresa {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        float perc = 20;
        int i = 0;
        System.out.println("Digite seu salário: ");
        float sal = read.nextFloat();

            if (sal < 500){
                perc = perc/100;
                float valornovo = sal * perc;
                System.out.println("Você receberá um aumento! \nO seu novo salário será "+ (valornovo + sal)+ " reais");
                i = i + 1;
            }
            else {
                System.out.println("Você não receberá aumento!");
            }

    }
}

