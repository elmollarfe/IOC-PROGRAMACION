public class MostrarNotes {
    public static void main(String[] args) {
        int [] nota = {7,5,9,4,8};
        float suma = 0;

        
        for (int i=0; i<nota.length; i++){
            suma += nota[i];
        }

        System.out.println("Mitjana de les notes: "+suma/nota.length);
        
    }
    
}
