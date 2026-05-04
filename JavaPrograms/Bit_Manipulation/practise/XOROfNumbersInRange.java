//QUES - XOR of numbers in given range
//SOURCE - Striver (https://youtu.be/WqGb7159h7Q?si=Stmq6KLGqyZL3pZo)

package Bit_Manipulation.practise;
import java.util.*;

public class XOROfNumbersInRange {

    //BRUTE FORCE
    // public static void main(String[] args){
    //     int n = 3;

    //     int ans = 0;
    //     for(int i=1;i<=n;i++){
    //         ans = ans ^ i;
    //     }
    //     System.out.println(ans);
    // }

    //OPTIMAL BIT APPROACH
    // public static void main(String[] args){
    //     int n=5;
    //     int ans = 0;

    //     if(n % 4 == 1)
    //         ans = 1;
    //     else if(n % 4 == 2)
    //         ans = n+1;
    //     else if(n % 4 == 3)
    //         ans = 0;
    //     else if(n % 4 == 0)
    //         ans = 4;
    //     System.out.println(ans);
    // }    

    // -----------------------
    //LITTLE TWISE SAME QUESTION (FIND XOR IN GIVEN RANGE LEFT , RIGHT)
    //BRUTE FORCE
    // public static void main(String[] args){
    //     int start = 3;
    //     int end = 6;
    //     int ans = 0;
    //     while(start <= end){
    //         ans = ans ^ start;
    //         start++;
    //     }
    //     System.out.println(ans);
    // }

    //LITTLE TWISE SAME QUESTION (FIND XOR IN GIVEN RANGE LEFT , RIGHT)
    //OPTIMAL BIT APPROACH
    public static void main(String[] args){
        int start = 3;
        int end = 6;
        int ansOne = 0;
        int ansTwo = 0;

        if(start % 4 == 1)
            ansOne = 1;
        else if(start % 4 == 2)
            ansOne = start+1;
        else if(start % 4 == 3)
            ansOne = 0;
        else if(start % 4 == 0)
            ansOne = 4;

        if(end % 4 == 1)
            ansTwo = 1;
        else if(end % 4 == 2)
            ansTwo = start+1;
        else if(end % 4 == 3)
            ansTwo = 0;
        else if(end % 4 == 0)
            ansTwo = 4;

        int finalAns = ansOne ^ ansTwo;
        System.out.println(finalAns);
    }
}
