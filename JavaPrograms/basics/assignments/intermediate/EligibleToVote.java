package basics.assignments.intermediate;
import java.util.*;

public class EligibleToVote {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your age : ");
        int a = sc.nextInt();

        if(a <= 0){
            System.out.println("Age should be greater than 0.");
            return;
        }

        if(isEligible(a))
            System.out.println("Eligible to Vote.");
        else
            System.out.println("Not Eligible to Vote.");
    }

    static boolean isEligible(int a){
        // if(a >= 18)
        //     return true;
        // else
        //     return false;

        // -----OR------
        return (a >= 18);
    }
}
