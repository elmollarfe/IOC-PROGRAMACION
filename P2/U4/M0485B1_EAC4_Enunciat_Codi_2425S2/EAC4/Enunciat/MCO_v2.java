package EAC4.Enunciat;

public class MCO_v2 {

    public static void main(String[] args) {

        int maxObjectes = 3;
        ObjecteSideral [] llistaObjecteSiderals = new ObjecteSideral[maxObjectes];
        boolean sortir = false;
        int numObjectes = 0;
        String descubridorAstre = ""; 
        int anyDescubert = 0;
        String paisConstructorObjecte = "";
        ObjecteSideral elTeuObjecte = new ObjecteSideral();
        do {
            // Creació interactiva dels objectes necessaris per la missió a Mart
            System.out.println("*** HAS D'ENVIAR LA SONDA FINS A MART ****");
            // System.out.print("Quin planeta vols tenir de referència? ");
            // Scanner scan = new Scanner(System.in);
            // String nomPlaneta = InputUtils.readLine("Quin planeta vols tenir de
            // referència? ");
            int tipusObjecte = InputUtils.readInt(
                    "Quin tipus de objecte vols tenir de referència?  Introdueix el nombre: \n  1.Satèl·lits \n  2.Sondes \n  3.Naus \n  4.Astres \n  5.Planetes \n  6.Meteorits \n  7.Cometes \n\r ");
            InputUtils.readLine();
            String nomObjecte = InputUtils.readLine("Quin nom té? ");
            System.out.print("A quina distància es troba " + nomObjecte + "? ");
            // double distancia = InputUtils.readInt();
            double distanciaObjecte = InputUtils.readInt();
            InputUtils.readLine();
            // Planeta elTeuPlaneta = new Planeta(nomPlaneta, distancia);

            switch (tipusObjecte) {
                case 1:
                case 2:
                case 3:
                    System.out.print("Quin pais el va construir? ");
                    paisConstructorObjecte = InputUtils.readLine();
                    break;

                default:
                    break;
            }

            switch (tipusObjecte) {
                case 4:
                case 5:
                case 6:
                case 7:
                    //System.out.print("Qui el va descubrir?");
                    descubridorAstre = InputUtils.readLine("Qui el va descubrir? ");
                    //System.out.print("En quin any es va descubrir?");
                    anyDescubert = InputUtils.readInt("En quin any es va descubrir? ");
                    InputUtils.readLine();
                    break;

                default:
                    break;
            }


            if(numObjectes>= maxObjectes){
                numObjectes = 0; 
            }
            
            switch (tipusObjecte) {

                case 1:
                    Satellit sat1 = new Satellit(nomObjecte, distanciaObjecte, paisConstructorObjecte);
                    llistaObjecteSiderals[numObjectes] = sat1;
                    elTeuObjecte = sat1;

                    break;

                case 2:
                    Sonda son1 = new Sonda(nomObjecte, distanciaObjecte, paisConstructorObjecte);
                    llistaObjecteSiderals[numObjectes] = son1;
                    elTeuObjecte = son1;

                    break;

                case 3:
                    Nau nau1 = new Nau(nomObjecte, distanciaObjecte, paisConstructorObjecte);
                    llistaObjecteSiderals[numObjectes] = nau1;
                    elTeuObjecte = nau1;
                    break;

                case 4:
                    Astre ast1 = new Astre(nomObjecte, distanciaObjecte, descubridorAstre, anyDescubert);
                    elTeuObjecte = ast1;
                    llistaObjecteSiderals[numObjectes] = ast1;

                    break;

                case 5:
                    Planeta pla1 = new Planeta(nomObjecte, distanciaObjecte, descubridorAstre, anyDescubert);
                    llistaObjecteSiderals[numObjectes] = pla1;
                    elTeuObjecte = pla1;

                    break;

                case 6:
                    Meteorit met1 = new Meteorit(nomObjecte, distanciaObjecte, descubridorAstre, anyDescubert);
                    llistaObjecteSiderals[numObjectes] = met1;
                    elTeuObjecte = met1;

                    break;

                case 7:
                    Cometa com1 = new Cometa(nomObjecte, distanciaObjecte, descubridorAstre, anyDescubert);
                    elTeuObjecte = com1;
                    llistaObjecteSiderals[numObjectes] = com1;

                    break;

                default:
                    break;
            }

            numObjectes ++; 

            //Demanar el moviment que cal fer a la nau
            //System.out.print("En quina direcció vols girar (1-Esquerra, 2-Dreta)? ");
            int direccio = InputUtils.readInt("En quina direcció vols girar (1-Esquerra, 2-Dreta)? ", 1,6, "Error els valor no son vàlids");
            // Com que MOVE_LEFT s'ha definit com 3 i MOVE_RIGHT s'ha definit com 4
            // transformo els valors
            if (direccio == 1) direccio = Instruccio.ROTATE_LEFT;
            if (direccio == 2) direccio = Instruccio.ROTATE_RIGHT;
            //System.out.print("Amb quina intensitat cal fer el moviment? ");
            int intensitat = InputUtils.readInt("Amb quina intensitat cal fer el moviment? ", 100,200); 
            //Consumeix el salt de línia que queda en introduïr l'enter perquè no afecti al següent nextLine()
            InputUtils.readLine();
            Instruccio laTevaInstruccio = new Instruccio(direccio, intensitat);

            //Demanar les dades d'un sensor
            //System.out.print("Quin és el nom del sensor? ");
            String nom = InputUtils.readLine("Quin és el nom del sensor? "); 
            //System.out.print("En quin instant de temps s'ha fet la lectura del sensor? ");
            int instant = InputUtils.readInt("En quin instant de temps s'ha fet la lectura del sensor? ", "no correcte"); 
            DadesSensor lesTevesDadesSensor = new DadesSensor(nom, elTeuObjecte, instant);

            //Mostrar les dades introduides
            System.out.println("Dades de l'objecte sideral introduït:");
            System.out.println(elTeuObjecte.descripcio());

            System.out.println("Dades de la instrucció introduïda:");
            System.out.println(laTevaInstruccio.descripcio());

            System.out.println("Dades del sensor introduïdes:");
            System.out.println(lesTevesDadesSensor.descripcio());

            //Demanar si vol sortir
            System.out.println("Vols sortir (S/N)? ");
            InputUtils.readLine();
            sortir = InputUtils.readBoolean();
            //InputUtils.readLine().equals("S");

        } while (sortir == false);

        ObjecteSideral obj ;

        for(int i =0; i<llistaObjecteSiderals.length  && llistaObjecteSiderals[i] != null; i++){
              obj = llistaObjecteSiderals[i];
             if (obj instanceof Astre) {
                Astre ast = (Astre) obj;
                System.out.println(ast.descripcio());
            } else if (obj instanceof Cometa) {
                Cometa com = (Cometa) obj;
                System.out.println(com.descripcio());
            } else if (obj instanceof Meteorit) {
                Meteorit met = (Meteorit) obj;
                System.out.println(met.descripcio());
            } else if (obj instanceof Nau) {
                Nau nau = (Nau) obj;
                System.out.println(nau.descripcio());
            } else if (obj instanceof Planeta) {
                Planeta pla = (Planeta) obj;
                System.out.println(pla.descripcio());
            } else if (obj instanceof Satellit) {
                Satellit sat = (Satellit) obj;
                System.out.println(sat.descripcio());
            } else if(obj instanceof Sonda){
                Sonda son = (Sonda) obj;
                System.out.println(son.descripcio());
            }
        }           

        InputUtils.close();

    }
}
