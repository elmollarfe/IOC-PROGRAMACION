
import java.util.Scanner;

public class WhileExemple4 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        boolean correcte = false;
        
        while (!correcte){
            System.out.print("Introduix una assignatura (escriu fi per acabar) :" );
            String assignatura = scan.nextLine();
            if(assignatura.equals("fi")){
                correcte = true;    
            }
              
        }

        scan.close();
    }

        
}
