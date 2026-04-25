//QUES - TOGGLE iTH BIT
//SOURCE - Striver (https://youtu.be/nttpF8kwgd4?si=Zf5QFIMtHorC2vcV)

package Bit_Manipulation.practise;
public class ToggleIthBit{
    //USING BIT APPROACH
    public static void main(String[] args){
        int n = 13;
        int i = 1;
        System.out.println( (n ^ (1 << i)) );
    }
}