

public class Ternary{
    public static void main(String[] args) {
        
        int age = 15;
        boolean isTrue = false;

       isTrue =   age >= 18 ? true : false;
        
       if(isTrue){
            System.out.println("Adult");
       }else{
            System.out.println("Teenager");
       }

    }
}