//LINEAR SEARCH - Searching an element from start (0th Index) until we found it.
//SOURCE - Kunal Kushwaha (https://youtu.be/_HRA37X8N_Q?si=Uj-u9Mw7mImT-TzT)
//BEST CASE SCENARIO - At 1st Index, we found the element. (Time Complexity - O(1))
//WORST CASE SCENARIO - Element is not present in the data structure given. (Time Complexity - O(N))

package Searching.LinearSearch.practise;

public class LinearSearchBasics {
    public static void main(String[] args){
        int[] arr = {12,45,23,56,87,98,27,14,58};
        int target = 23;
        System.out.println(LinearSearch(arr , target));

        //if non static method then,
        // LinearSearchBasics obj = new LinearSearchBasics();
        // System.out.println(obj.LinearSearch(arr, target));
    }

    //1st Approach (return index of element)
    static int LinearSearch(int[] arr , int target){
        if(arr.length == 0)
            return -1;

        for(int index = 0;index<arr.length;index++){
            if(arr[index] == target)
                return index;
        }
        return -1;
    }

    //2nd Approach (return element itself)
    // static int LinearSearch(int[] arr , int target){
    //     if(arr.length == 0)
    //         return -1;

    //     for(int element : arr){
    //         if(element == target)
    //             return element;
    //     }
    //     return -1;
    // }

    //3rd Approach (if found return true or false)
    // static boolean LinearSearch(int[] arr , int target){
    //     if(arr.length == 0)
    //         return false;

    //     for(int element : arr){
    //         if(element == target)
    //             return true;
    //     }
    //     return false;
    // }

    //4th Approach (for self, just make non static method)
    // boolean LinearSearch(int[] arr , int target){
    //     if(arr.length == 0)
    //         return false;

    //     for(int element : arr){
    //         if(element == target)
    //             return true;
    //     }
    //     return false;
    // }
}


