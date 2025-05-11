package EAC4.Enunciat;

public class TestMCO_4 {

    public static void main(String[] args) {

        // *** Creació d'un cometa
        Cometa com1= new Cometa("Halley", 1234, "Edmund Halley", -240);
        assert com1.getServeixPerPosicionar() == false : "ERROR: Un cometa acabat de crear no hauria de servir per posicionar" ;
        
        // *** Canviar el cometa per tal que serveixi per posicionar
        com1.setServeixPerPosicionar(true);
        assert com1.getServeixPerPosicionar() == true : "ERROR: Qualsevol objecte pot habilitar-se per posicionar" ;
        
        System.out.println("Secció COMETA - ok");

        // *** Creació d'un planeta
        Planeta pla1= new Planeta("Júpiter", 44567, "Antiga Grècia", -800);
        assert pla1.getServeixPerPosicionar() == true : "ERROR: Un planeta acabat de crear hauria de servir per posicionar" ;
        
        // *** Conversió d'un planeta a Natural
        Natural n1 = pla1;
        assert n1.getNom() == "Júpiter" : "ERROR: Un Planeta també és Natural";
        // *** Conversió d'un planeta a ObjecteSideral
        ObjecteSideral o1 = n1;
        assert o1.getNom() == "Júpiter" : "ERROR: Un Planeta també és ObjecteSideral";

        System.out.println("Secció PLANETA - ok");


        // *** Creació d'un Astre
        Astre ast1= new Astre("Alfa Centauri Bb", 445672342, "Observatori Espacial Europeu", 2012);
        assert ast1.getServeixPerPosicionar() == true : "ERROR: Un astre acabat de crear hauria de servir per posicionar" ;
 
        System.out.println("Secció ASTRE - ok");



        // *** Creació d'un Meteorit
        Meteorit met1= new Meteorit("MET001", 4342, "Meto", 1945);
        assert met1.getServeixPerPosicionar() == true : "ERROR: Un meteorit acabat de crear hauria de servir per posicionar" ;
    
        System.out.println("Secció METEORIT - ok");
        

        // *** Creació d'un Nau
        Nau nau1= new Nau("Apollo XIII", 1970, "Estats Units");
        assert nau1.getServeixPerPosicionar() == false : "ERROR: Una nau acabada de crear no hauria de servir per posicionar" ;
    
        System.out.println("Secció NAU - ok");
        
        // *** Creació d'una Sonda
        Sonda son1= new Sonda("Mars Observer", 1995, "Europa");
        assert son1.getServeixPerPosicionar() == false : "ERROR: Una sonda acabada de crear no hauria de servir per posicionar" ;
    
        System.out.println("Secció SONDA - ok");

        // *** Creació d'un Satèl·lit
        Satellit sat1= new Satellit("Enxaneta", 350, "Catalunya");
        assert sat1.getServeixPerPosicionar() == false : "ERROR: Un satèl·lit acabat de crear no hauria de servir per posicionar" ;
    
        Satellit sat2= new Satellit("Enxaneta-2", 351, true,"Catalunya");
        assert sat2.getServeixPerPosicionar() == true : "ERROR: Un satèl·lit pot crear-se de forma que serveixi per posicionar" ;
    
        System.out.println("Secció SATELLIT - ok");


        // Verificar descripcions
        assert com1.descripcio()
                .equals("L'objecte sideral es diu Halley i es troba a 1234.0 quilòmetres. Serveix per posicionar: true. És de tipus Natural i el va descobrir Edmund Halley l'any -240 El seu subtipus és Cometa.") 
                : "ERROR: La descripció del cometa no és l'esperada";
        
        assert pla1.descripcio()
                .equals("L'objecte sideral es diu Júpiter i es troba a 44567.0 quilòmetres. Serveix per posicionar: true. És de tipus Natural i el va descobrir Antiga Grècia l'any -800 El seu subtipus és Planeta.") 
                : "ERROR: La descripció del planeta no és l'esperada";

        assert n1.descripcio()
                .equals("L'objecte sideral es diu Júpiter i es troba a 44567.0 quilòmetres. Serveix per posicionar: true. És de tipus Natural i el va descobrir Antiga Grècia l'any -800 El seu subtipus és Planeta.") 
                : "ERROR: La descripció de l'objecte natural no és l'esperada";

        assert o1.descripcio()
                .equals("L'objecte sideral es diu Júpiter i es troba a 44567.0 quilòmetres. Serveix per posicionar: true. És de tipus Natural i el va descobrir Antiga Grècia l'any -800 El seu subtipus és Planeta.") 
                : "ERROR: La descripció de l'objecte sideral no és l'esperada";

        assert ast1.descripcio()
                .equals("L'objecte sideral es diu Alfa Centauri Bb i es troba a 4.45672342E8 quilòmetres. Serveix per posicionar: true. És de tipus Natural i el va descobrir Observatori Espacial Europeu l'any 2012 El seu subtipus és Astre.") 
                : "ERROR: La descripció de l'astre no és l'esperada";

        assert met1.descripcio()
                .equals("L'objecte sideral es diu MET001 i es troba a 4342.0 quilòmetres. Serveix per posicionar: true. És de tipus Natural i el va descobrir Meto l'any 1945 El seu subtipus és Meteorit.") 
                : "ERROR: La descripció del meteorit no és l'esperada";

        assert nau1.descripcio()
                .equals("L'objecte sideral es diu Apollo XIII i es troba a 1970.0 quilòmetres. Serveix per posicionar: false. És de tipus Artifical i el va fabricar Estats Units El seu subtipus és Nau.") 
                : "ERROR: La descripció de la nau no és l'esperada";

        assert son1.descripcio()
                .equals("L'objecte sideral es diu Mars Observer i es troba a 1995.0 quilòmetres. Serveix per posicionar: false. És de tipus Artifical i el va fabricar Europa El seu subtipus és Sonda.") 
                : "ERROR: La descripció de la sonda no és l'esperada";

        assert sat1.descripcio()
                .equals("L'objecte sideral es diu Enxaneta i es troba a 350.0 quilòmetres. Serveix per posicionar: false. És de tipus Artifical i el va fabricar Catalunya El seu subtipus és Satèl·lit.") 
                : "ERROR: La descripció del satèl·lit 1 no és l'esperada";

        assert sat2.descripcio()
                .equals("L'objecte sideral es diu Enxaneta-2 i es troba a 351.0 quilòmetres. Serveix per posicionar: true. És de tipus Artifical i el va fabricar Catalunya El seu subtipus és Satèl·lit.") 
                : "ERROR: La descripció del satèl·lit 2 no és l'esperada";

        System.out.println("Secció DESCRIPCIONS - ok");
        

        System.out.println("Si has arribat aquí ja tens tots els punts possibles!!!!");
        System.out.println("Però recorda que et poden descomptar punts si el codi que implementa les classes no és del tot correcte.");
        System.out.println("Revisa-les, si us plau!");
        
    }
}
    
