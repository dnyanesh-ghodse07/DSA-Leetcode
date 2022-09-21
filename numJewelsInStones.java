public class numJewelsInStones {
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
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        numJewelsInStones(jewels,stones);
    }
}
