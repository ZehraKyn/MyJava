package soruCozumu;

public class FindOdd {
    public static void main(String[] args) {

        int[] number = {1,2,3,4,5,6,7,8,9};
        System.out.println(oddNum(number));
    }

    public static int oddNum(int[] num){
        int count = 0;
        for (int i = 0; i <num.length; i++) {
            if(num[i] % 2 != 0){
                count++;
            }
        }
        return count;
    }
}
