package basics.assignments.intermediate;
import java.util.*;

public class FactorsOfNo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        if(n<=0){
            System.out.println("Please enter a valid number.");
            return;
        }

        for(int i=1;i<=n;i++){
            if(n % i == 0)
                System.out.print(i + " ");   
        }
        System.out.println("\nFactors of "+n+" are ⬆️");
    }
    
}
