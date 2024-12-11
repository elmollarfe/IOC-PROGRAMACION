package EAC4.Enunciat;

import java.util.Arrays;

public class Medaller {
    private static final int MAX_PAISOS = 200;

    private static Pais[] paisosMedalla = new Pais[MAX_PAISOS];
    private static int totalPaisos = 0;

    public static void afegirPais(Pais pais) {
        boolean trobat = false;
        Pais paisMedalla;
        for (int i = 0; i < totalPaisos; i++) {
            paisMedalla = paisosMedalla[i];
            if (paisMedalla != null && !trobat && paisMedalla.nom.equals(pais.nom)) {
                trobat = true;
            }
        }
        if (!trobat) {
            if (totalPaisos < MAX_PAISOS) {
                paisosMedalla[totalPaisos] = pais;
                totalPaisos++;
            } else {
                System.out.println("No es poden afegir més països");
            }
            
        }

    }

    public static void mostrarMedaller() {
        String nomPais;
        int numMedallesPais;
        for (int i = 0; i < totalPaisos; i++) {
            nomPais = paisosMedalla[i].nom;
            numMedallesPais = paisosMedalla[i].getNumMedalles();
            System.out.println("El pais " + nomPais + " ha guanyat: " + numMedallesPais);
        }

    }

    public static void mostrarMedallerOrdenat(){
        System.out.println("\nOrdenadada per nombre de medalles: ");
        Arrays.sort(paisosMedalla,0, totalPaisos, (p2, p1)-> 
                    Integer.compare(p1.getNumMedalles(), p2.getNumMedalles())
        );
        for(int i = 0; i< totalPaisos; i++){
            System.out.println("El país " + paisosMedalla[i].nom + " ha guanyat: " + paisosMedalla[i].getNumMedalles() + " medalles.");
        }
        
    }

    public static void mostrarMedallerOrdenatAlfabetic(){
        System.out.println(" \nOrdenada alfabèticament per els noms de països:");
        Arrays.sort(paisosMedalla,0, totalPaisos,(p1,p2)-> p1.nom.compareTo (p2.nom));
        for(int i =0; i< totalPaisos; i++){
            System.out.println("El país " + paisosMedalla[i].nom + " ha guanyat: " + paisosMedalla[i].getNumMedalles() + " medalles.");
        }
    }
}
