
import java.util.Scanner;

public class EntrNota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Introdueix una nota entre 0 i 10 : ");

        boolean correcte = false;

        while(!correcte){
            int nota = scan.nextInt();
                if(nota < 0 || nota >= 11){
                    System.out.print("Nota incorrecta. "+"Introdueix una nota entre 0 i 10 : ");
                } else {
                correcte = true;
                System.out.println("Nota valida:" + nota);
                }
                
            }   scan.close();
        
        }
    } 
    
