public class WhileExempleArray {
    public static void main(String[] args) {
        int [] numeros =  new int [5];
        int i=0;
        while( i < numeros.length){
            numeros[i] = i+1;
            System.out.println(numeros[i]);
            i++;

        }

    }
    
}
