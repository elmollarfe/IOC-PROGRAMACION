package EAC4.Enunciat;

import java.util.Arrays;
import java.util.Comparator;

public class Instruccio {

    private static final int MOVIMENT_INVALID = 0;
    private static final int CODI_MOVIMENT_MES_BAIX = 1;
    public static final int MAX_INSTRUCCIONS = 20;

    public static final int MOVE_UP = 1;
    public static final int MOVE_DOWN = 2;
    public static final int ROTATE_LEFT = 3;
    public static final int ROTATE_RIGHT = 4;
    public static final int MOVE_FORWARD = 5;
    public static final int MOVE_BACKWARD = 6;
    
    private static final int CODI_MOVIMENT_MES_ALT = 6;

    private static Instruccio darreresInstruccions[] = new Instruccio[MAX_INSTRUCCIONS];
    private static int indexInstruccions = 0;

    private static int numInstruccionsRebudes = 0;

    private int intensitat;
    private int moviment;
  
    Instruccio(int moviment, int intensitat) {
        if (moviment >= CODI_MOVIMENT_MES_BAIX && moviment <= CODI_MOVIMENT_MES_ALT) {
            numInstruccionsRebudes++;
            this.moviment = moviment;
            afegirInstruccio(this);
        }
        else {
            this.moviment = MOVIMENT_INVALID;
        }
        this.intensitat = intensitat;
    }
    
    public static int getNumInstruccionsRebudes() {
        return numInstruccionsRebudes;
    }


    private static void afegirInstruccio(Instruccio inst) {
        //Si cap la instrucció a l'array de MAX_INSTRUCCIONS, s'afegeix
        if (indexInstruccions < MAX_INSTRUCCIONS) {
            darreresInstruccions[indexInstruccions] = inst;
            indexInstruccions++;
        }
        else {
            //No hi cap, cal desplaçar totes les instruccions a la posició anterior
            for (int index = 1; index < MAX_INSTRUCCIONS; index ++) {
                darreresInstruccions[index-1] = darreresInstruccions[index];                
            }
            darreresInstruccions[indexInstruccions-1] = inst;
        }
    }

    public static void mostrarMoviments() {
        for (int index = 0; index < indexInstruccions; index++) {
            System.out.println(darreresInstruccions[index].getMoviment());
        }
    }

    public static Instruccio[] obtenirDarrersMoviments(int quants) {
        Instruccio[] instruccionsRetornar = new Instruccio[quants];
        int numRetornats = 0;
        try {
            for (int index = indexInstruccions-1; numRetornats < quants; index--) {
                instruccionsRetornar[numRetornats] = darreresInstruccions[index];
                numRetornats++;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            instruccionsRetornar = new Instruccio[0];
        }

        return instruccionsRetornar;
    }

    public String getMoviment() {
        String result = "";
        switch (moviment) {
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
        String resultat;
        if (moviment != MOVIMENT_INVALID) {
            resultat = "La instrucció és " + getMoviment() + " amb codi intern " + moviment + " i cal fer-la amb una intensitat de " + intensitat;
        }
        else {
            resultat = "MOVIMENT NO VÀLID";
        }
        return resultat;
    }



    protected void mostrarInstruccionsOrdenatPerIntensitat() {
        Instruccio[] instruccionsSenseNull = Arrays.copyOf(darreresInstruccions, indexInstruccions);

        Arrays.sort(instruccionsSenseNull, Comparator
                .comparing((Instruccio ins) -> ins.intensitat).reversed()
                .thenComparing((Instruccio ins) -> ins.moviment));
        for (Instruccio ins : instruccionsSenseNull) {
            System.out.println(ins.descripcio());
        }

    }

    protected void mostrarInstruccionsOrdenatPerCodiMoviment() {
        Instruccio[] instruccionsSenseNull = Arrays.copyOf(darreresInstruccions, indexInstruccions);

        Arrays.sort(instruccionsSenseNull, Comparator
                .comparing((Instruccio ins) -> ins.moviment)
                .thenComparing(Comparator.comparingInt((Instruccio ins) -> ins.intensitat).reversed()));

        for (Instruccio ins : instruccionsSenseNull) {
            System.out.println(ins.descripcio());
        }

    }

}
    


