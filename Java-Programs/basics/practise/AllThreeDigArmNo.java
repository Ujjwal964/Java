package basics.practise;
import java.util.*;

public class AllThreeDigArmNo {
    public static void main(String[] args){
        allThreeDigitArmNo();
        System.out.println("\nAll 3 digits armstrong numbers are ⬆️");
    }

    static void allThreeDigitArmNo(){
        int sum = 0;

        for(int n=100;n<1000;n++){
            int i = n;
            while(i>0){
                int rem = i % 10;
                sum = rem*rem*rem + sum;
                i = i / 10;
            }

            if(n == sum)
                System.out.print(n+" ");

            sum = 0;
        }
    }
}
