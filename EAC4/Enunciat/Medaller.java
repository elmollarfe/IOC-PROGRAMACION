package EAC4.Enunciat;

import EAC4.Enunciat.*;
import java.util.HashSet;

public class Medaller {
    private static final int MAX_PAISOS = 200;
    
   private Pais [] paisosMedalla = new Pais[MAX_PAISOS];
   private int totalPaisos;

    public Medaller(){
    
    }

    public void afegirPais (String nomPais){
        if (paisosMedalla.length <= MAX_PAISOS){
            paisosMedalla[totalPaisos++] = nomPais ;
            
        }else{
            System.out.println("No es poden afegir més països");
        }
    }

    
}
