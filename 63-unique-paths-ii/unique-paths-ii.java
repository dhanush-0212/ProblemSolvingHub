class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid == null || obstacleGrid.length == 0 || obstacleGrid[0][0] == 1) {
        return 0;
    }
    int m = obstacleGrid.length;
    int n = obstacleGrid[0].length;
    int[] prev = new int[n];

    // initialize first row
    for (int j = 0; j < n; j++) {
        if (obstacleGrid[0][j] == 1) {
            break; // everything after obstacle is blocked
        }
        prev[j] = 1;
    }

    // iterate rows
    for (int i = 1; i < m; i++) {
        int[] temp = new int[n];
        // first column depends on obstacle
        if (obstacleGrid[i][0] == 0) {
            temp[0] = prev[0]; // only continue if no obstacle
        }
        for (int j = 1; j < n; j++) {
            if (obstacleGrid[i][j] == 1) {
                temp[j] = 0; // obstacle blocks path
            } else {
                temp[j] = prev[j] + temp[j - 1];
            }
        }
        prev = temp;
    }
    return prev[n - 1];
    }
}