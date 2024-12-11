public class NotesAprovades {
    public static void main(String[] args) {
        int [] notes = {7,5,9,4,8};
        for(int nota:notes){
            if( nota >=5 ){
                System.out.println("Nota aprovada: " + nota);
            }
        }
    }
    
}
