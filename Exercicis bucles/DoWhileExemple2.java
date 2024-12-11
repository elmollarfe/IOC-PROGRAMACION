public class DoWhileExemple2 {
    public static void main(String[] args) {
        int i = 1;
        do{

            int quadrat =  i*i;
            System.out.println("Quadrat de " + i + " : " + quadrat );
            i++;

        }
        while(i <=5);
    }
    
}
