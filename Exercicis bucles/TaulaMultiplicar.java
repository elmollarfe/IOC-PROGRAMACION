public class TaulaMultiplicar {
    public static void main(String[] args) {
        for(int fila = 0; fila<=5; fila++){
            for(int columna = 0; columna<5; columna ++){
                System.out.print( fila*columna + "\t" );
            }
            System.out.println(" ");
        }
    }
}
