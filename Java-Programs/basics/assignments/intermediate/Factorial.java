package basics.assignments.intermediate;
import java.util.*;

public class Factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        if(n == 0){
            System.out.println("Factorial of 0 is : 1");
            return;
        }
        else if(n<0){
            System.out.println("Please enter any valid number.");
            return;
        }

        int factorial = 1;
        for(int i=n;i>0;i--){
            factorial = i * factorial;
        }
        System.out.println("Factorial of "+n+" is : "+factorial);
    }   
}
