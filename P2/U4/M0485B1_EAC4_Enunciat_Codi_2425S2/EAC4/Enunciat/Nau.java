package EAC4.Enunciat;

public class Nau extends Artificial {

    protected Nau(String nom, double distancia, String paisContruccio){
        super(nom, distancia, paisContruccio);
    }

    @Override

    protected String descripcio(){
        return super.descripcio() + "Nau.";
    } 

    
    
}
