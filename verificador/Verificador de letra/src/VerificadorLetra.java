import java.util.Scanner;

public class VerificadorLetra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma string:");
        String input = scanner.nextLine();

        int contador = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c == 'a' || c == 'A') {
                contador++;
            }
        }

        if (contador > 0) {
            System.out.println("A letra 'a' aparece " + contador + " vezes.");
        } else {
            System.out.println("A letra 'a' não aparece na string.");
        }

        scanner.close();
    }
}
