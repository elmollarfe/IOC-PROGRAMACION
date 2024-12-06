package EAC4.Enunciat;

import EAC4.Enunciat.Atleta;
import EAC4.Enunciat.Medalla;
import EAC4.Enunciat.Pais;

public class MedallaEquips extends Medalla {

    private static final int MAX_ATLETES = 30;
    Atleta [] atletes = new Atleta [MAX_ATLETES];
    int numeroArrayAtleta = 0; 


    MedallaEquips(int posicio , Atleta[] atletes){
        super(posicio, atletes[0]);
        if(atletes.length <= MAX_ATLETES){
            for(int i = 1; i < atletes.length-1 ; i++){
                if(atletes[i].getNumMedalles()< Atleta.MAX_MEDALLES_ATLETA){
                    atletes[i].guanyarMedalla(this);
                }
            }
        }else{
            System.out.println("Error màxim número d'atletes al equip");
        }

        this.atletes = atletes;  
    }




    
}
 