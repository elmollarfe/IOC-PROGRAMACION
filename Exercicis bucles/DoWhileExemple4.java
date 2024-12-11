
import java.util.Scanner;
public class DoWhileExemple4 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int edad = 0;
        do{
            System.out.print("Introdueix la teva edad: ");
            edad = scan.nextInt();
            if(edad < 18 ){
                System.out.print("Edat no vàlida. ");
            }

        }
        while(edad < 18);
        System.out.print("Edat vàlidad: " + edad);
        scan.close();
    }

    
}
