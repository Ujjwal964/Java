//QUES - Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
package basics.assignments.intermediate;
import java.util.*;

public class MaxAndMinNo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        isMaxNo(a,b,c);
        isMinNo(a,b,c);
    }

    static void isMaxNo(int a , int b , int c){
        int max = a;
        if(max < b)
            max = b;

        if(max < c)
            max = c;

        System.out.println("Max No is : "+max);
    }

    static void isMinNo(int a , int b , int c){
        int min = a;
        if(min > b)
            min = b;

        if(min > c)
            min = c;

        System.out.println("Min No is : "+min);
    }
}
