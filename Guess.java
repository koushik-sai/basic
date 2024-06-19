import java.util.*;
class Main{
    public static void main(String[] args){
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("welcome to the number guessing game!");
        
        a=(int) (Math.random() * 100) + 1;
        
        int b=-1;
        while(b!=a){
            System.out.println("enter a number in the range of 1 to 100");
            b=sc.nextInt();
            if(b==a)
            System.out.println("Hurray! number found");
            else if(b>a)
            System.out.println("number is large");
            else
            System.out.println("number is small");

        }
    }
}