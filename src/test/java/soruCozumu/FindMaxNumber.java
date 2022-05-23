package soruCozumu;

import java.util.Arrays;

public class FindMaxNumber {
    public static void main(String[] args) {

        int[] a = {11, 43, 23, 56, 22, 1, 34, 89};
        System.out.println(findMax(a));
        findMax2(a);
        findMax3(a);
    }

    public static int findMax(int[] num){

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            if(num[i] > max){
                max = num[i];
            }
        }
        return max;
    }

    public static void findMax2(int[] num){

        int max = num[0];
        for (int i = 0; i < num.length; i++) {
            if(max < num[i]){
                max = num[i];
            }
        }
        System.out.println("Maximum value: "+ max);
    }

    public static void findMax3(int[] num){

        int maxNumber = Arrays.stream(num).max().getAsInt();
        System.out.println("Max: " + maxNumber);
    }
}
