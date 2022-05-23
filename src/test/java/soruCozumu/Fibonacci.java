package soruCozumu;

public class Fibonacci {
    public static void main(String[] args) {

        int number = 10;  //0,1,1,2,3,5 ==> 8
        // 10 burda for'un kac defa donecegini gosterir.
        System.out.println(method1(number));
    }

    public static int method1(int num){

        int num1 = 0;
        int num2 = 1;
        int sum;
        for (int i = 0; i < num; i++) { //ilk 10 sayi ama onuncu dahildegil cunku kucuktur dedik i<num
            sum = num1 + num2;
            num1 = num2; // sol taraftaki deger yenilenmis deger. yani soldakine sagdakini assign ediyoruz.sol taraftaki update edilmis deger.
            num2 = sum;
        }
        return num2;
    }
}
