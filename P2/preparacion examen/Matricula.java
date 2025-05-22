public class Matricula {

    public static void main(String[] args) {
        final double PREU_BASE = 35; 
        final double DESCOMPTE_MATRICULA = 1;
        final double DESCOM_DISCAPACITAT = 0.6;
        final double DESCOMP_FAMILIA = 0.5;
        final double DESCOM_ANTIC = 0.1;

        double quotaRecursos = 40;
        boolean esFamiliaNombrosa = true; 
        boolean teDiscapacitat = false; 
        boolean teMatriculaHonor = false; 
        boolean esAnticAlumne = true;
        int numAssignatures = 4;
        double preuMatricula = 0;
        double preuAmbDescompte = 0; 
        String resultat = "Descomptes aplicats";


        preuMatricula = PREU_BASE * numAssignatures; 

        if(teMatriculaHonor){
            preuMatricula = preuMatricula * (1- DESCOMPTE_MATRICULA);
            resultat += "Matricula d'honor.";
        } else{
            if (teDiscapacitat){
            preuMatricula = preuMatricula * (1- DESCOM_DISCAPACITAT);
                        resultat += "Discapacitat.";

        }else{
            if(esFamiliaNombrosa){
                preuMatricula = preuMatricula * (1- DESCOM_DISCAPACITAT);
                            resultat += "Familia nombrosa.";


            }else{
                if(esAnticAlumne){
                preuMatricula = preuMatricula * (1- DESCOM_DISCAPACITAT);
                 resultat += "Antic alumne.";

                }
            }
        }

    }

    System.out.println(resultat);
    System.out.println( "Cost final "+ (preuMatricula += quotaRecursos));



    
    
    }
}
