package EAC4.Enunciat;

public class Planeta extends Natural{
  /*   private String nom;
    private double distancia; */

    public String getNom() {
        return super.getNom();
    }
    
    public double getDistancia() {
        return super.getDistancia();
    }

    Planeta (String nom, double distancia) {
        super(nom, transformarDistancia(distancia));
        //this.nom = nom;
        //this.distancia = transformarDistancia(distancia);
    }

    Planeta( String nom , double distancia, String descubridor ,  int anyDescubriment ){
        super( nom, transformarDistancia(distancia), descubridor, anyDescubriment);

    }

/*     public String descripcio() {
        return "El planeta es diu " + super.getNom() + " i es troba a " + super.getDistancia() + " quilòmetres";
    }
 */

    private static double transformarDistancia(double distancia) {
        
        //08/23/1998 - Becari_122
        //I'm not at all clear in which units the data arrives. 
        //For now I'll leave like this and I'll ask my boss when I have time.
        //It's very important that I do not forget as the consequences could be catastrophic.

        return distancia;
    }

    @Override

    protected String descripcio(){

        return super.descripcio() + "Planeta.";

    }

}