package EAC4.Enunciat;

public class MCO_test {

    public static int random(int minimo, int maximo) {
        return ( (int) (Math.random() * maximo) + minimo) ;
    }

    public static void main(String[] args) {
        
        //N medalles pel mateix atleta
        final int NUM_MOVIMENTS_FASE1 = 10;
        final int NUM_MOVIMENTS_FASE2 = 15;
        //M medalles addicionals
        final int NUM_MOVIMENTS_INCORRECTES = 3;
        Instruccio llistaInstruccions[] = new Instruccio[NUM_MOVIMENTS_FASE1+NUM_MOVIMENTS_FASE2];
        int indexInstruccio = 0;
        //*********************************
        //4.a 
        //*********************************
        //Generació de 10 moviments vàlids
        for (int i=0; i < NUM_MOVIMENTS_FASE1; i++) {
            llistaInstruccions[indexInstruccio] = new Instruccio(random(1,6), random(1,1000));
            indexInstruccio++;
        }

        //Comprovació que s'han rebut les instruccions esperades
        assert Instruccio.getNumInstruccionsRebudes() == NUM_MOVIMENTS_FASE1 : "El nombre d'instruccions rebudes no és correcte'";

        //*********************************
        //4.b
        //*********************************        
        //Recuperar el darrer moviment
        Instruccio darrerMoviment = Instruccio.obtenirDarrersMoviments(1)[0];
        
        //Comprovació que és el moviment esperat
        assert llistaInstruccions[NUM_MOVIMENTS_FASE1-1] == darrerMoviment : "El darrer moviment no és correcte";

        //*********************************
        //4.c
        //*********************************
        //Generar 3 moviments incorrectes
        for (int i=0; i < NUM_MOVIMENTS_INCORRECTES; i++) {
            llistaInstruccions[indexInstruccio] = new Instruccio(random(7,10), random(1,1000));
        }

        //Comprovació que s'han rebut les instruccions esperades
        assert Instruccio.getNumInstruccionsRebudes() == NUM_MOVIMENTS_FASE1 : "El nombre d'instruccions rebudes no és correcte'";
        darrerMoviment = Instruccio.obtenirDarrersMoviments(1)[0];
        
        //Comprovació que és el moviment esperat
        assert llistaInstruccions[NUM_MOVIMENTS_FASE1-1] == darrerMoviment : "El darrer moviment no és correcte";

        //*********************************
        //4.d
        //*********************************
        //Generació de 15 moviments vàlids
        for (int i=0; i < NUM_MOVIMENTS_FASE2; i++) {
            llistaInstruccions[indexInstruccio] = new Instruccio(random(1,6), random(1,1000));
            indexInstruccio++;
        }

        //Comprovació que s'han rebut les instruccions esperades
        assert Instruccio.getNumInstruccionsRebudes() == NUM_MOVIMENTS_FASE1+NUM_MOVIMENTS_FASE2 : "El nombre d'instruccions rebudes no és correcte'";

        //*********************************
        //4.e
        //*********************************        
        //Recuperar el moviment més antic dels 20 darrers moviments
        Instruccio movimentMesAntic = Instruccio.obtenirDarrersMoviments(Instruccio.MAX_INSTRUCCIONS)[Instruccio.MAX_INSTRUCCIONS-1];
        
        //Comprovació que és el moviment esperat
        assert llistaInstruccions[llistaInstruccions.length - Instruccio.MAX_INSTRUCCIONS] == movimentMesAntic : "El moviment més antic no és correcte";

    }
        
}
