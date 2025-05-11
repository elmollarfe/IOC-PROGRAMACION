package EAC4.Enunciat;

public class Astre extends Natural {

    public Astre(String nom, double distancia, String descubridor, int anyDescubriment){
        super(nom, distancia, descubridor, anyDescubriment);
    }
    
    @Override
    protected String descripcio(){

        return super.descripcio() + "Astre.";

    }
}
