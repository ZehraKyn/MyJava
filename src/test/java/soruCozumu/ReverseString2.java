package soruCozumu;

import java.util.Arrays;

public class ReverseString2 {

    public static void main(String[] args) {

        String words = "Eve gelirken ekmek al";
        String sentence = "I live in Usa";

        String[] arr = sentence.split(" "); // burda her kelimeyi bi karakter gibi dusun.
     //   System.out.println(Arrays.toString(arr)); // I live in Usa'yi Array'in icine koydu.

        String newStr = "";
        for(int i = arr.length-1; i>=0; i--){
            newStr = newStr.concat(arr[i].concat(" "));
            // Once arr[i] + boslugu beraber alip ikisini beraber yeni olusan Stringe ekliyouz.
        }
        System.out.println(newStr);
    //    System.out.println(reverseString(words));

    }

    //Kelilemeleri geri donderiyor harf harf degil, kelime kelime
    public static String reverseString(String sentence){
        String[] splitArray = sentence.split(" ");
        String strNew = "";
        for(int i = splitArray.length-1; i>=0; i--){
            strNew = strNew.concat(splitArray[i].concat(" "));
        }
        return strNew;
    }
}
