import java.nio.channels.Pipe.SourceChannel;

public class VendesForn {
    private String nomProducte;
    private double[] vendesSetmana;

    public VendesForn(String nomProducte, double[] vendesSetmana) {
        this.nomProducte = nomProducte;
        this.vendesSetmana = vendesSetmana;
    }

    public void mostrarLlistat() {
        
        final double limit = 500; 
        double vendesTotals = 0; 
        double vendesCap = 0; 


        System.out.println("Producte: " + nomProducte);
        String[] dies = { "Dl", "Dt", "Dc", "Dj", "Dv", "Ds", "Dg" };

         for(int i = 0; i< vendesSetmana.length ; i++){
            String dia = dies[i];
            
            switch (dia) {
                case "Ds":
                case "Dg":
                
                vendesTotals += vendesSetmana [i];
                vendesCap += vendesSetmana [i];  
                    
                    break;
            
                default:

                vendesTotals += vendesSetmana [i];
                    break;
            }
        
    }

    System.out.printf("Vendes totals :  %.2f € \n" , vendesTotals);
    System.out.println();


    for (int i = 0; i < vendesSetmana.length; i++) {

        if(vendesSetmana[i] > limit){
            System.out.print(dies[i] + ": " + vendesSetmana[i] + " €");
            System.out.println("<-------");
        }else{
             System.out.println(dies[i] + ": " + vendesSetmana[i] + " €");

        }
        }

    double percentatge = (vendesCap *100)/vendesTotals;
    System.out.println();
    System.out.printf(" Vendes cap de setmana: %.2f € " , vendesCap);
     System.out.printf("(%.2f%%)" , percentatge );

   
}
}
