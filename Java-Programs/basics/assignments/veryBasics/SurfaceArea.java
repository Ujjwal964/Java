package basics.assignments.veryBasics;
import java.util.*;

public class SurfaceArea {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Radius of Cylinder : ");
        int r = sc.nextInt();
        System.out.print("Enter Height of Cylinder : ");
        int h = sc.nextInt();
        System.out.println("Surface Area of Cylinder : "+ 2 * 3.14 * r * h);

        System.out.print("Enter Side Length of Cube : ");
        int a = sc.nextInt();
        System.out.println("Surface Area of Cube : "+ 6 * a * a);
    }
    
}
