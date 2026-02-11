package basics.assignments.veryBasics;
import java.util.*;

public class Volume {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Radius of Cone : ");
        int r = sc.nextInt();
        System.out.print("Enter Height of Cone : ");
        int h = sc.nextInt();
        System.out.println("Volumne of Cone : "+ (3.14 * r * r * h)/3);

        System.out.print("Enter Base Area of Prism : ");
        int ba = sc.nextInt();
        System.out.print("Enter Height of Prism : ");
        int height = sc.nextInt();
        System.out.println("Volume of Prism : " + ba * height);
    }
    
}
