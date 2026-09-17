package Lec5;

public class LotrryGame2 {
    public static void main(String[] args) {
        
        int n = 350;

        if( n >= 300 && n <= 460){
            System.out.println("the prize is MacBook");

            if(n >= 300 && n <= 380){
                System.out.println("Model: M1 Mac");
            }else {
                System.out.println("Model: M2 Mac");
            }
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
