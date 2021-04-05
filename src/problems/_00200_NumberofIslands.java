package problems;

public class _00200_NumberofIslands {


    int x;
    int y;

    public int numIslands(char[][] grid) {
        x = grid.length;
        y = grid[0].length;

        boolean[][] visited = new boolean[x][y];

        int count = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (!visited[i][j] && grid[i][j] == '1') {
                    //방문한적이 없는 1은 신대륙
                    count++;    //카운트를 올리고
                    dfs(grid, i, j, visited);   //해당섬은 모두 방문표시
                }
            }
        }
        return count;
    }

    private void dfs(char[][] grid, int i, int j, boolean[][] visited) {
        if (i >= x || i < 0 || j >= y || j < 0 || visited[i][j] || grid[i][j] == '0') {
            return;
        } else {
            visited[i][j] = true;
            dfs(grid, i + 1, j, visited);
            dfs(grid, i - 1, j, visited);
            dfs(grid, i, j + 1, visited);
            dfs(grid, i, j - 1, visited);
        }
    }
}
