package basics.assignments.intermediate;
import java.util.*;

public class ProductAndSumTwo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a == 0 || b == 0){
            System.out.println("Enter number greater than 0.");
            return;
        }

        System.out.println("Sum : "+sum(a,b));
        System.out.println("Product : "+product(a,b));
    }

    static int sum(int a , int b){
        return a+b;
    }

    static int product(int a , int b){
        return a*b;
    }
}
