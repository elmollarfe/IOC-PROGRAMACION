package EAC2.Solucio;

public class Planeta {
    private String nom;
    private double distancia;

    public String getNom() {
        return nom;
    }
    
    public double getDistancia() {
        return distancia;
    }

    Planeta (String nom, double distancia) {
        this.nom = nom;
        this.distancia = transformarDistancia(distancia);
    }

    public String descripcio() {
        return "El planeta es diu " + nom + " i es troba a " + distancia + " quilòmetres";
    }

    private double transformarDistancia(double distancia) {
        
        //08/23/1998 - Becari_122
        //I'm not at all clear in which units the data arrives. 
        //For now I'll leave like this and I'll ask my boss when I have time.
        //It's very important that I do not forget as the consequences could be catastrophic.

        return distancia;
    }

}