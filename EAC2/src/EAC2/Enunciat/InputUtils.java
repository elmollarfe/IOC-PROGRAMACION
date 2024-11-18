package EAC2.Enunciat;

import java.util.Scanner;

public class InputUtils {

    //Inciem scanner.
    private static Scanner scan = new Scanner(System.in);

    //Creem mètode per a comprovar que sigui correcte l'entrada de text.
    static String readLine() {
        boolean tipusCorrecte = scan.hasNextLine();
        if (tipusCorrecte) {
            String text = scan.nextLine();
            if (text.equals("" ) || text.equals(" ")) {
                System.out.println("Error codi -1");
                return "-1";
            }
            return text;
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
            System.out.println("Codi error -1");
            return -1;
        }
    }        
}
