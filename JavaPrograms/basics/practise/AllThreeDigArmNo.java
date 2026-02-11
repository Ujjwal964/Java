package basics.practise;
import java.util.*;

public class AllThreeDigArmNo {
    public static void main(String[] args){
        allThreeDigitArmNo();
        System.out.println("\nAll 3 digits armstrong numbers are ⬆️");
    }

    static void allThreeDigitArmNo(){
        int digit = 0;
        int sum = 0;

        for(int n=100;n<1000;n++){
            int i = n;
            int dummy = n;

            while(dummy>0){
                digit++;
                dummy = dummy / 10;
            }

            while(i>0){
                int rem = i % 10;
                sum = sum + (int) Math.pow(rem , digit);
                i = i / 10;
            }

            if(n == sum)
                System.out.print(n+" ");

            sum = 0;
            digit = 0;
        }
    }
}
