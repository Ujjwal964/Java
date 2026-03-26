//QUES - https://leetcode.com/problems/maximum-average-subarray-i/description/

package Arrays_ArrayList.algorithms.slidingWindow;
import java.util.*;

// ----------------------------------------PERSONAL VSCODE-----------------------------------------

public class FindMaxAverage {
    
}



// ----------------------------------------LEETCODE SOL-----------------------------------------

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i = 0;
        int j = 0;
        double sum = 0;
        double max = Double.NEGATIVE_INFINITY;
        
        while(j < nums.length){
            sum = sum + nums[j];
            
            if(j-i+1 < k)
                j++;
            else if(j-i+1 == k){
                double avg = sum / k;
                max = Math.max(avg , max);
                
                sum = sum - nums[i];
                i++;
                j++;
            }
        }
        return max;
    }
}