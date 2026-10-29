import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 5000;
        int n;
        do {
            System.out.println("enter 1 for deposit : ");
            System.out.println("enter 2 for withdraw : ");
            System.out.println("enter 3 for check : ");
           
            n = sc.nextInt();
            int amount;
            switch (n) {
                case 1:
                    System.out.println("enter your amount : ");
                     amount = sc.nextInt();
                    balance += amount;
                    break;
                case 2:
                    System.out.println("enter withdraw amount : ");
                    amount = sc.nextInt();
                    if(amount<=balance){
                        balance -= amount;
                    }
                    break;
                case 3 :
                    System.out.println("your balance is :" + balance);  
                    break;  
                default:
                    System.out.println("you Entered Invalid number");
                    break;
            }


            System.out.println("if you want to continue press 4");
            System.out.println("if you want to exit press 0");
            n = sc.nextInt();
        }while(n != 0);
    }
}