public class ExcepcionsExample1 {
    public static void main(String[] args) {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);

           try {Thread.sleep(1000);
                
            } catch ( InterruptedException e) {
                System.out.println("El compte enrrere interrimput");
            }
        
        }
        System.out.println("Temps esgotat!");
    }
}
