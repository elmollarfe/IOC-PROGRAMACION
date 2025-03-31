package EAC2.Solucio;


public class Instruccio {

    public static final int MOVIMENT_NO_vALID = 0; 
    public static final int MOVE_UP = 1;
    public static final int MOVE_DOWN = 2;
    public static final int ROTATE_LEFT = 3;
    public static final int ROTATE_RIGHT = 4;
    public static final int MOVE_FORWARD = 5;
    public static final int MOVE_BACKWARD = 6;
    

    private static int numInstruccionsRebudes = 0;

    private int intensitat;
    private int moviment;
  
    public static int getNumInstruccionsRebudes() {
        return numInstruccionsRebudes;
    }

    Instruccio(int moviment, int intensitat) {
       if(moviment >= MOVE_UP && moviment <= MOVE_BACKWARD){
        this.moviment = moviment;
        this.intensitat = intensitat;
        numInstruccionsRebudes++;
       }else{
        this.moviment = MOVIMENT_NO_vALID;
       }
      
    }

    public String getMoviment() {
        String result = "";
        switch (moviment) {
            case MOVIMENT_NO_vALID: result = "MOVIMENT NO VALID";
                            break;
            case MOVE_UP : result = "Moure cap amunt"; 
                           break;
            case MOVE_DOWN : result = "Moure cap avall"; 
                           break;            
            case MOVE_FORWARD : result = "Avançar"; 
                           break;            
            case MOVE_BACKWARD : result = "Tirar enrere"; 
                           break;           
            case ROTATE_LEFT : result = "Girar cap a l'esquerra"; 
                           break;            
            case ROTATE_RIGHT : result = "Girar cap a la dreta"; 
                           break;  
            default: result = "Moviment desconegut";
                           break;                        
        }
        return result;
    }

    public int getIntensitat() {
        return intensitat;
    }

    public String descripcio() {
        String text;
        if(moviment == MOVIMENT_NO_vALID){
            text = "La instrucció no és vàlida";
        } else {
           text  = "La instrucció és " + getMoviment() + " amb codi intern " + moviment + " i cal fer-la amb una intensitat de " + intensitat;
        }
        return text;
    }

}
    


