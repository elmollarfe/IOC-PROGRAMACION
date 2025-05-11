package EAC4.Enunciat;

public class Sonda extends Artificial {

    protected Sonda(String nom, double distancia, String paisContruccio){
        super(nom, distancia, paisContruccio);
    }

    @Override
    protected String descripcio(){

        return super.descripcio() + "Sonda.";

    }
}
