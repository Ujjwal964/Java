package basics.assignments.veryBasics;
import java.util.*;

public class Area {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Radius of Circle : ");
        int r = sc.nextInt();
        System.out.println("Area of Circle is : "+ 3.14 * r * r);

        System.out.print("Enter Base of Triangle : ");
        int b = sc.nextInt();
        System.out.print("Enter Height of Triangle : ");
        int h = sc.nextInt();
        System.out.println("Area of Triangle is : "+ 0.5 * b * h);

        System.out.print("Enter Length of Rectangle : ");
        int l = sc.nextInt();
        System.out.print("Enter Width of Rectangle : ");
        int w = sc.nextInt();
        System.out.println("Area of Rectangle is : "+ l * w);

        System.out.print("Enter Sides of Isosceles Triangle : ");
        int a = sc.nextInt();
        System.out.print("Enter Base of Isosceles Triangle : ");
        int base = sc.nextInt();
        int area = (base / 4) * (int) Math.sqrt((4 * a * a - base * base));
        System.out.println("Area of Isosceles Triangle : "+ area);
    }
    
}
