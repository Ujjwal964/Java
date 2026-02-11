package basics.practise;
import java.util.*;

public class ReverseNumber{
    public static void main(String[] args){
        // int n = 12345;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int rev = 0;
        System.out.println("Initial Number : "+n);

        while(n>0){
            int rem = n%10;
            rev = (rev*10) + rem;
            n = n/10;
        }
        System.out.println("Reversed Number : "+rev);
    }
}

