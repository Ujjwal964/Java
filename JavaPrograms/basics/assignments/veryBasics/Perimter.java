package basics.assignments.veryBasics;
import java.util.*;

public class Perimter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Radius of Circle : ");
        int r = sc.nextInt();
        System.out.println("Perimeter of Circle : "+ 2 * 3.14 * r);

        System.out.print("Enter Sides of Equilateral Triangle : ");
        int a = sc.nextInt();
        System.out.println("Perimeter of Equilateral Triangle : "+ 3 * a);

        System.out.print("Enter one side of Parallelogram : ");
        int oneSide = sc.nextInt();
        System.out.print("Enter adjacent side of Parallelogram : ");
        int adjSide = sc.nextInt();
        System.out.println("Perimeter of Parallelogram : "+ 2 * (oneSide + adjSide));
    }
}
