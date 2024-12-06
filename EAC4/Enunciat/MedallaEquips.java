package EAC4.Enunciat;

import EAC4.Enunciat.*;

public class MedallaEquips extends Medalla {


    private static final int MAX_ATLETES = 30;
    Atleta [] atletes = new Atleta [MAX_ATLETES];


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
      
    @Override
    public String descripcio(){
        String missatge;
        String nomAtletes = "";
        if (posicio == MEDALLA_NO_VALIDA)
            missatge = "MEDALLA NO VÀLIDA";
        else  {
            String medalla;
            switch (posicio) {
                case MEDALLA_OR :       medalla = "d'or";
                                        break;
                case MEDALLA_ARGENT :   medalla = "d'argent";
                                        break;
                case MEDALLA_BRONZE :   medalla = "de bronze";
                                        break;  
                default:                medalla = "NO DEFINIDA!!!";
            }
            for(Atleta atleta:atletes){
                 nomAtletes += atleta.nom + ", ";
            }
 
                missatge = "L'equip format pels atletes [" + nomAtletes + "] han guanyat una medalla " + medalla + " en obtenir la posició " + posicio + " a la seva prova de " + atleta.disciplina;
        }

        return missatge;
    }


 




}

   