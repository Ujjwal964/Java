package basics.practise;

public class TypeCasting{
    public static void main(String[] args){
        float a = 10;             //automatic conversion
        int b = (int) 10.25f;    //explicit conversion : TypeCasting
        String s = "उज्ज्वल";     //unicode values
        String c = "東京";      //unicode values

        System.out.println(a);
        System.out.println(b);
        System.out.println(s);
        System.out.println(c);
    }
}