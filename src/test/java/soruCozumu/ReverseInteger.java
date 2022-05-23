package soruCozumu;

public class ReverseInteger {
    public static void main(String[] args) {

        int num = 123456;
    //    System.out.println(reverseInt1(num));
        System.out.println(reverseInt2(num));
    }

    public static int reverseInt1(int number){

        int newReverseInteger = 0;

        while (number > 0){
            int remainder = number % 10;
            newReverseInteger = newReverseInteger * 10 + remainder;
            number = number /10;
        }
        return  newReverseInteger;
    }

    // 2nd Way
    public static int reverseInt2(int number){

        String str = Integer.toString(number);
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        int result = Integer.parseInt(sb.toString());

        return result;
    }
}
