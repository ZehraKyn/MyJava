package soruCozumu;

import java.util.*;

public class FindTwoMin {

    public static void main(String[] args) {

        int[] num = {11, 65, 87,32, 4, 89, 2, 2, 4};
        System.out.println(Arrays.toString(findTwoMin(num))); //Array'i yazdirmak icin Arrays.toString kullaniyoruz
    }


    public static int[] findTwoMin(int[] arr){

        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < firstMin){
                secondMin = firstMin;
                firstMin = arr[i];
            }
            else if(arr[i] < secondMin && arr[i] != firstMin){  //!= kondisiniyla birbirinin ayni olan degerleri istemiyorum
                secondMin = arr[i];

            }
        }
        return new int[]{firstMin,secondMin};
    }


}
