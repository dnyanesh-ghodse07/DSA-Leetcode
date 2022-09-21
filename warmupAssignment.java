import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class warmupAssignment {
    public static void moveZeros() {
        int[] arr = { 0, 1, 0, 3, 12 };
        int n = arr.length;
        int resIndex = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
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

    public static void findMax2(int[] arr, int n) {
        int max1 = arr[0];
        int max2 = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            }
        }
        System.out.println(max1);
        System.out.println(max2);
    }

    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int majorityLength = nums.length / 2;
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if (map.get(nums[i]) > majorityLength) {
                return nums[i];
            }
        }
        // returning default value;
        return -1;
    }

    public static boolean threeConsecutive(int[] arr) {
        int odd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                odd++;
                if (odd == 3) {
                    return true;
                }
            } else {
                odd = 0;
            }
        }
        return false;
    }

    public static int[][] transpose(int[][] A) {
        int outerLength = A.length;
        int innerLength = A[0].length;
        int[][] B = new int[innerLength][outerLength];
        int i = 0;
        int j = 0;
        while (i != innerLength) {
            B[i][j] = A[j][i];
            j++;
            if (j == outerLength) {
                i++;
                j = 0;
            }
        }
        for (int j2 = 0; j2 < B.length; j2++) {
            for (int k = 0; k < B[0].length; k++) {
                System.out.println(B[j2][k]);
            }
        }
        return B;
    }

    public static int maximumWealth(int[][] accounts) {
        int sum = 0;
        for (int i = 0; i < accounts.length; i++) {
            int curSum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                curSum += accounts[i][j];
                if (curSum > sum) {
                    sum = curSum;
                }
            }

        }
        return sum;
    }

    public static int numJewelsInStones(String jewels, String stones) {
        char[] j = jewels.toCharArray();
        char[] s = stones.toCharArray();
        int count = 0;
        for (int i = 0; i < s.length; i++) {
            for (int k = 0; k < j.length; k++) {
                if (s[i] == j[k]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            min = Math.min(arr[i + 1] - arr[i], min);
        }
        for (int i = 0; i < arr.length - 1; i++) {
            List<Integer> cur = new ArrayList<>();
            if (arr[i + 1] - arr[i] == min) {
                cur.add(arr[i]);
                cur.add(arr[i + 1]);
                res.add(cur);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        // 1 moveZeros
        moveZeros();

        // 2 findMax2
        int[] arr = { 0, 1, 0, 3, 12 };
        int n = arr.length;
        findMax2(arr, n);

        // 3 majorityElement
        majorityElement(arr);

        // 4 threeConsecutive
        threeConsecutive(arr);

        // 5 transpose matrix
        int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        transpose(a);

        // 6 maximumWealth
        int[][] mxArr = { { 1, 2, 3 }, { 3, 2, 1 } };
        maximumWealth(mxArr);

        // 7 numJewelsInStones
        String jewels = "aA";
        String stones = "aAAbbbb";
        numJewelsInStones(jewels, stones);

        //8 minimumAbsDifference
        int [] difArr = {4,2,1,3};
        minimumAbsDifference(difArr);
    }
}
