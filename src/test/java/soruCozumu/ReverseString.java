package soruCozumu;

public class ReverseString {

    public static void main(String[] args) {

        String str = "I love Testing";

      //  System.out.println(reverseString1(str));
      //  System.out.println(reverseString2(str));
       System.out.println(reverseString3(str));
       // System.out.println(reverseString4(str));
       // System.out.println(reverseString5(str));
    }

    public static String reverseString1(String str){
          String newStr = "";
          for(int i = str.length()-1; i>=0; i--){
              newStr += str.charAt(i);  //neden +=?
          }
          return newStr;
    }
    // STRING BUFFER
    public static String reverseString2(String str){
        StringBuffer sb = new StringBuffer();
        for (int i = str.length()-1; i>=0; i--){
            sb.append(str.charAt(i)); // StringBuffer'a(sb) Stringin icerisindeki tum karakterleri charAt() ile ekliyoruz.
                                        // append() ilede gezdigi karakteri sb'ye eklicek.
        }
        if (sb.toString().equals(str)){
            System.out.println("Palindrome");
        }else{
            System.out.println("No");
        }
        return sb.toString();
    }

    public static String reverseString3(String str){
      //  StringBuffer sb = new StringBuffer(str);
        StringBuffer sb = new StringBuffer();
       return sb.append(str).reverse().toString();
        //return  sb.toString; //toString ile StringBuffer olan objeyi Stringe ceviriyoruz. **String ile StringBuffer farkli typler.
    }


    public static String reverseString4(String str){
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb.reverse().toString();
    }

    public static String reverseString5(String str){
        char[] arr = str.toCharArray(); // Karakterlere tek tek bakmak isetdigimiz icin String'i char Array'e cevirdik. toCharArray()

        //I love Testing
        int left = 0; //burda int'e assign ederek index olarak kullanmak icin iki tane int create ettik
        int right = arr.length-1;
        while (left < right){
            char temp = arr[left];  // swap yapmaya basliyoruz burda. ** Sut ve Yag bardagini hatirla
            arr[left] = arr[right];
            arr[right] = temp;

            left++; //I'dan artiriken en sondaki g'den eksilterek geri geliyor
            right--;
        } return new String(arr);  //Neden new keyword kullandik?  ** 51.line'da stringi charArray'e cevirmistik ama return type string old icin
                                   // new String(arr) ile tekrar Stringe ceviriyoruz.
    }

}
