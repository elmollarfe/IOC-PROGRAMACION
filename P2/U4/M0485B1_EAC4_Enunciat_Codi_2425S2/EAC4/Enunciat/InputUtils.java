package EAC4.Enunciat;

import java.util.Scanner;

public class InputUtils {

    // Fent la variable estàtica, assegurem que només es fa servir un Scanner
    // i que, a més, tothom fa servir el mateix. 
    private static Scanner scan = new Scanner(System.in);
    
    //Definim quins són els codis d'error
    public static final int INPUT_ERROR = -1;
    private static int valorBuitMin = Integer.MIN_VALUE; 
    private static int valorBuitMax = Integer.MAX_VALUE;
    static String buit = "";

    //La lectura d'un String mai pot donar un error
    public static String readLine() {
       return readLine(buit);
    }

    //readLine amb missatge.

    public static String readLine(String msg){
        System.out.print(msg);
        return scan.nextLine();
    }

    //Primer realitzem el mètode més complet on aquest mètode serà cridat per els altres mètodes.
     public static int readInt(String msg, int valorMin, int valorMax, String err){
        System.out.print(msg);
        boolean esCorrecte = false; 
        int resultat = -1;

        //Ho demanarà tantes vegades com calgui fins que s'entri un valor vàlid
     
        while (!esCorrecte) {
            if(!scan.hasNextInt()){
                System.out.println(err);
                scan.next();
            } else {
                    resultat = scan.nextInt();
                if(resultat< valorMin || resultat > valorMax){
                    System.out.println(err);
                }else{
                    esCorrecte = true;
                }
            }
            
        }
 
        return resultat;
     }


     public static int readInt(String msg, String err ){
        return readInt(msg , valorBuitMin ,  valorBuitMax, err);
     }

     public static int readInt(String msg, int valorMin, int valorMax){
        return readInt(msg, valorMin, valorMax, "Error els nombres no están dins del valor. Te que estar entre " + valorMin + " y " + valorMax);
     }


     public static int readInt(String msg){
        return readInt(msg, valorBuitMin, valorBuitMax, buit);
     }

    //La lectura d'un enter pot donar error si el que hi ha a l'entrada 
    // no és un enter. Cal controlar-lo
    public static int readInt(){
        int resultat;
        //Ho demanarà tantes vegades com calgui fins que s'entri un valor vàlid
        while (!scan.hasNextInt()) {
            scan.next();
            System.out.println("El valor ha de ser numèric, torna a intentar-ho");
        }
        resultat = scan.nextInt();
 
        return resultat;
    }

    public static boolean readBoolean(){
        boolean resultat = false;
        boolean entradaCorrecta = false; 
        do{
            String lletra = readLine();
            if(lletra.equalsIgnoreCase("S")){
                resultat = true;
                entradaCorrecta = true;
            } else if(lletra.equalsIgnoreCase("N")){
                resultat = false; 
                entradaCorrecta = true;
            } else{
                System.out.println("El valor no es correcte. S/N");
            }

        }while(!entradaCorrecta);
        
        return resultat;

    }

    //Cal definir un mètode per tancar l'Scanner
    public static void close() {
        scan.close();
    }
}

