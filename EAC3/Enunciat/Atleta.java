package EAC3.Enunciat;

public class Atleta { 
    String nom;
    Pais pais;
    String disciplina;
    private Medalla [] medallesAtleta  = new Medalla [10];
    private int numMedalles;

    public int getNumMedalles() {
        return numMedalles;
    }

    Atleta(String nom, Pais pais, String disciplina) {
        this.nom = nom;
        this.pais = pais;
        this.disciplina = disciplina;
        
    }

    public boolean guanyarMedalla(Medalla m) {
        if(numMedalles<10){
            medallesAtleta[numMedalles] = m ;
            numMedalles++;
            return true;
        } else {
            return false; 
        }
          
    }

    public void mostrarMedalles(){
        int numMedallesAtleta = getNumMedalles();
        System.out.println("Medalles assignades al atleta");
        for(int i=0; i < numMedallesAtleta; i++){
            System.out.println(medallesAtleta[i].descripcio());
        }
    }            
                
}            
