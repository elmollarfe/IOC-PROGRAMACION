package EAC3.Enunciat;

public class Pais {
    String nom;
    private int numMedalles;
    private Medalla [] medallesPais = new Medalla [100];

    public int getNumMedalles() {
        return numMedalles;
    }

    Pais (String nom) {
        this.nom = nom;
        numMedalles = 0;
    }

    public void novaMedalla(Medalla m) {
        medallesPais [numMedalles] = m;
        numMedalles = numMedalles + 1;
       
    }

    public void mostrarMedalles(){
        int numMedallesPais = getNumMedalles();
        System.out.println("Medalles assignades al país");
        for(int i = 0; i<numMedallesPais; i++){
            System.out.println(medallesPais[i].descripcio());;
        }

    }
}
