package basics.assignments;
import java.util.*;

public class ArmstrongNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int digits = n;
        int check = n;

        int count = 0;
        while(digits>0){
            digits = digits/10;
            count++;
        }
        System.out.println("Total digits in given "+n+" is : "+count);

        int sum = 0;
        while(check>0){
            int rem = check % 10;
            sum = (int) Math.pow(rem , count) + sum;
            check = check / 10;
        }

        System.out.println("Initial Number : "+n);
        System.out.println("Result : "+sum);

        if(sum == n)
            System.out.println("Hence, It's an Armstrong Number.");

        else
            System.out.println("Not an Armstrong Number.");
    }
}


//123 = 1^3 + 2^3 + 3^3 = 123