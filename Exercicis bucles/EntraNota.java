import java.util.Scanner;

public class EntraNota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nota;

        System.out.print("Introdueix una nota entre 0 i 14: ");
        nota = scanner.nextInt();

        // Utilitzem una asserció per comprovar que la nota està entre 0 i 14
        assert (nota >= 0 && nota <= 14) : "Error: La nota ha d'estar entre 0 i 14";

        System.out.println("Nota vàlida: " + nota);
        scanner.close();
    }
}

