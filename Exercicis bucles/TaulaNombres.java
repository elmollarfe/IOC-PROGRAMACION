
import java.util.Scanner;

public class TaulaNombres {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Introdueix el nombre de files ");
        int files = scan.nextInt();
        System.out.print("Introdueix el nombre de columnes ");
        int columnes = scan.nextInt();
        for (int i=0; i<files; i++){
            for(int j = 0; j<columnes; j++){
                
                System.out.print(j + i+ "\t");
            }

            System.out.println();

        }
        scan.close();


    }
    
}
