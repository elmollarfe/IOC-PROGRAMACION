package EAC2.Enunciat;

public class JocsOlimpics2 {

    public static void main(String[] args) {

        // Creació interactiva dels objectes necessaris per assignar una medalla
        // Aquí et sentiràs com un campió olímpic!
        System.out.println("*** GUANYA LA TEVA MEDALLA ****");
        System.out.print("Quin és el teu país? ");
        String nomPais = InputUtils.readLine();
        if (nomPais.equals("" ) || nomPais.equals(" ")) {
            System.err.println("Error codi -1");
        } 
        
        Pais elTeuPais = new Pais(nomPais);

       
        System.out.print("Quin és el teu nom? ");
        String elTeuNom = InputUtils.readLine();
        if (elTeuNom.equals("" ) || elTeuNom.equals(" ")) {
            System.err.println("Error codi -1");
        } 
        
        System.out.print("Quin és el teu esport favorit? ");
        String elTeuEsport = InputUtils.readLine();
        if (elTeuEsport.equals("" ) || elTeuEsport.equals(" ")) {
            System.err.println("Error codi -1");
        } 
        
        Atleta tu = new Atleta(elTeuNom, elTeuPais, elTeuEsport);
        System.out.print("En quina posició has quedat (1, 2 o 3)? ");
        int laTevaPosicio = InputUtils.readInt();
        Medalla laTevaMedalla = new Medalla(laTevaPosicio, tu);
        System.out.println(laTevaMedalla.descripcio());

    }
}
