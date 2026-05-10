//SOURCE - Kunal Kushwaha (https://youtu.be/_HRA37X8N_Q?si=Uj-u9Mw7mImT-TzT)

package Searching.LinearSearch.practise;

public class LinearSearchMinMax {
    public static void main(String[] args){
        int[][] arr = {
            {12,-34,56},
            {43,32,65,97},
            {76,48,29,10}
        };
        LinearSearchMinMax obj = new LinearSearchMinMax();
        System.out.println("Max Value is : "+obj.findMax(arr));
        System.out.println("Min Value is : "+obj.findMin(arr));
    }
    
    int findMax(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int[] intArr : arr){
            for(int element : intArr){
                max = element > max ? element : max;
            }
        }
        return max;
    } 

    int findMin(int[][] arr){
        int min = Integer.MAX_VALUE;
        for(int[] intArr : arr){
            for(int element : intArr){
                min = element < min ? element : min;
            }
        }
        return min;
    } 
}
