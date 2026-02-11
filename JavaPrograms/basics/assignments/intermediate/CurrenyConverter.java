package basics.assignments.intermediate;
import java.util.*;

public class CurrenyConverter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter in Rupees(without symbol) : ");
        float rupee = sc.nextFloat();

        float usd = rupee / 90.4503f;
        System.out.println("and as per current times, USD amount is : "+usd);
    }
    
}
