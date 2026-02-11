// QUES - Kunal is allowed to go out with his friends only on the even days of a given month. 
// Write a program to count the number of days he can go out in the month of August.

package basics.assignments.intermediate;
import java.util.*;

public class EvenDaysInMonth {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 31 ; //august month total days;

        int count = 0;
        for(int i=1;i<=n;i++){
            if(i % 2 == 0)
                count = count + 1;
        }
        System.out.println("Number of days he can go out is : "+count);
    }
}
