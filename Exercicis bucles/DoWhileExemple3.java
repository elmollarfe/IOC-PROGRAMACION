
import java.util.Scanner;

public class DoWhileExemple3 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int i = 0;

    
        
        do{
            System.out.print("Introdueix un nombre positiu: ");
            i = scan.nextInt();
            if(i<0){
                System.out.print("Nombre incorrecte. ");

            }


        }while(i<0);

        System.out.print("Nombre vàlid: " + i);


        scan.close();
        
    }
    
}
