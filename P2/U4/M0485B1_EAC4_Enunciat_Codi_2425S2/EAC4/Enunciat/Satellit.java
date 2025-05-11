package  EAC4.Enunciat;

public class Satellit extends Artificial{

    protected Satellit(String nom, double distancia, String paisContruccio){
        super(nom, distancia, paisContruccio);
    }


    protected Satellit(String nom, double distancia, boolean posicio , String paisContruccio){
        super(nom, distancia, posicio, paisContruccio);
    }

    @Override
    protected String descripcio(){

        return super.descripcio() + "Satèl·lit.";

    }

    
}
