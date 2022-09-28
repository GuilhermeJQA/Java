package ListaExercicios;
import java.util.Scanner;
public class Number1 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);

        System.out.println("Digite seu crédito: ");
        float cred = read.nextFloat();
        System.out.println("Número de créditos: " + cred);

        System.out.println("Digite o percentual de aumento:");
        float perc = read.nextFloat();
        System.out.println("O percentual de aumento é:");

        perc = perc/100;
        float valorNovo = cred * perc;
        System.out.println("O novo valor será: " + (valorNovo + cred ));

    }
}
