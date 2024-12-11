public class ProvaSumaParells {
    public static void main(String[] args) {
        // Executem el mètode sumaParells de Suma20 i comprovem el resultat amb assercions
        Suma20 sumaParells = new Suma20();
        int suma = sumaParells.sumaParells();
        assert suma == 420 : "Error la suma dels 20 primers ha de ser 420";

        
        // Comprovem que la suma sigui 420
        System.out.println(suma);
        
        // Missatge final si s'han superat les proves
        System.out.println("Totes les proves han passat correctament!");

    }
}