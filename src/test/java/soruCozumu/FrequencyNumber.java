package soruCozumu;

import java.util.*;

public class FrequencyNumber {

    public static void main(String[] args) {
        int[] newArr = {2, 3, 5, 2, 5, 3, 7, 5, 10, 5, 8};
        int num = 5;
          System.out.println(method1(newArr,num));

        //  method2(newArr);
          method3(newArr);

    }
// 1st Way istedigim rakam yani kac tane 5 var onu veriyor count ile. void ile de alabiliriz
    public static int method1(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                count++;
            }
        }return count;

        }

// 2nd Way Hangi degerden kac tane var onu veriyor. Dynamic olabilmesi icin spesifik element istemiyorum
    public static void method2(int[] nums){
        List<Integer> list = new ArrayList<>();
        for (int i=0; i< nums.length; i++){
            list.add(nums[i]);
        }
        Set<Integer> set = new HashSet<>(list);
        for (int i:set) {
            System.out.println(i + " : "+ Collections.frequency(list,i));
        }
    }
// 3rd Way by using Map
    public static void method3(int[] num){
        //{2, 3, 5, 2, 5, 3, 7, 5, 10, 5, 8};
        Map<Integer, Integer> map = new HashMap<>();
        for (int i: num) {
            if(map.containsKey(i)){
                map.put(i, map.get(i) + 1);
            }else{
                map.put(i,1);
            }
        }
        System.out.println(map); // {2=2, 3=2, 5=4, 7=1, 8=1, 10=1} bu sekilde map'i yazdiriyor.
        for(Map.Entry entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

}
