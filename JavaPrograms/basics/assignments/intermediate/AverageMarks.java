package basics.assignments.intermediate;
import java.util.*;

public class AverageMarks {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter all 5 subject marks : ");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int m4 = sc.nextInt();
        int m5 = sc.nextInt();

        double average = (double) (m1+m2+m3+m4+m5) / 5;
        System.out.println("Average Marks : "+average);
    }   
}
