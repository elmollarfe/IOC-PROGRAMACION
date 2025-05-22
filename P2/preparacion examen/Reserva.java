public class Reserva {
    public static void main(String[] args) {
        
        final boolean EMPADRONATS = true;
        final double SUBVENCIO_PARTIDA = 0.15;
        final double SUBVENCIO_ESTUDIANT = 0.15;
        final double SUBVENCIO_ATURAT = 0.12;
        final double SUBVENCIO_GRUP = 0.02;
        final double IVA = 0.19; 
        final double DESCOMPTE_IVA_500 = 0.04;
        final double IVA_500 = 500; 

        double preuReserva = 100; 
        boolean empadronat = true; 
        boolean aturat = false; 
        boolean estudiant = true; 
        boolean grup = false; 

        double totalDescompte = 0; 
        double preuDescompteReserva = 0; 

        if (empadronat) {
            preuDescompteReserva = preuReserva * (1 - SUBVENCIO_PARTIDA);
            if (estudiant && aturat) {
                preuDescompteReserva = preuDescompteReserva * (1 - SUBVENCIO_ESTUDIANT);
                                preuDescompteReserva = preuDescompteReserva * (1 - SUBVENCIO_ATURAT);


            } else if (aturat) {
                preuDescompteReserva = preuDescompteReserva * (1 - SUBVENCIO_ATURAT);

            } else if (estudiant) {
                preuDescompteReserva = preuDescompteReserva * (1 - SUBVENCIO_ESTUDIANT);

            }

            if (grup) {
                preuDescompteReserva = preuDescompteReserva * (1 - SUBVENCIO_GRUP);
            }

            
            totalDescompte = preuReserva - preuDescompteReserva;

            if (totalDescompte > IVA_500) {
                preuDescompteReserva = preuDescompteReserva * (1 + DESCOMPTE_IVA_500);
            } else {
                preuDescompteReserva = preuDescompteReserva * (1 + IVA);
            }

        } else{
            preuDescompteReserva = preuReserva; 
            preuDescompteReserva = preuDescompteReserva * (1 + IVA);

        }


        System.out.println( preuDescompteReserva + " " +totalDescompte);
        

    }
    
}
