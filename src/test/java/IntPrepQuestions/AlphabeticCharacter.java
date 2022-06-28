package IntPrepQuestions;

public class AlphabeticCharacter {

    public static void main(String[] args) {

          //Find out how many alpha characters are present in a string?
//        String str = " Hih9898jhjh%%^$%^ oio " ;
//        str = str .replaceAll( "[^A-Za-z]" , "" );
//        System.out.println(str);
//        int number = str .length();
//        System. out .println( "Number of alpha character = " + number );

        //Find the number of words in string?
        String myString = "Today is Wednesday and it is Java Class" ;
        String[] array = myString .split( " " );
        for(String a : array){
            System.out.println(a);
        }
        int words = array . length ;
        System. out .println( "Total words in string:" + myString + " = " + words );
    }
}
