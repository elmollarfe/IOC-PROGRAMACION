package EAC4.Enunciat; 

public class Natural extends ObjecteSideral {

    private String descubridor;
    private int anyDescubriment;

    public Natural (String nom, double distancia, String descubridor, int anyDescubriment){
        super(nom, distancia, true);
        this.descubridor = descubridor; 
        this.anyDescubriment = anyDescubriment;

    }

    public Natural(String nom, double distancia){
        super(nom, distancia);
    }

    public String getDescubridor() {
        return descubridor;
    }

    public int getAnyDescubriment() {
        return anyDescubriment;
    }

    @Override

     protected String descripcio(){
        return super.descripcio() 
        + "És de tipus Natural i el va descobrir " + getDescubridor()
        + " l'any " + getAnyDescubriment()
        + " El seu subtipus és ";
    
    } 
    
}
