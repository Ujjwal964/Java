package basics.assignments.intermediate;
import java.util.*;

public class HCF {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number : ");
        int b = sc.nextInt();

        int hcf = 0;
        int min = (a > b) ? b : a;

        //OR
        // int min = a;
        // if(min > b)
        //     min = b;

        for(int i=1;i<=min;i++){
            if(a % i == 0 && b % i == 0){
                System.out.print(i + " ");
                hcf = i;
            }
        }
        System.out.println("\nHCF of "+a+" "+b+" are ⬆️");
        System.out.println("And Highest Factor is : "+hcf);
    }
}
