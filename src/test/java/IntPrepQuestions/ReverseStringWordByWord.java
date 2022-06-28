package IntPrepQuestions;

public class ReverseStringWordByWord {
    public static void main(String[] args) {

        String sentence = "I like testing"; // I need a sentence that I will reverse it
        String reversed = "";   // I create a String as a containar for reversed String

        // harf harf tersten yazdirma
        String updated = "";
        for (int i = sentence.length()-1; i >=0; i--){
            updated = updated + sentence.charAt(i);
        }
        System.out.println(updated);


        // Word by word
        String [] array = sentence.split(" "); //{"I", "like", "testing"}
        for (int i = array.length-1; i>=0; i--){
            reversed = reversed + array[i] + " ";
        }
        System.out.println(reversed); // "testing like I "
        System.out.println(reversed.length());

    }
}
