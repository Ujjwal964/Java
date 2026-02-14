//QUES - https://leetcode.com/problems/count-items-matching-a-rule/

package Arrays_ArrayList.leetcode.assignments.easy;
import java.util.*;

// ----------------------------------------PERSONAL VSCODE-----------------------------------------

public class countItemsMatchingRule {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ArrayList<ArrayList<String>> list = new ArrayList<>();
        for(int i=0;i<3;i++){
            list.add(new ArrayList<>());
        }

        System.out.println("Values ( type,color,name )");
        for(int i=0;i<3;i++){
            System.out.print("Enter Values "+(i+1)+" : ");
            for(int j=0;j<3;j++){
                list.get(i).add(sc.next());
            }
        }
        System.out.println("Given list is : "+list);

        System.out.println(countByRule(list,"color","silver"));
    }
    
    static int countByRule(ArrayList<ArrayList<String>> list , String ruleKey , String ruleValue){
        int index = 0;
        switch (ruleKey.toLowerCase()){
            case "type" -> index = 0;
            case "color" -> index = 1;
            case "name" -> index = 2;
            default -> {return 0;}
        }

        int count = 0;
        for(int i=0;i<list.size();i++){
            count += list.get(i).get(index).equals(ruleValue) ? 1 : 0;
        }
        return count;
    }
}


// ----------------------------------------LEETCODE SOL-----------------------------------------

// class Solution {
//     public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
//         int index = 0;
//         switch(ruleKey.toLowerCase()){
//             case "type" -> index = 0;
//             case "color" -> index = 1;
//             case "name" -> index = 2;
//             default -> {return 0;}
//         }

//         int count = 0;
//         for(int i=0;i<items.size();i++){
//             count += items.get(i).get(index).equals(ruleValue) ? 1 : 0;
//         }
//         return count;
//     }
// }