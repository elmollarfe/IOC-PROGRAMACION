package EAC4.Enunciat;

public class ObjecteSideral {

    private String nom; 
    private double distancia; 
    private boolean possicionament; 



    public ObjecteSideral (){
        
    }

    public ObjecteSideral(String nom, double distancia){
        this.nom= nom; 
        this.distancia = distancia;
    }

    public ObjecteSideral(String nom, double distancia, boolean possicionament){
        this.nom= nom; 
        this.distancia = distancia;
        this.possicionament = possicionament;
    }

    public String getNom(){
        return nom;
    }

    public double getDistancia(){
        return distancia;
    }

    protected String descripcio() {
        return "L'objecte sideral es diu " + nom + " i es troba a " + distancia + " quilòmetres. " + "Serveix per posicionar: " + getServeixPerPosicionar() + ". ";

    } 

    public boolean getServeixPerPosicionar(){
        return possicionament; 
    }
 
    protected void setServeixPerPosicionar(boolean possicionament){
        this.possicionament = possicionament; 

    }
 
    
}
