package basics.assignments.intermediate;
import java.util.*;

public class PrimeBwTwo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        primeInBetween(a,b);
    }

    static void primeInBetween(int a , int b){
        for(int i=a;i<=b;i++){
            
            boolean isPrime = true;

            if(i <= 1)
                continue;

            for(int n=2;n<i;n++){
                if(i % n == 0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime)
                System.out.println(i+" is a Prime Number.");
        }
    }
}
