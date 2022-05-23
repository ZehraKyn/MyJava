package soruCozumu;

public class LenghtOfString {
    public static void main(String[] args) {
        //Stringin uzunlugunu aliyoruz bu sayfada yani kac karakteri var stringin icinde

       String word = "Casablanca";
      //  String word2 = "";
       // System.out.println(lenghtString(word2));

        int count1 = word.lastIndexOf(""); //lastIndexOf("") ile de Stringin uzunlugunu alabiliriz.
        System.out.println(count1);

    }

    public static int lenghtString(String str){
        int count = 0;
        for (char each: str.toCharArray()) {
            count++;
        }
        return count;
    }
}
