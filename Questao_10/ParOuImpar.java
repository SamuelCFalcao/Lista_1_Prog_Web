package Questao_10;
import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um número inteiro: ");
            int numero = scanner.nextInt();
            
            if (numero % 2 == 0) {
                System.out.println("O número " + numero + " é par.");
            } else {
                System.out.println("O número " + numero + " é ímpar.");
            }
        }
    }
}