package soruCozumu;

public class MissingNumber {

    public static void main(String[] args) {
        int[] number1 = {1,2,3,4,5,7};

        int sum1= 0;
        for (int i = 0; i < number1.length; i++) {
            sum1 += number1[i];
        }
        int sum2 = 0;
        for (int i = 1; i <= 7; i++) {
            sum2 += i;
        }
        System.out.println(sum2 - sum1);
    }

}
