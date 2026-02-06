package basics.assignments.intermediate;
import java.util.*;

public class DiscountPrice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Marked Price : ");
        double mp = sc.nextDouble();
        System.out.print("Enter Discount Percentage(without %) : ");
        double d = sc.nextDouble();

        double sp = mp - (d * mp)/100;
        System.out.println("Discounted Price : "+sp);
    }
}
