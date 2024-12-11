
import java.util.Scanner;



public class Exercicis_explicacio_bucles {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        
        /* int i= 0;

        if(i==0)
        System.out.println("comença el bucle");
        i++;


        while (i<5){
            System.out.println(i);
            i++; 
        }
 */
  /*       int [] array = new int [5];
       

        array[0] =9;
        array[1] =8;
        array[2] =7;
        array[3] =6;
        array[4] =5;
        
        int valorArray = array [4];
        
        

        int [] numeros ={1,2,3,4,5};
        int valorArray2 = numeros[0];
        System.out.println(valorArray);

        numeros[0] = 10;

        valorArray2 = numeros[0];

        System.out.println(valorArray2);

        System.out.println(numeros.length);
 *//* 


    int j = 0;
    
    int [] numeros = {1,2,3,4,5};
        while (j<numeros.length){
            System.out.println("Valor posicio " + j + " : " + numeros[j] );
            j++;

        }

        System.out.println("Introduix un nombre per veure els seus múltiples");
        int num = scan.nextInt();
        int comptador = num;
        while (comptador <= 100) {
            System.out.println("Multiple de " + num + " : " + comptador);
            comptador += num;
            
        }

 */
/* 
        int temps = 10;
        int comptador = temps; 
        while (comptador > 0){
            System.out.println("Temps enrere " + comptador );
            comptador--; 
        }
         */

         /* boolean correcte = false;
         int num =0;
         while (!correcte){
            System.out.println("Introduix un nombre enter: ");
            if(scan.hasNextInt()){
                num = scan.nextInt();
                correcte = true;
            }else {
                System.out.println("Error: no es numero enter " );
                scan.next();
            }
         }
         System.out.println("Has introduit: " + num );


          */

/*           int nota;
          
          do{
            System.out.println("Introduix una nota entre 1 i 10: ");
            nota = scan.nextInt();
           }
          while(nota < 1 || nota > 10 );

          System.out.println("Has introduït la nota: " + nota);
         scan.close(); */

         
         for(int i=0;i<=5; i++ ){
            System.out.println(i*2);
        

         }

    }

}


