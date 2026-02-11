package basics.assignments.intermediate;
import java.util.*;

public class SumOfDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a digit : ");
        int n = sc.nextInt();

        int sum = 0;
        while(n>0){
            int rem = n % 10;
            sum = rem + sum;
            n = n / 10;
        }
        System.out.println("Sum of digits : "+sum);
    }
}
