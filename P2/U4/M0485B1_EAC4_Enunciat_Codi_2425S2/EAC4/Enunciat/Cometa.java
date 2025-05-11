package EAC4.Enunciat;

public class Cometa extends Natural {

    public Cometa ( String nom, double distancia, String descubridor, int anyDescubriment){
        super(nom, distancia, descubridor, anyDescubriment);
        super.setServeixPerPosicionar(false); 

    }

    @Override

    protected String descripcio(){
        return super.descripcio() + "Cometa.";
        
    }


    


    
}
