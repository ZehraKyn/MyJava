package soruCozumu;

public class Flag {
    public static void main(String[] args) {

        int[] arr = {1,2,3,6,9,8,7};
        int num =11;
        boolean flag = false;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num){
                flag = true;
                break;
            }else{
                flag = false;
            }
        }
        if(flag){
            System.out.println("It is found");
        }else{
            System.out.println("It is not found");
        }
    }
}
