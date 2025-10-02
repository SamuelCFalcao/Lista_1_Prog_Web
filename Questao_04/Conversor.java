import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            
            System.out.println("Digite o valor em metros: ");

            int metros = scanner.nextInt();

            int centimetros = metros * 100;

            System.out.println(metros + " metros equivale a " + centimetros + " centímetros.");
        }
    }
}
