

public class Pattern1 {
    public static void main(String[] args) {
        int n = 5;
        int row = 0;
        int star = n;

        // rows
        while (row<n) {
            

            // col ---> star
            int col = 0;
            while (col<star) {
                System.out.print("* ");
                col++;
            }

            // next line prep
            System.out.println();
            row++;
        }
    }
}