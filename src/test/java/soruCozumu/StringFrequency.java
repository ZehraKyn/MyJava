package soruCozumu;

import java.util.HashMap;
import java.util.Map;

public class StringFrequency {
    public static void main(String[] args) {
        String s = "Casablanca";
        method1(s);

        char letter = 'a';
        System.out.println(method2(s,letter));
    }
    public static void method1(String str){

        char[] arr = str.toCharArray();

        Map<Character, Integer> map = new HashMap<>();
        for (char c : arr) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) +1);
            }else{
                map.put(c,1);
            }
        }
      //  System.out.println(map);
        for (Map.Entry entry: map.entrySet()) {
   //         System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

    public static int method2(String s, char c){

        int count = 0;
        for (int i = 0; i< s.length(); i++){
            if(c == s.charAt(i)){ // (i) index'teki harfleri geziyor. Onlardan hangisi benim istedigim elemana gelirse onu count ediyor.
                count++;
            }
        } return count;
    }

}
