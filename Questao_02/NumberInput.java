import java.util.Scanner;

public class NumberInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = input.nextInt();
        System.out.println("O número digitado foi: " + numero + ".");
        input.close();
    }
}
