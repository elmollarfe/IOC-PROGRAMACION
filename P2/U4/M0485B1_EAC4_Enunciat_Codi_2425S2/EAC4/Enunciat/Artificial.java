package EAC4.Enunciat;

public class Artificial extends ObjecteSideral {

    private String paisConstruccio;

    public String getPaisConstruccio() {
        return paisConstruccio;
    }

    public Artificial (String nom, double distancia, String paisConstruccio){
        super(nom, distancia, false);
        this.paisConstruccio = paisConstruccio;
    }

    public Artificial (String nom, double distancia, boolean possicionament, String paisConstruccio){
        super(nom, distancia, possicionament);
        this.paisConstruccio = paisConstruccio; 
    }

    @Override
    protected String descripcio(){
        return super.descripcio() 
        + "És de tipus Artifical i el va fabricar " + paisConstruccio
        + " El seu subtipus és ";   
    
    }
}
