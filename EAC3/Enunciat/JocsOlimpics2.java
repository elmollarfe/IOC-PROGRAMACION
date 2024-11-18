package EAC3.Enunciat;

public class JocsOlimpics2 {

    public static void main(String[] args) {

        // Creació interactiva dels objectes necessaris per assignar una medalla
        // Aquí et sentiràs com un campió olímpic!

        Atleta[] atletes = new Atleta[10];
        Pais[] paisos = new Pais[5];

        System.out.println("*** GUANYA LA TEVA MEDALLA ****");
        String fiPrograma;

        do {
            System.out.print("Quin és el teu país? ");
            String nomPais = InputUtils.readLine();
            Pais elTeuPais = null;

            // Utilitzem try-catch per a gestionar els errors en cas de que es superi més
            // païssos que admeteix la array.
            try {

                // buscar el nom del pais dins del array y si existeix asignarlo a elteupaais
                for (int i = 0; i < paisos.length; i++) {
                    if (paisos[i] != null && paisos[i].nom.equals(nomPais)) {
                        elTeuPais = paisos[i];
                    }
                }

                // si no existeix crear nou pais

                if (elTeuPais == null) {
                    elTeuPais = new Pais(nomPais);
                }

                // posar en la primera posicio del array que sigui null

                int valorBuit = -1;
                for (int i = 0; i < paisos.length && valorBuit == -1; i++) {
                    if (paisos[i] == null) {
                        valorBuit = i;
                    }
                }

                // Al primer valor buit de l'array assigne el nou país.
                paisos[valorBuit] = elTeuPais;

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Aquesta medalla no es pot generar.");

            }

            System.out.print("Quin és el teu nom? ");
            String elTeuNom = InputUtils.readLine();
            System.out.print("Quin és el teu esport favorit? ");
            String elTeuEsport = InputUtils.readLine();
            Atleta tu = null;

            try { 
                // buscar el nom del atleta dins del array i si existeix asignarlo a alTeuNom
                for (int i = 0; i < atletes.length; i++) {
                    if (atletes[i] != null && atletes[i].nom.equals(elTeuNom)) {
                        tu = atletes[i];
                    }
                }

                // si no existeix crear nou atleta.

                if (tu == null) {
                    tu = new Atleta(elTeuNom, elTeuPais, elTeuEsport);
                }

                // posar en la primera posicio del array que sigui null.

                int valorBuitAtleta = -1;

                for (int i = 0; i < atletes.length && valorBuitAtleta == -1; i++) {
                    if (atletes[i] == null) {
                        valorBuitAtleta = i;
                    }
                }

                // Al primer valor buit de l'array assigne el nou país.
                atletes[valorBuitAtleta] = tu;

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Aquesta medalla no es pot generar.");

            }

            System.out.print("En quina posició has quedat (1, 2 o 3)? ");
            int laTevaPosicio = InputUtils.readInt();
            Medalla laTevaMedalla = new Medalla(laTevaPosicio, tu);
            System.out.println(laTevaMedalla.descripcio());
            System.out.println("Medalles de l'atleta " + tu.nom + " : " + tu.getNumMedalles());
            System.out.println("Medalles del país " + elTeuPais.nom + " : " + elTeuPais.getNumMedalles());
            tu.mostrarMedalles();
            elTeuPais.mostrarMedalles();
            System.out.print("Vols introduir una altra medalla? introduix fi per finalitzar ");
            InputUtils.readLine();
            fiPrograma = InputUtils.readLine();
        } while (!(fiPrograma.equals("fi")));

        InputUtils.close();
    }
}
