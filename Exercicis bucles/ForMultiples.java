import java.util.Scanner;

public class ForMultiples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduix un nombre per veure els seus multiples");
        int tabla = scan.nextInt();
        for(int i = 0; i<=100; i++){
            System.out.println(tabla*i);

        }
        scan.close();
    }
    
}
