package basics.practise;
import java.util.*;

public class Calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ans = 0;

        while(true){
            System.out.print("Enter the Operator : ");
            char ope = sc.next().trim().charAt(0);
            
            if(ope == '+' || ope == '-' || ope == '*' || ope == '/' || ope == '%'){
                
                System.out.print("Enter two Numbers : ");
                int a = sc.nextInt();
                int b = sc.nextInt();

                if(ope == '+') ans = a+b;

                if(ope == '-') ans = a-b;

                if(ope == '*') ans = a*b;

                if(ope == '/'){
                    if(b!=0) ans = a/b;
                }

                if(ope == '%'){
                    if(b != 0) ans = a%b;
                }

            }
            else if(ope == 'X' || ope == 'x'){
                System.out.println("Calculator Stopped.");
                break;
            }
            else{
                System.out.println("Invalid Operation");
            }

            System.out.println(ans);
        }
    }
}