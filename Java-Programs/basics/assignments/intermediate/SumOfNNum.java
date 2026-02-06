package basics.assignments.intermediate;
import java.util.*;

public class SumOfNNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("How much number you want to input : ");
        int count = sc.nextInt();

        int sum = 0;
        for(int i=0;i<count;i++){
            System.out.print("Enter Number : ");
            int n = sc.nextInt();
            
            sum = n + sum;
        }
        System.out.println("Sum of all numbers are : "+sum);
    }
}
