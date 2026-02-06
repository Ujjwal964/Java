package basics.assignments.intermediate;
import java.util.*;

public class ElectricityBill {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Total Units Consumed : ");
        int u = sc.nextInt();

        double bill = 0;
        double fixedCharge = 100;
        double tax = 0.05;
        if(u <= 100){
            bill = u * 5;
        }
        else if(u > 100 && u <= 200){
            int slab1 = u - 100;
            bill = (100 * 5) + (slab1 * 7);
        }
        else if(u > 200 && u <= 300){
            int slab2 = u - 200;
            bill = (100 * 5) + (100 * 7) + (slab2 * 10);
        }
        else if(u > 300){
            int slab3 = u - 300;
            bill = (100 * 5) + (100 * 7) + (100 * 10) + (slab3 * 12);
        }

        double subTotal = bill + fixedCharge;
        double taxAmount = subTotal * tax;
        System.out.println("Electricity Bill : "+ (subTotal + taxAmount));
    }
}
