package EAC2.Solucio;

import java.util.Scanner;

public class MarsClimateOrbiter {

    public static void main(String[] args) {

        //Comencem a provar la nau Mars Climate Orbiter
        System.out.println("***Benvinguts al sistema de proves de la Mars Climate Orbiter **");
        System.out.println("Com que acabem de començar, ara mateix s'han rebut " + Instruccio.getNumInstruccionsRebudes() + " instruccions");
        
        //Anem a crear un planeta
        System.out.println("***Creació d'un Planeta ***");
        String planetaMart = "Mart";
        Planeta p1 = new Planeta(planetaMart, 2.25E+8);
        // Provem que ha funcionat la creació del planeta
        System.out.println("El planeta es diu " + p1.getNom() + " i es troba a " + p1.getDistancia() + " quilòmetres");

        // Anem a crear una instrucció
        System.out.println("***Creació d'una instrucció***");
        Instruccio i1 = new Instruccio(Instruccio.ROTATE_LEFT, 500);

        //Provem que ha funcionat la creació de la instrucció
        System.out.println("La instrucció és per " + i1.getMoviment() + " amb una intensitat de " + i1.getIntensitat());

        //Anem a crear les dades d'un sensor
        System.out.println("***Creació de les dades d'un sensor***");
        DadesSensor ds1 = new DadesSensor("RJX45", p1, 0L);

        //Provem que s'han creat correctament les dades del sensor
        System.out.println("El sensor " + ds1.nomSensor + " ens informa que el planeta " + ds1.planeta.getNom() + " es troba a " + ds1.planeta.getDistancia() + " quilòmetres.");
 
        //Comprovem que ara ja s'ha rebut una instrucció
        System.out.println("Arribats a aquest punt s'han rebut " + Instruccio.getNumInstruccionsRebudes() + " instruccions");
 
        //Creació de diversos Planetes, Instruccions i Dades de Sensors
        Planeta mercuri = new Planeta("Mercuri", 7.7E+7);
        Planeta venus = new Planeta("Venus", 5.6E+7);
        Planeta jupiter = new Planeta("Jupiter", 7.29E+8);
        Planeta neptu = new Planeta("Neptú", 4.605E+9);
        Planeta alfaCentauri = new Planeta("Alfa Centauri", 4.12E+13);
        Planeta unAltreVegadaMart = new Planeta("Mart",  2.23E+8);

        Instruccio i2 = new Instruccio(Instruccio.ROTATE_LEFT, 40);
        Instruccio i3 = new Instruccio(Instruccio.MOVE_BACKWARD, 62);
        Instruccio i4 = new Instruccio(Instruccio.MOVE_FORWARD, 5);
        Instruccio i5 = new Instruccio(Instruccio.ROTATE_RIGHT, 9);
        Instruccio i6 = new Instruccio(Instruccio.MOVE_UP, 200);
        Instruccio i7 = new Instruccio(Instruccio.MOVE_DOWN, 77);

        DadesSensor ds2 = new DadesSensor("C3PO", mercuri, 8900);
        DadesSensor ds3 = new DadesSensor("RS232", venus, 23456);
        DadesSensor ds4 = new DadesSensor("USBC", jupiter, 112980);
        DadesSensor ds5 = new DadesSensor("PS2", neptu, 123876);
        DadesSensor ds6 = new DadesSensor("VGA", alfaCentauri, 232199);
        DadesSensor ds7 = new DadesSensor("R2D2", unAltreVegadaMart, 245939);

    
        //Diferentes proves
        System.out.println("***Fer diferents proves amb les dades introduïdes");
        System.out.println("Mercuri es troba a 7.7E+7 quilòmetres? " + (mercuri.getDistancia() == 7.7E+7) );
        System.out.println("Venus es troba més a prop que Mart? " + (venus.getDistancia() < p1.getDistancia()));
        System.out.println("En total s'han rebut " + Instruccio.getNumInstruccionsRebudes() + " instruccions");
        System.out.println("Les dades guardades en ds4 s'han rebut del sensor de nom RS232? " + ds4.nomSensor.equals("RS232"));


        //Creació interactiva dels objectes necessaris per la missió a Mart
        System.out.println("*** HAS D'ENVIAR LA SONDA FINS A MART ****");  
        System.out.print("Quin planeta vols tenir de referència? ");
        Scanner scan = new Scanner(System.in);
        String nomPlaneta = scan.nextLine();
        System.out.print("A quina distància es troba " + nomPlaneta + "? ");
        double distancia = scan.nextDouble();
        Planeta elTeuPlaneta = new Planeta(nomPlaneta, distancia);

        //Demanar el moviment que cal fer a la nau
        System.out.print("En quina direcció vols girar (1-Esquerra, 2-Dreta)? ");
        int direccio = scan.nextInt();
        // Com que MOVE_LEFT s'ha definit com 3 i MOVE_RIGHT s'ha definit com 4
        // ho soluciono sumant-li 2 al número que llegeixi, però s'ha de buscar una forma més professional.
        direccio = direccio +2;  
        System.out.print("Amb quina intensitat cal fer el moviment? ");
        int intensitat = scan.nextInt(); 
        //Consumeix el salt de línia que queda en introduïr l'enter perquè no afecti al següent nextLine()
        scan.nextLine(); 
        Instruccio laTevaInstruccio = new Instruccio(direccio, intensitat);

        //Demanar les dades d'un sensor
        System.out.print("Quin és el nom del sensor? ");
        String nom = scan.nextLine();
        System.out.print("En quin instant de temps s'ha fet la lectura del sensor? ");
        int instant = scan.nextInt(); 
        DadesSensor lesTevesDadesSensor = new DadesSensor(nom,elTeuPlaneta, instant);

        //Mostrar les dades introduides
        System.out.println("Dades del planeta introduït:");
        System.out.println(elTeuPlaneta.descripcio());

        System.out.println("Dades de la instrucció introduïda:");
        System.out.println(laTevaInstruccio.descripcio());

        System.out.println("Dades del sensor introduïdes:");
        System.out.println(lesTevesDadesSensor.descripcio());

        scan.close();

    }
}
