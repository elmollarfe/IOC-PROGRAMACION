public class vores {
    public static void main(String[] args) {
        int n = 6;
        int comptador = 0;
        int valorCerca = 8;
        boolean trobat = false;
        String resultat = "Ha finlitxat el programa";
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n && !trobat; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    
                    if(comptador == 0 || comptador%2 == 0){
                        if(comptador != valorCerca){
                            System.out.print(comptador);
                        }else{
                            trobat= true;
                            resultat = "aturat";
                        }
                        
                    } else if(!trobat) {
                        System.out.print("*");
                    }
                    // Imprimir *. És una vora
                    comptador++;
                    
                } else {
                    // Imprimir espai en blanc
                    System.out.print(" ");
                }
            }
            // Sal de línia al final de cada fila
            System.out.println();
            
        }

        System.out.println(resultat);
    }

}
