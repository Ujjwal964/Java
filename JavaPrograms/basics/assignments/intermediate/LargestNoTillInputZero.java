package basics.assignments.intermediate;
import java.util.*;

public class LargestNoTillInputZero {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int max = 0;

        while(true){
            System.out.print("Enter a number : ");
            int n = sc.nextInt();

            if(n > max)
                max = n;
            else if(n == 0){
                System.out.println("Program Stopped!");
                break;
            }
        }
        System.out.println("Largest number among all is : "+max);
    }
    
}
