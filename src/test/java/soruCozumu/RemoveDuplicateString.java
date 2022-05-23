package soruCozumu;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateString {
    public static void main(String[] args) {

        String str = "Casablanca";
     //   removeDuplicate(str);
      //  removeDuplicate2(str);
    //    System.out.println(removeDuplicate3(str));
        System.out.println(removeDuplicate4(str));

    }

    //setin icine insert etmek icin Set<Character> diyoruz
    public static void removeDuplicate(String str){
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }
        for (char i:set) {
   //         System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void removeDuplicate2(String str){
        char[] arr = str.toCharArray();
        List<Character> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if(!list.contains(arr[i])){
                list.add(arr[i]);
            }
        }
    //    System.out.println(list);
    }

    public static String removeDuplicate3(String str){

        String result = "";
        for (int i = 0; i < str.length() ; i++) {
            if(!result.contains(""+ str.charAt(i))){ //
              //  result += str.charAt(i) + " "; //+= add anlaminda. resulta her dolanisinda ekleme yapiyor.
                result = result + str.charAt(i);
            }
        }
        return result;
    }

    public static Set<Character> removeDuplicate4(String str) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }
        return set;
    }
}
