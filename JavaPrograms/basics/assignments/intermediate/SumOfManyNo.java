//QUES - Write a program to print the sum of negative numbers, sum of positive even numbers and 
// the sum of positive odd numbers from a list of numbers (N) entered by the user. 
// The list terminates when the user enters a zero.

package basics.assignments.intermediate;
import java.util.*;

public class SumOfManyNo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int negSum = 0;
        int posEvenSum = 0;
        int posOddSum = 0;

        while(true){
            System.out.print("Enter a number : ");
            int n = sc.nextInt();

            if(n < 0)
                negSum = n + negSum;

            else if(n > 0){
                if(n % 2 == 0)
                    posEvenSum = n + posEvenSum;
                else
                    posOddSum = n + posOddSum;
            }
            else if(n == 0){
                System.out.println("Program Stopped!");
                break;
            }
        }
        System.out.println("Sum of Negative Numbers is : "+ negSum);
        System.out.println("Sum of Positive Odd Numbers is : "+posOddSum);
        System.out.println("Sum of Positive Even Numbers is : "+posEvenSum);
    }
}
