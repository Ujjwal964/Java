package basics.assignments.veryBasics;
import java.util.*;

public class SimpleInterest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter principle amount - ");
        int p = sc.nextInt();
        System.out.print("Please enter rate - ");
        int r = sc.nextInt();
        System.out.print("Please enter time - ");
        int t = sc.nextInt();

        int si = ( p * r * t ) / 100;

        System.out.println("Simple Interest for given data is : "+si);
    }
    
}
