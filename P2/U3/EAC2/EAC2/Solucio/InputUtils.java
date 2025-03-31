package EAC2.Solucio;

import java.util.Scanner;

public class InputUtils {

    static Scanner scan = new Scanner(System.in);

    private final static int ERROR = -1; 


    public static String readLine(){
        return scan.nextLine();
    }

    public static int readInt(){
        int nombre ; 
        if(scan.hasNextInt()){
            nombre = scan.nextInt();
        }else{
            scan.next();
            nombre = ERROR;            
        }
        
        return nombre;
    }

   
        public static double readDecimal() {
            double number;
            while (true) {
                System.out.print("Ingrese un número decimal: ");
                if (scanner.hasNextDouble()) {
                    number = scanner.nextDouble();
                    break;
                } else {
                    System.out.println("Entrada no válida. Por favor, ingrese un número decimal válido.");
                    scanner.next(); // Descarta la entrada incorrecta
                }
            }
            return number;
        }
    }

    

