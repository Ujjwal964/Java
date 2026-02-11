package basics.assignments.intermediate;
import java.util.*;

public class DistanceBwTwo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Point A Coordinates(x,y) : ");
        double Ax = sc.nextDouble();
        double Ay = sc.nextDouble();

        System.out.print("Enter Point B Coordinates(x,y) : ");
        double Bx = sc.nextDouble();
        double By = sc.nextDouble();

        System.out.printf("Distance bw A and B is : %.2f", Math.sqrt((Bx-Ax)*(Bx-Ax) + (By-Ay)*(By-Ay)));
    }
}
