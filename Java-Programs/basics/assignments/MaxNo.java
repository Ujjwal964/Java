package basics.assignments;
import java.util.*;

public class MaxNo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number : ");
        int b = sc.nextInt();

        int max = a;

        if(b>max)
            System.out.println(b+" is largest number.");
        else
            System.out.println(a+" is largest number.");
    }
}
