import java.util.HashMap;

public class majorityElement {
    public static int majElement(int[] arr) {
        int index = -1;
        int maxCount = 0;
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if( count > maxCount){
                maxCount = count;
                index = i;
            }
        }
        if(maxCount > n / 2){
            System.out.println(arr[index]);
        }else{
            System.out.println("Not Found");
        }
        return 0;
    }
    public static int name(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int majorityLength = nums.length/2;
        for (int i = 0; i < nums.length; i++) {
                map.put(nums[i], map.getOrDefault(nums[i],0) +1);
                if(map.get(nums[i]) > majorityLength) {
                    return nums[i];
                }
        }
        //returning default value;
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {9,9,10};
        System.out.println(majElement(arr));
        System.out.println(name(arr));
    }
}
