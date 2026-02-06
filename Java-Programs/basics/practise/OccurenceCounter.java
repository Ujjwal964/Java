package basics.practise;
import java.util.*;

public class OccurenceCounter{
    public static void main(String[] args){
        // int n = 124456;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any digit : ");
        int n = sc.nextInt();
        System.out.print("Enter which number's occurence to find : ");
        int numToFind = sc.nextInt();
        int count = 0;

        while(n>0){
            int rem = n%10;
            if(rem == numToFind){
                count++;
            }
            n = n/10;
        }
        System.out.println(count);
    }
}