package Lec15;

public class Switch {
    
    public static void main(String[] args) {
        

        byte n= 2;
        // 1 ==> "monday";
        // 2 ==> Tuesday;
        // 3 ==> "Wednesday";
        // 4 ==> "Thusday";
        // 5 ==> "Friday";
        // 6 ==> "Saturday";
        // 7 ==> "Sunday";

        switch (n) {
            case 1:
                System.out.println("monday");
                break;
            case 2:    
                System.out.println("Tuesday");
                break;
            case 3:    
                System.out.println("Wednesday");
                break;
            case 4:    
                System.out.println("Thusday");
                break;
            case 5:    
                System.out.println("Friday");
                break;
            case 6:    
                System.out.println("Saturday");
                break;
            case 7:    
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid number");
                break;
        }


    }
}
