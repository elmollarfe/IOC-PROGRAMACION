public class ArraySencers {
    public static void main(String[] args) {
        int [] nombres = {1,3,5,2};
        for(int nombre:nombres){
            int count = 1;
            while (count <= nombre ) {
                System.out.print("*");
                count ++;
                
            }
            System.out.println();
        }
    }
    
}
