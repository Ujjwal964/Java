//QUES - REMOVE LAST SET BIT
//SOURCE - Striver (https://youtu.be/nttpF8kwgd4?si=Zf5QFIMtHorC2vcV)

package Bit_Manipulation.practise;
public class RemoveLastSetBit{
    
    //BRUTE FORCE (WITHOUT BIT)
    // public static void main(String[] args){
    //     int n = 13;
    //     String s = Integer.toBinaryString(n);
    //     char[] arr = s.toCharArray();
    
    //     for(int i=arr.length-1;i>=0;i--){
    //         if(arr[i] == '1'){
    //             arr[i] = '0';
    //             break;
    //         }
    //     }
    //     System.out.println(Integer.parseInt(new String(arr) , 2));
    // }
    
    //BIT APPROACH
    public static void main(String[] args){
        int n = 12;
        System.out.println( n & (n-1) );
    }
}