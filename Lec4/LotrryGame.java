package Lec4;

public class LotrryGame {
    public static void main(String[] args) {
        
        int n = 250;

        if( n >= 300 && n <= 460){
            System.out.println("the prize is MacBook");
        }
        else if(n >= 200 && n <= 280){
            System.out.println("the prize is Kurkure. ");
        }
        else if(n >= 1100 && n <= 1500){
            System.out.println("the prize is Cycle. ");
        }
        else if( n > 50 && n <= 80){
            System.out.println(" the prize is Bike.");
        }else{
            System.out.println("Better luck next time.");
        }

    }
}
