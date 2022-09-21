public class threeConsecutiveOdd {
    private static boolean threeConsecutive(int[] arr) {
        int odd = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0){
                odd++;
                if(odd == 3){
                    return true;
                }
            }else{
                odd = 0;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,1};
        System.out.println(threeConsecutive(arr));

    }
}
