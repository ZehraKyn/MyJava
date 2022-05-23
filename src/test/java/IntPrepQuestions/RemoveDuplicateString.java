package IntPrepQuestions;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateString {
    public static void main(String[] args) {

        String str = "AAABBBCCC";
        System.out.println(removeDuplicates(str));
        removeDuplicates2(str);
    }

    public static String removeDuplicates(String str){

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if(!result.contains("" + str.charAt(i))){
                result += str.charAt(i) + " ";
            }
        }
        return result;
    }
    public static void removeDuplicates2(String str){
        char[] arr = str.toCharArray();
        List<Character> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if(!list.contains(arr[i])){
                list.add(arr[i]);
            }
        }
        System.out.print(list);
    }
}
