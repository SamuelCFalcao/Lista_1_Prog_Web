package Questao_05;
import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o raio do círculo em centímetros: ");

            double raio = scanner.nextDouble();
            double area = Math.PI * Math.pow(raio, 2);

            System.out.println("A área do círculo é: " + area + " centímetros quadrados.");
        }
    }    
}
