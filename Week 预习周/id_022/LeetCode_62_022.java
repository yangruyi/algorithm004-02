class Solution {
    // public int uniquePaths(int m, int n) {
    //     int[][] resArr = new int[m][n];
    //     for (int i = 0; i < m; i++) {
    //         resArr[i][0] = 1;
    //     }
    //     for (int i = 0; i < n; i++) {
    //         resArr[0][i] = 1;
    //     }
    //     for (int i = 1; i < m; i++) {
    //         for (int j = 1; j < n; j++) {
    //             resArr[i][j] = resArr[i-1][j] + resArr[i][j-1];
    //         }
    //     }
    //     return resArr[m-1][n-1];
    //     //O(m*n)
    // }
    
    public int uniquePaths(int m, int n) {
        int[] preArr = new int[n];
        int[] curArr = new int[n];
        Arrays.fill(preArr,1);
        Arrays.fill(curArr,1);
        for (int i = 1; i < m; i++) {
            for (int j = 1;j < n;j++) {
                curArr[j] = curArr[j-1] + preArr[j];
            }
            preArr = curArr.clone();
        }
        return curArr[n-1];
    }
    
    
    // public int uniquePaths(int m, int n) {
    //     int[]preArr = new int[n];
    //     int[]curArr = new int[n];
    //     //i[0,m-1),j[0,n-1],
    //     Arrays.fill(preArr,1);
    //     Arrays.fill(curArr,1);
    //     for (int i= 1;i<m;i++) {
    //         for (int j =1;j<n;j++) {
    //             curArr[j] = curArr[j-1] + preArr[j];
    //         }
    //         preArr = curArr.clone();
    //     }
    //     return preArr[n-1];
    // }
}