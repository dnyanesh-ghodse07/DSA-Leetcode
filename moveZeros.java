public class moveZeros {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        int n = arr.length;
        int resIndex = 0;

        for (int i = 0; i < n; i++) {
                if(arr[i] != 0){
                    arr[resIndex] = arr[i];
                    resIndex++;
                }
        }
        for (int i = resIndex; i < n; i++) {
            arr[i] = 0;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
