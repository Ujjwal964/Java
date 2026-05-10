//SOURCE - Kunal Kushwaha (https://youtu.be/_HRA37X8N_Q?si=Uj-u9Mw7mImT-TzT)

package Searching.LinearSearch.practise;
import java.util.*;
public class LinearSearch2DArray {
    public static void main(String[] args){
        int[][] arr = {
            {11,25,39},
            {23,45,67,89},
            {12,65,43,87},
            {34,97}
        };

        int target = 87;
        System.out.println(Arrays.deepToString(arr));

        // System.out.println(LinearSearch(arr , target));
        System.out.println(Arrays.toString(LinearSearch(arr , target)));
    } 

    //1st Approach (return element if found)
    // static int LinearSearch(int[][] arr , int target){
    //     if(arr.length == 0)
    //         return -1;

    //     for(int i=0;i<arr.length;i++){
    //         for(int j=0;j<arr[i].length;j++){
    //             if(arr[i][j] == target)
    //                 return arr[i][j];
    //         }
    //     }
    //     return -1;
    // }
    
    //2nd Approach (return element if found)
    // static int LinearSearch(int[][] arr , int target){
    //     if(arr.length == 0)
    //         return -1;

    //     for(int[] intArr : arr){
    //         for(int element : intArr){
    //             if(element == target)
    //                 return element;
    //         }
    //     }
    //     return -1;
    // }

    //3rd Approach (return both row and col index in array if found)
    static int[] LinearSearch(int[][] arr , int target){
        if(arr.length == 0 )
            return new int[]{-1 , -1};

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j] == target)
                    return new int[]{i , j};
            }
        }
        return new int[]{-1 , -1};
    }
}
