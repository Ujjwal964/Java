package basics.assignments.intermediate;
import java.util.*;

public class LCM {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number : ");
        int b = sc.nextInt();

        int HCF = 0;
        int min = (a > b) ? b : a;

        for(int i=1;i<=min;i++){
            if(a % i == 0 && b % i == 0){
                HCF = i;
            }
        }
        System.out.println("HCF is : "+HCF);

        int LCM = (a * b) / HCF;
        System.out.println("LCM is : "+LCM);
    }
}
