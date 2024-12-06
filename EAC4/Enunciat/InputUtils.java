package EAC4.Enunciat;

import java.util.Scanner;

public class InputUtils {

    // Fent la variable estàtica, assegurem que només es fa servir un Scanner
    // i que, a més, tothom fa servir el mateix.
    private static Scanner scan = new Scanner(System.in);

    // La lectura d'un String mai pot donar un error
    public static String readLine() {
        return scan.nextLine();
    }

    //Fem una funció on passarem per paràmetre el missatge que volem mostrar.
    public static String readLine(String msg) {
        System.out.println(msg);
        return readLine();
    }

    public static int readInt() {
        return readIntwithError("El valor ha de ser numèric. Torna-ho a provar: ");
    }

    // La lectura d'un enter pot donar error si el que hi ha a l'entrada
    // no és un enter. Cal controlar-lo
    public static int readIntwithError(String err) {
        int resultat;

        while (!scan.hasNextInt()) {
            System.out.println(err);
            // Ignorar el valor invàlid
            scan.next();
        }

        // Ara ja estem segurs que serà un valor vàlid. Llegir el valor i retornar-lo
        resultat = scan.nextInt();
        return resultat;
    }

    //Fem una funció on passarem per paràmetre el missatge que volem mostrar i cridarem a l'altra funció
    //per a que controle que siga realment un enter.
    public static int readInt(String msg) {
        System.out.println(msg);
        return readInt();
    }

    //Fem una funció on mostra per paràmetre el missatge que volem mostrar i rebutjem un valor
    //que no sigui comprés entre el valorMax i valorMin.
    public static int readInt(String msg, int valorMin, int valorMax) {
        System.out.println(msg);
        int valor = readInt();      
        if(valor < valorMin || valor > valorMax){
             valor =-1;
        } 
        return valor;
    }

    //Creem un mètode que mostra el missatge abans de demanar la dada i en cas de ser un tipus erroni
    //mostra el missatge error abans de tornar a demanar la dada. 

    public static int readInt(String msg, String err){
        System.out.println(msg);
        return readIntwithError(err);
    }

    //creem un metode que mostra el mitssatge abans de demanar les dades, rebutja qualsevol valor que no estigui entre valorMax i valorMin
    //En cas de ser un tipus erroni mostra el missatge d'error abans de tornar a demanar la dada. 

    public static int readInt(String msg, int valorMin, int valorMax, String err){
        System.out.println(msg);
        int valor = readIntwithError(err);
        while(valor < valorMin || valor > valorMax){
            System.out.println(err);
            valor = readIntwithError(err);
       }  
       
        return valor;
    }


    // Caldria definir un mètode per tancar l'Scanner
    public static void close() {
        scan.close();
    }
}
