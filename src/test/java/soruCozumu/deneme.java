package soruCozumu;

public class deneme {

    public static void main(String[] args){

        String str = "America";

        System.out.println(reverseString(str));

    }

    public static String reverseString(String str){

        String newStr = "";

        for(int i = str.length()-1; i>=0; i--){
            newStr += str.charAt(i);
        }
        return newStr;
    }
}
