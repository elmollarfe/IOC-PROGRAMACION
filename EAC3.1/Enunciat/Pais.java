package EAC3.Enunciat;

public class Pais {
    String nom;
    private int numMedalles;
    static private final int MAX_MEDALLES_PAIS = 100; 
    private Medalla [] medallesPais = new Medalla [MAX_MEDALLES_PAIS];

    public int getNumMedalles() {
        return numMedalles;
    }

    Pais (String nom) {
        this.nom = nom;
        numMedalles = 0;
    }

    public boolean novaMedalla(Medalla m) {
        if(numMedalles<MAX_MEDALLES_PAIS){
            medallesPais [numMedalles] = m;
            numMedalles = numMedalles + 1;
            return true;
        } else{
            return false;
        }
       
    }

    public void mostrarMedalles(){
        int numMedallesPais = getNumMedalles();
        System.out.println("Medalles assignades al país");
        for(int i = 0; i<numMedallesPais; i++){
            System.out.println(medallesPais[i].descripcio());;
        }

    }
}
