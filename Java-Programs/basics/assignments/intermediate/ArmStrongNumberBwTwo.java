package basics.assignments.intermediate;
import java.util.*;

public class ArmStrongNumberBwTwo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start number : ");
        int a = sc.nextInt();
        System.out.print("Enter end number : ");
        int b = sc.nextInt();

        for(int i=a;i<=b;i++){
            int digits = i;
            int check = i;

            int count = 0;  
            while(digits>0){
                digits = digits/10;
                count++;
            }

            int sum = 0;
            while(check>0){
                int rem = check % 10;
                sum = (int) Math.pow(rem , count) + sum;
                check = check / 10;
            }

            if(sum == i)
                System.out.print(i+" ");
        }
        System.out.println("\nComplete ArmStrong Number list bw "+a+" - "+b+" ⬆️");
    }
}
