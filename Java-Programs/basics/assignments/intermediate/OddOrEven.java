package basics.assignments.intermediate;
import java.util.*;

public class OddOrEven{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        if(n<0)
            System.out.println("Please enter a valid number.");

        else if(n%2 == 0)
            System.out.println(n+" is an even number.");

        else
            System.out.println(n+" is an odd number.");
    }
}