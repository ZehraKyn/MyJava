package soruCozumu;

import java.util.*;

public class RemoveDuplicateInteger {
    public static void main(String[] args) {

        int[] array = {9,7,2,4,3,5,3,5};

        System.out.println(Arrays.toString(removeDuplicate(array)));
        removeDuplicate2(array);
    }

    public static int[] removeDuplicate(int[] arr){

        List<Integer> list = new ArrayList<>();
        for (int i: arr) {
            if (!list.contains(i)) {
                list.add(i);
            }
        }
//        for(int i =0; i<arr.length; i++){
//            if(!list.contains(arr[i])){
//                list.add(arr[i]);
//            }
        arr = new int[list.size()];

        for(int i = 0; i<list.size(); i++){
            arr[i] = list.get(i);
        }
        return arr;
    }

    public static void removeDuplicate2(int[] arr){
        Set<Integer> set = new HashSet<>();   //unique.
        for(int i =0; i<arr.length; i++){
            set.add(arr[i]);
        }
        System.out.println(set);
    }
}
