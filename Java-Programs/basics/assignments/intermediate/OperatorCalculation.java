package basics.assignments.intermediate;
import java.util.*;

public class OperatorCalculation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter operator : ");
        char ope = sc.next().charAt(0);
        // String ope = sc.next();

        if(ope == '+' || ope == '-' || ope == '/' || ope == '*' || ope == '%'){
            System.out.print("Enter First Number : ");
            int a = sc.nextInt();
            System.out.print("Enter Second Number : ");
            int b = sc.nextInt();

            if(ope == '+')
                System.out.println("Result : "+(a+b));

            else if(ope == '-')
                System.out.println("Result : "+(a-b));

            else if(ope == '*')
                System.out.println("Result : "+(a*b));
            
            else if(ope == '/'){
                if(b != 0)
                    System.out.println("Result : "+(a/b));
                else
                    System.out.println("b cannot be zero.");
            }

            else if(ope == '%'){
                if(b != 0)
                    System.out.println("Result : "+(a%b));
                else
                    System.out.println("b cannot be zero.");
            }
        }
        else
            System.out.println("Please enter valid operator.");

    }
}