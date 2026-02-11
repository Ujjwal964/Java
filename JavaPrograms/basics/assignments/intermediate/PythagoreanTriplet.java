//sum of square of length and breadth of right triangle = square of hypotenuse.

package basics.assignments.intermediate;
import java.util.*;

public class PythagoreanTriplet{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length of Right Triangle : ");
        int l = sc.nextInt();
        System.out.print("Enter Breadth of Right Triangle : ");
        int b = sc.nextInt();
        System.out.print("Enter Hypotenuse of Right Triangle : ");
        int h = sc.nextInt();

        if(l <= 0 || b <= 0 || h <= 0){
            System.out.println("Value must be greater than 0.");
            return;
        }

        isPythagoreanTriplet(l,b,h);
    }

    static void isPythagoreanTriplet(int l , int b , int h){
        int sum = l*l + b*b;
        System.out.println("Sum is : "+sum);
        System.out.println("Hypotenuse Square is : "+(h*h));

        if(sum == (h*h))
            System.out.println("It's a Pythagorean Triplet.");
        else
            System.out.println("Not a Pythagorean Triplet.");
    }
}