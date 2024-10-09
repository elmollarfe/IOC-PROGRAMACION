package EAC1.Enunciat;

public class Medalla {

    static final int MEDALLA_OR = 1;
    static final int MEDALLA_ARGENT = 2;
    static final int MEDALLA_BRONZE = 3;

    private static int numMedallesRepartides = 0;
  
    int posicio;
    Atleta atleta;

    public static int getNumMedallesRepartides() {
        return numMedallesRepartides;
    }

    Medalla(int posicio, Atleta guanyador) {
        this.posicio = posicio;
        atleta = guanyador;
        atleta.pais.novaMedalla(this);
        atleta.guanyarMedalla(this);
        numMedallesRepartides++;
    }
    
    public String getAtletaNom(){
        return atleta.nom;
    }

    public int getMedallaPosicio(){
        return posicio;
    }

    public String getAtletaDisciplina(){
        return atleta.disciplina;
    } 

    public String descripcio(){
        return "L'atleta " + getAtletaNom() + " ha guanyat una medalla en obtenir la posició " + getMedallaPosicio() + " a la seva prova de " + getAtletaDisciplina() ;
    }

}
