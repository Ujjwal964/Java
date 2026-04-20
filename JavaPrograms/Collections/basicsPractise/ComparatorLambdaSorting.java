//QUES - SORTING USING COLLECTIONS + COMPARATOR + LAMBDA

package Collections.basicsPractise;
import java.util.*;

public class ComparatorLambdaSorting{
    public static void main(String[] args){
        List<String> list = new ArrayList<>(Arrays.asList("aa", "b", "cccc", "ddd"));
        System.out.println("Before : "+list);
        Collections.sort(list , (a,b) -> a.length() - b.length());
        System.out.println("Sort By Comparator + Lambda : "+list);
    }
}