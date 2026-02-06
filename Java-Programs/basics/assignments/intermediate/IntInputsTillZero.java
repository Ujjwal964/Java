package basics.assignments.intermediate;
import java.util.*;

public class IntInputsTillZero {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        
        while(true){
            System.out.print("Enter a number : ");
            int n = sc.nextInt();

            if(n > 0)
                sum = sum + n;
            else if(n == 0){
                System.out.println("Program Stopped!");
                break;
            }
        }
        System.out.println("Sum of all numbers : "+sum);
    }
}
