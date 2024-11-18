package EAC2.Enunciat;

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

    // A la creació d' una nova medalla , creem una nova medalla en cas que el atleta es trobi entre les posicions 1,2 i 3.
    Medalla(int posicio, Atleta guanyador) {
        this.posicio = posicio;
        atleta = guanyador;
        if(posicio > 0 && posicio < 4){    
            atleta.pais.novaMedalla(this);
            atleta.guanyarMedalla(this);
            numMedallesRepartides++;
        } 
        
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

   //Modifiquem el mètode descripció per a que segons la posició retorne un tipus de medalla diferent i controlar el cas de que no sigui vàlida.
    public String descripcio(){
        int posicioMedalla = getMedallaPosicio();
        switch (posicioMedalla) {
            case MEDALLA_OR:
                return "L'atleta " + getAtletaNom() + " ha guanyat una medalla d' or en obtenir la posició " + posicioMedalla + " a la seva prova de " + getAtletaDisciplina();
            case MEDALLA_ARGENT:
                return "L'atleta " + getAtletaNom() + " ha guanyat una medalla d' argent en obtenir la posició " + posicioMedalla + " a la seva prova de " + getAtletaDisciplina();
            case MEDALLA_BRONZE:
                return "L'atleta " + getAtletaNom() + " ha guanyat una medalla de bronze en obtenir la posició " + posicioMedalla + " a la seva prova de " + getAtletaDisciplina();
            default:
             return "MEDALLA NO VÀLIDA";
        }
    }
 


}
