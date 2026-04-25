//QUES - CHECK IF POWER OF 2
//SOURCE - Striver (https://youtu.be/nttpF8kwgd4?si=Zf5QFIMtHorC2vcV)

package Bit_Manipulation.practise;
public class IsPowerOfTwo{
    public static void main(String[] args){
        int n =32;
        if( (n & (n-1)) == 0)
            System.out.printf("Yes %d is power of 2.",n);
        else
            System.out.printf("No %d is not power of 2.",n);
    }
}