import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string para inverter: ");
        String texto = scanner.nextLine();

        String textoInvertido = inverterString(texto);

        System.out.println("String original: " + texto);
        System.out.println("String invertida: " + textoInvertido);

        scanner.close();
    }

    public static String inverterString(String texto) {
        char[] caracteres = texto.toCharArray();
        int tamanho = caracteres.length;

        // Inverte os caracteres da string
        for (int i = 0; i < tamanho / 2; i++) {
            char temp = caracteres[i];
            caracteres[i] = caracteres[tamanho - i - 1];
            caracteres[tamanho - i - 1] = temp;
        }

        return new String(caracteres);
    }
}
