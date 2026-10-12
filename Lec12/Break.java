

package Lec12;

import java.util.Scanner;

public class Break {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 1 ; i<=100 ; i++){
            if(i == n){
              
                continue;
            }

            System.out.println(i+" Sorry babu...");
        }
    }
     
}