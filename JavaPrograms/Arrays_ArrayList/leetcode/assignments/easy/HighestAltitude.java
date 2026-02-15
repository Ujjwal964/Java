//QUES - https://leetcode.com/problems/find-the-highest-altitude/

package Arrays_ArrayList.leetcode.assignments.easy;
import java.util.*;

// ----------------------------------------PERSONAL VSCODE-----------------------------------------

public class HighestAltitude {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] gain = new int[5];
        System.out.print("Enter net gains : ");
        for(int i=0;i<gain.length;i++){
            gain[i] = sc.nextInt();
        }

        System.out.println("Highest Altitude is : "+highestAltitude(gain));
    }

    static int highestAltitude(int[] gain){
        int[] altitude = new int[gain.length + 1];
        altitude[0] = 0;
        int max = altitude[0];
        for(int i=1;i<altitude.length;i++){
            altitude[i] = altitude[i-1] + gain[i-1];
            max = altitude[i] > max ? altitude[i] : max;
        }
        System.out.println("Altitudes are : "+Arrays.toString(altitude));
        return max;
    }
}

// gain : -5 1 5 0 -7
// ans : altitude : 0 -5 -4 1 1 -6


// ----------------------------------------LEETCODE SOL-----------------------------------------

class Solution {
    public int largestAltitude(int[] gain) {
        int[] altitude = new int[gain.length + 1];
        altitude[0] = 0;
        int max = altitude[0];

        for(int i=1;i<altitude.length;i++){
            altitude[i] = altitude[i-1] + gain[i-1];
            max = altitude[i] > max ? altitude[i] : max;
        }
        return max;
    }
}