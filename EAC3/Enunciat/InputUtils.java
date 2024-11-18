package EAC3.Enunciat;

import java.util.Scanner;

public class InputUtils { 

    // Fent la variable estàtica, assegurem que només es fa servir un Scanner
    // i que, a més, tothom fa servir el mateix.
    private static Scanner scan = new Scanner(System.in);

    // Definim quin és el codi d'error
    public static final int INPUT_ERROR = -1;

    // La lectura d'un String mai pot donar un error
    public static String readLine() {
        return scan.nextLine();
    }

    // La lectura d'un enter pot donar error si el que hi ha a l'entrada
    // no és un enter. Cal controlar-lo
    public static int readInt() {

        int resultat = 0;
        boolean tipusCorrecte = scan.hasNextInt(); 
        while (!tipusCorrecte) {
            scan.next();
            System.out.println("El valor introduit ha de ser un nombre: ");
            tipusCorrecte = scan.hasNextInt();
        }

        resultat = scan.nextInt();

        return resultat;

    }

    // Caldria definir un mètode per tancar l'Scanner
    public static void close() {
        scan.close();
    }
}
