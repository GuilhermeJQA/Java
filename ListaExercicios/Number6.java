package ListaExercicios;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Number6 {
    public static double tirarMedia(List<Double> lista) {
        return lista.stream()
                .mapToDouble(a -> a)
                .average().orElse(0);
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        List lista = new ArrayList();

        var i = 0;
        var aprovados = 0;
        var reprovados = 0;
        var exame = 0;
        var aluno = 1;

        while (i < 6) {
            System.out.println("Aluno " + aluno);
            aluno++;
            System.out.println("Digite a nota 1:");
            float nota1 = read.nextFloat();
            System.out.println("Digite a nota 2");
            float nota2 = read.nextFloat();
            double media = (nota1 + nota2) / 2;
            lista.add(media);

            System.out.println("Sua média foi:" + media);
            if (media > 7) {
                aprovados++;
            }
            if (media < 3) {
                reprovados++;
            } else {
                exame++;
            }
            i++;
        }

        double mediaTotal = tirarMedia(lista);
        DecimalFormat formatador = new DecimalFormat("0.00");
        System.out.println("As médias dos alunos foram respectivamente: "+lista );
        System.out.println("O número de aprovados foi: " +aprovados);
        System.out.println("O número de em exame foi: "+ exame);
        System.out.println("O número de reprovados foi: "+reprovados);
        System.out.printf("A média total da turma foi: " + formatador.format(mediaTotal));
    }
}