class maximumWealth{
    public static int maximumWealth(int[][] accounts) {
        int sum = 0;
        for (int i = 0; i < accounts.length; i++) {
            int curSum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                curSum += accounts[i][j];
                if(curSum > sum){
                    sum = curSum;
                }
            }
            
        }
        return sum;
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{3,2,1}};
        maximumWealth(arr);
    }
}
