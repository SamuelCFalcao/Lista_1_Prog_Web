import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
        System.out.println(" --- Digite as suas notas --- ");

        System.out.println("Primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Terceira nota: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;
        
        System.out.println("Sua média é: " + media);
        }
    }
}