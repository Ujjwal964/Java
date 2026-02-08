package basics.practise;
import java.util.*;

public class PrimeNo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        isPrime(n);
    }

    static void isPrime(int n){
        int count = 2;
        if(n <= 1){
            System.out.println("Not a Prime Number.");
            return;
        }
        
        while(count < n){
            if(n % count == 0){
                System.out.println("Not a Prime Number.");
                return;
            }
            count++;
        }
        System.out.println(n+" is a Prime Number.");
    }
}
