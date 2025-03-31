package EAC2.Solucio;

//import java.util.Scanner;

public class MCO_v2 {

    public static void main(String[] args) {

        //Creació interactiva dels objectes necessaris per la missió a Mart
        System.out.println("*** HAS D'ENVIAR LA SONDA FINS A MART ****");  
        System.out.print("Quin planeta vols tenir de referència? ");
        //Scanner scan = new Scanner(System.in);
        String nomPlaneta = InputUtils.readLine();
        System.out.print("A quina distància es troba " + nomPlaneta + "? ");
        double distancia = InputUtils.scan.nextDouble();
        Planeta elTeuPlaneta = new Planeta(nomPlaneta, distancia);

        //Demanar el moviment que cal fer a la nau
        System.out.print("En quina direcció vols girar (1-Esquerra, 2-Dreta)? ");
        int direccio = InputUtils.readInt();
        // Com que MOVE_LEFT s'ha definit com 3 i MOVE_RIGHT s'ha definit com 4
        // ho soluciono sumant-li 2 al número que llegeixi, però s'ha de buscar una forma més professional.
        
        direccio = direccio +2;  
        System.out.print("Amb quina intensitat cal fer el moviment? ");
        int intensitat =InputUtils.readInt(); 
        //Consumeix el salt de línia que queda en introduïr l'enter perquè no afecti al següent nextLine()
        Instruccio laTevaInstruccio = new Instruccio(direccio, intensitat);

        //Demanar les dades d'un sensor
        System.out.print("Quin és el nom del sensor? ");
        String nom = InputUtils.readLine();
        System.out.print("En quin instant de temps s'ha fet la lectura del sensor? ");
        int instant = InputUtils.readInt(); 
        DadesSensor lesTevesDadesSensor = new DadesSensor(nom,elTeuPlaneta, instant);

        //Mostrar les dades introduides
        System.out.println("Dades del planeta introduït:");
        System.out.println(elTeuPlaneta.descripcio());

        System.out.println("Dades de la instrucció introduïda:");
        System.out.println(laTevaInstruccio.descripcio());

        System.out.println("Dades del sensor introduïdes:");
        System.out.println(lesTevesDadesSensor.descripcio());

        InputUtils.scan.close();
    }
}
