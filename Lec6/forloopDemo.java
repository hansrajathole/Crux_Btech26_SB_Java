package Lec6;

public  class forloopDemo {
    public static void main(String agrs[]){
        int i = 1 ;
        for(;i<15;){
            System.out.println(i);

            if(i>10){
                i += 3;
            }else if(i>5){
                i += 2;
            }else {
                i++;
            }
        }
    }
}