
import java.util.Scanner;

public class ForNotes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float notes= 0;
        int sumaNotes=0;


        for(int valorNotes = 1; valorNotes > 0; valorNotes++ ){
            System.out.print("Introdueix una nota: ");
            valorNotes = scan.nextInt();
            if(valorNotes >= 0){
                notes += valorNotes;
                sumaNotes++;
            }
             
        }

        
        
        System.out.println("La nota mitjana és: " + (notes/sumaNotes));
        scan.close();

        

    }

}
    

