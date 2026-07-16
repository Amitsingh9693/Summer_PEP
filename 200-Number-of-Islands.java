class Solution {
    public int numIslands(char[][] grid) {
        int i=0;
        boolean[][] vis=new boolean[grid.length][grid[0].length];
        for(int j=0;j<grid.length;j++){
            for(int k=0;k<grid[0].length;k++){
                if(grid[j][k]=='1'&& !vis[j][k]){
                    i++;
                    dfs(grid,vis,j,k);
                }
            }
        }
        return i;
    }
    public void dfs(char[][] grid,boolean[][]vis,int a,int b){
        if(a<0||b<0||a>=grid.length||b>=grid[0].length||grid[a][b]=='0'||vis[a][b]) return;
        vis[a][b]=true;
        dfs(grid,vis,a-1,b);
        dfs(grid,vis,a+1,b);
        dfs(grid,vis,a,b-1);
        dfs(grid,vis,a,b+1);
    }
}