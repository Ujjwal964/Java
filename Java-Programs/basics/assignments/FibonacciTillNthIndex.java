package basics.assignments;
import java.util.*;

public class FibonacciTillNthIndex{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;

        if(n==0){
            System.out.print("Fibonacci Series : "+a);
            return;
        }
        
        if(n<=1){
            System.out.print("Fibonacci Series : "+a+" "+b);
            return;
        }

        System.out.print("Fibonacci Series : "+a+" "+b+" ");
        
        for(int count=2;count<=n;count++){
            int next = a+b;
            a = b;
            b = next;
            System.out.print(next + " ");
        }
        System.out.println("\nFibonacci Number at that "+n+"th index is : "+b);
    }
}