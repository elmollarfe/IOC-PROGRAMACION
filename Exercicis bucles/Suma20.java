public class Suma20 {
     // Mètode que calcula la suma dels 20 primers números parells
     public static int sumaParells() {
        int suma = 0;
        int inc = 2; // Comencem amb el primer nombre parell 
        for (int i = 0; i < 20; i++) { 
            suma += inc; 
            inc += 2; // Obtenim el següent nombre parell 
        }
        return suma;
    
    }
}
