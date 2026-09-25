public class Swap {
    public static void main(String[] args) {
        
        int x = 10; // x = 20
        int y = 20; // y = 10

        System.out.println("Before swap X :"+x);
        System.out.println("Before swap Y :"+y);

       
        y = x;  // ----> y = 10
        x = y; // -----> x = 10

        System.out.println("After swap X :"+x);
        System.out.println("After swap Y :"+y);



    }
}
