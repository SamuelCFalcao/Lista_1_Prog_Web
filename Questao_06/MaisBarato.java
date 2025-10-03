package Questao_06;
import java.util.Scanner;

public class MaisBarato {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o preço do produto 1: ");
            double produto1 = scanner.nextDouble();
            
            System.out.println("Digite o preço do produto 2: ");
            double produto2 = scanner.nextDouble();
            
            System.out.println("Digite o preço do produto 3: ");
            double produto3 = scanner.nextDouble();

            if(produto1 <= produto2 && produto1 <= produto3) {
                System.out.println("O mais barato é o produto 1.");
            } else if(produto2 <= produto1 && produto2 <= produto3) {
                System.out.println("O mais barato é o produto 2.");
            } else { 
                System.out.println("O mais barato é o produto 3.");
            }
        }
    }    
}
