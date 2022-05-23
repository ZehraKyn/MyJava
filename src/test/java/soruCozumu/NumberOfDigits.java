package soruCozumu;

public class NumberOfDigits {
    public static void main(String[] args) {

        // Integer da kac digit var onu buluyoruz
        int number = 876534219;
        System.out.println(method1(number));
    }

    public static int method1(int num){

        int count = 0;
        while(num!=0){
            count++;

            num = num /10;
        }
        return count;
    }
}
