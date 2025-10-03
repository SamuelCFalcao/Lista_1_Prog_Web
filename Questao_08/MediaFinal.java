package Questao_08;
import java.util.Scanner;

public class MediaFinal {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite a sua primeira nota.");
            double nota1 = scanner.nextDouble();

            System.out.println("Digite a sua segunda nota.");
            double nota2 = scanner.nextDouble();

            double media = (nota1 + nota2) / 2;

            if(media >= 7) {
                System.out.println("Parabéns, você foi aprovado!");
            } else if (media < 7 && media >= 4) {
                System.out.println("Você ficou de AF.");

                System.out.println("Digite a sua nota na AF.");
                double notaAF = scanner.nextDouble();

                double MF = (media + notaAF) / 2;
                System.out.println("Sua média final é " + MF + ".");

                if(MF >= 5) {
                    System.out.println("Parabéns, você foi aprovado!");
                } else {
                    System.out.println("Você foi reprovado.");
                }
            } else {
                System.out.println("Você foi reprovado.");
            }
        }
    }    
}
