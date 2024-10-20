package EAC2.Enunciat;

import java.util.Scanner;

public class InputUtils {

    //Inciem scanner.
    private static Scanner scan = new Scanner(System.in);

    //Creem mètode per a comprovar que sigui correcte l'entrada de text.
    static String readLine() {
        boolean tipusCorrecte = scan.hasNextLine();
        if (tipusCorrecte) {

            return scan.nextLine();

        } else { 
            return "-1";
        }
    }

    //Creem mètode per a comprovar que sigui correcte l'entrada de nombres enters.
    static int readInt() {
        boolean tipusCorrecte = scan.hasNextInt();
        if (tipusCorrecte) {
            return scan.nextInt();
        } else {
            System.err.println("Codi error -1");
            return -1;
        }
    }
        
}
