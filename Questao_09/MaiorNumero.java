package Questao_09;
import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicita os três números
            System.out.print("Digite o primeiro número: ");
            double numero1 = scanner.nextDouble();
            
            System.out.print("Digite o segundo número: ");
            double numero2 = scanner.nextDouble();
            
            System.out.print("Digite o terceiro número: ");
            double numero3 = scanner.nextDouble();
            
            double maior = numero1;
            
            if (numero2 > maior) {
                maior = numero2;
            }
            
            if (numero3 > maior) {
                maior = numero3;
            }
            System.out.println("O maior número é: " + maior);
        }
    }    
}
