package Questao_07;
import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite a primeira nota.");
            double nota1 = scanner.nextDouble();

            System.out.println("Digite a segunda nota.");
            double nota2 = scanner.nextDouble();

            System.out.println("Digite a terceira nota.");
            double nota3 = scanner.nextDouble();

            double media = (nota1 + nota2 + nota3) / 3;

            System.out.println("Sua média foi " + media + ".");

            if(media >= 7) {
                System.out.println("Você foi aprovado!");
            } else {
                System.out.println("Você foi reprovado.");
            }
        }
    }
}
