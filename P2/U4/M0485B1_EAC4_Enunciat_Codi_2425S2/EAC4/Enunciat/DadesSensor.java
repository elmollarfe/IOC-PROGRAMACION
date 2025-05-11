package EAC4.Enunciat;

public class DadesSensor {
    String nomSensor;
    Planeta planeta;
    long milisegons;
    ObjecteSideral objecteSideral; 


    DadesSensor(String nomSensor, Planeta planeta, long milisegons) {
        this.nomSensor = nomSensor;
        this.planeta = planeta;
        this.milisegons = milisegons;
    }

    DadesSensor(String nomSensor, ObjecteSideral objecte, long milisegons) {
        this.nomSensor = nomSensor;
        this.objecteSideral = objecte;
        this.milisegons = milisegons;
    }

/*     public String descripcio() {
        return "Les dades del sensor " + nomSensor + " s'han pres a l'instant " + milisegons + " i indiquen que el planeta " + planeta.getNom() + " es troba a una distància de " + planeta.getDistancia() + " quilòmetres";
    } */

    public String descripcio() {
        return "Les dades del sensor " + nomSensor + " s'han pres a l'instant " + milisegons + " i indiquen que el planeta " + objecteSideral.getNom() + " es troba a una distància de " + objecteSideral.getDistancia() + " quilòmetres";
    }
}
    

