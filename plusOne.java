

public class plusOne {
    public static void plusOne(int[] arr) {
        int n = arr.length;
        int sum = 0;
        if(n < 2){
            return ;
        }
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        sum = sum + 1;
        for (int i = 0; i < n; i++) {

        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        plusOne(arr);
    }
}
