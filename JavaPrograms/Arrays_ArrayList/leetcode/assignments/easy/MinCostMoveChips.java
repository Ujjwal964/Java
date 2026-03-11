//QUES - https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/
//SOURCE - (https://youtu.be/FPgC3RfHMBI?si=TzSJcWBlEZZqWT89)

package Arrays_ArrayList.leetcode.assignments.easy;
import java.util.*;

public class MinCostMoveChips {
    //same as leetcode sol just find odd and even number count and print min from these two.
    
}


// ----------------------------------------LEETCODE SOL-----------------------------------------

// class Solution {
//     public int minCostToMoveChips(int[] position) {
//         int even = 0;
//         int odd = 0;
//         for(int i=0;i<position.length;i++){
//             if(position[i] % 2 == 0)
//                 even++;
//             else
//                 odd++;
//         }
//         return Math.min(even , odd);
//     }
// }


//just main understanding is we need to understand is lets say the index we want to add all is
//even (p[final] = even) : we have 2 possibility , one is p[i] = even then we need to either +2 or -2 means if both even then cost is zero right. And , second is p[i] = odd then we need to add either +1 or -1 and yes for high index diff need to add +2 then +1 but for cost what counts is +1 so main thing is if p[i] is odd and p[final] is even then cost is 1.

//odd (p[final] = odd) : we have 2 possibility , one is p[i] = odd then we need to either +2 or -2 means if both odd then cost is zero right. And , second is p[i] = even then we need to add either +1 or -1 and yes for high index diff need to add +2 then +1 but for cost what counts is +1 so main thing is if p[i] is even and p[final] is odd then cost is 1.

//now final point is how will we decide our final point index location so for this best approach and easy is to find total number of odd and even numbers in given array , why? bcos if even is 3 then it means cost will come three right and if odd is 4 then means cost will be 4 right since in both case cost is incrementing by 1 as per count.
//so select one with minimum value in even and odd and that much is our cost.
//QUESTION EXPLANATION IS COMPLEX , BUT APPROACH IS JUST FINDING ODD & EVEN AND THEN MIN FROM THEM.