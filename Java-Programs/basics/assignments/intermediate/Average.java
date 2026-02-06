package basics.assignments.intermediate;
import java.util.*;

public class Average {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers you want to enter : ");
        int count = sc.nextInt();

        double sum = 0;
        for(int i=0;i<count;i++){
            System.out.print("Enter Number : ");
            double n = sc.nextDouble();
            sum = n + sum;
        }
        double avg = sum / count;
        System.out.println("Average of numbers : "+avg);
    }
}
