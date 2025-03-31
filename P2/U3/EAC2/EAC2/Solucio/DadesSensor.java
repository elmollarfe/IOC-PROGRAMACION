package EAC2.Solucio;

public class DadesSensor {
    String nomSensor;
    Planeta planeta;
    long milisegons;


    DadesSensor(String nomSensor, Planeta planeta, long milisegons) {
        this.nomSensor = nomSensor;
        this.planeta = planeta;
        this.milisegons = milisegons;
    }

    public String descripcio() {
        return "Les dades del sensor " + nomSensor + " s'han pres a l'instant " + milisegons + " i indiquen que el planeta " + planeta.getNom() + " es troba a una distància de " + planeta.getDistancia() + " quilòmetres";
    }

}
    

