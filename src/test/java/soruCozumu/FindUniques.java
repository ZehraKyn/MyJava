package soruCozumu;

import java.util.HashMap;
import java.util.Map;

public class FindUniques {
    public static void main(String[] args) {

        /**Write a return method that can find the unique characters from the String
         (Dizedeki benzersiz karakterleri bulabilen bir metod yazın)
         Ex: unique(“AAABBBCCCDEF”) ==> “DEF”;
         */

        String unique = "AAABBBCCCDEF";
        findUnique(unique);

    }

    public static void findUnique(String str){
        char [] arr = str.toCharArray(); //Converts this string to a new character array
        Map<Character, Integer> map = new HashMap<>(); // Character ve Integer yazarak key ve value'dan kac tane var onu karsilastiriyoum.

        for(char each: arr){ //char[] arr'in icinde dolas
            if(map.containsKey(each)){  //sonra map'imi kontrol et, map o characteri iceriyor mu icermiyor mu?
                map.put(each, map.get(each) +1); //kontrol ettigim deger map'te varsa value'sunu bir artir
                //line 18 icin: each karakterin kendisi yani key, map.get(each) ile de valuesunu aliyoruz
            }else{
                map.put(each,1); // eger kontrol ettigin deger map'in icinde yoksa ekle , degerine 1 ver
            }
        }
        for(Map.Entry<Character, Integer> entry:map.entrySet()){
            if(entry.getValue() ==1){
                System.out.print(entry.getKey());
            }
        }
    }
}
