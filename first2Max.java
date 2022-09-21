import java.util.Arrays;

class first2Max{
    private static void findMax1(int[] arr, int n) {
        Arrays.sort(arr);
        int first = arr[n - 1];
        int secLast  = arr[n - 2];
        System.out.println(first);
        System.out.println(secLast);
    }

    private static void findMax2(int[] arr, int n) {
        int max1 = arr[0];
        int max2 = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max1){
                max2 = max1;
                max1 = arr[i];
            }
        }
        System.out.println(max1);
        System.out.println(max2);
    }
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int n = arr.length;
        // findMax1(arr, n);
        findMax2(arr, n);

    }
}