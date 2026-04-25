//QUES - SWAP TWO NUMBERS USING BIT APPROACH
//SOURCE - Striver (https://youtu.be/nttpF8kwgd4?si=Zf5QFIMtHorC2vcV)

package Bit_Manipulation.practise;

public class SwapTwoNumbers {

    //USING BIT APPROACH
    public static void main(String[] args){
        int a = 2 , b = 3;
        System.out.printf("Before Swap : a->%d , b->%d \n",a,b);
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.printf("After Swap : a->%d , b->%d",a,b);
    }
    
    //WITHOUT BIT (BRUTE FORCE)
    // public static void main(String[] args){
    //     int a = 2, b = 3;
    //     System.out.printf("Before Swap : a->%d , b->%d \n",a,b);
    //     int temp = a;
    //     a = b;
    //     b = temp;
    //     System.out.printf("After Swap : a->%d , b->%d \n",a,b);
    // }
}
