package EAC4.Enunciat;

public class Meteorit extends Natural {

    protected Meteorit(String nom , double distancia, String descubridor, int anyDescubriment){
        super(nom, distancia, descubridor, anyDescubriment);
       } 



       @Override
    protected String descripcio(){

        return super.descripcio() + "Meteorit.";

    }
    
}
