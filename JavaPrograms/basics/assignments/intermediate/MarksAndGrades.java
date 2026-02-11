package basics.assignments.intermediate;
import java.util.*;

public class MarksAndGrades {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks : ");
        int marks = sc.nextInt();

        if(marks > 100){
            System.out.println("Maximum marks can be 100.");
            return;
        }

        getGrades(marks);
    }

    static void getGrades(int marks){
        if(marks <= 40)
            System.out.println("Fail");
        else if(marks <= 50)
            System.out.println("Grade D");
        else if(marks <= 60)
            System.out.println("Grade C");
        else if(marks <= 70)
            System.out.println("Grade B");
        else if(marks <= 80)
            System.out.println("Grade B+");
        else if(marks <= 90)
            System.out.println("Grade A");
        else if(marks <= 100)
            System.out.println("Grade A+");
    }
}
