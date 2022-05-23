package soruCozumu;

import java.util.Arrays;

public class FindTwoMax {
    public static void main(String[] args) {
        int a[] = {3, 15, 10, 11, 9, 1, 25, 56, 68, 98};
       System.out.println(Arrays.toString(methods(a)));

    }

    public static int[] methods(int[] num){
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < num.length ; i++) {
            if(num[i] > firstMax){  //numaram firstmax'den buyukse. firstmax update ediliyor burda
                secondMax = firstMax;
                firstMax = num[i];
            }
            else if (num[i] > secondMax && num[i] != firstMax)  {
                secondMax = num[i];
            }
        }
        return new int[]{firstMax, secondMax}; //arrayin icinden iki numarayi(firstMax Secondmax), yeni bir array olarak donmesini istedigim icin new kullaniyorum.
    }
}

