
public class ArrayAsterisc {
    public static void main(String[] args) {
        int[] nombres = {1, 3, 5, 2};  // Array de nombres sencers
        int count;
        for (int nombre : nombres) { // Recorrem cada element de l'array amb un for-each
            count = 0;
            while (count < nombre) { // Mostrem 'nombre' asteriscs amb un while
               // Punt de depuració: mostra el valors de nombre i count
                System.out.print("*");
                count++;
            }
            System.out.println(); // Nova línia després de cada sèrie d'asteriscs
        }
    }
}
