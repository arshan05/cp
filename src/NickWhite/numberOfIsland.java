package NickWhite;

public class numberOfIsland {
    public static int numIslands(char[][] grid) {
       int count =0;

       for (int i=0; i<grid.length;i++){
           for (int j=0; j<grid[i].length;j++){
               if(grid[i][j] == '1'){
                   count++;
                   call(grid,i,j);
               }
           }
       }

       return count;
    }

    private static void call(char[][] grid, int i, int j) {
        if(i<0 || i>=grid.length || j<0|| j>=grid[i].length || grid[i][j]=='0')
        return;

        grid[i][j]='0';
        call(grid, i+1, j); //up
        call(grid, i-1, j); //down
        call(grid, i, j-1);//left
        call(grid, i, j+1);//rigth

    }

    public static void main(String[] args) {
        char[][] grid = {{'1','1','0','0','0'}, {'1','1','0','0','0'}, {'0','0','1','0','0'},
                {'0','0','0','1','1'}};

        System.out.println(numIslands(grid));
    }


}
