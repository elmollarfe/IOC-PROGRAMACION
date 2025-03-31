package EAC2.Solucio;

public class MCO_v2_5 {

    static void crearInstruccions(){

        System.out.print("Introdueix la instrucció : ");
        int codiMoviment = InputUtils.readInt();

        System.out.print("Introdueix la intensitat : ");
        int intensitat = InputUtils.readInt();
        
        Instruccio i = new Instruccio(codiMoviment,intensitat);
        System.out.println(i.descripcio());
        System.out.println("S'han rebut "+ Instruccio.getNumInstruccionsRebudes() + " instrucions");

    }

    public static void main(String[] args) {

         crearInstruccions();
         crearInstruccions();
         crearInstruccions();
         crearInstruccions();

        InputUtils.scan.close();
    }
}
