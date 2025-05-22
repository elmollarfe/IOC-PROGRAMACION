import java.util.SequencedSet;

public class piramide {

    public static void main(String[] args) {
        
        int numFilas = 10; 
        int numColumnas = 2* numFilas -1;
        int comptador = 0;
        int centro = numColumnas/2;

        for (int i = 0; i < numFilas ; i++){
            comptador = 0; 

            for (int j = 0; j< numColumnas; j++){
                if(j >= (centro - i ) && j<=(centro +i) ){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
        }    System.out.println(" ");

    }
}
}