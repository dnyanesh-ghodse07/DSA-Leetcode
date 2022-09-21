public class removeDuplicates {
    public static void removeDuplicates(int[] nums) {

        int j = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i] != nums[i + 1]){
                nums[j] = nums[i + 1];
                j++;
            }
        }
        for (int i = 0; i < j; i++) {
            System.out.print(nums[i]);
        }
        System.out.println(j);
        
    }
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        removeDuplicates(nums);
    }
}
