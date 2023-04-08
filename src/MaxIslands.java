import java.util.LinkedList;
import java.util.Queue;

public class MaxIslands
{

        public int numIslands(char[][] grid) {
            int rows = grid.length;
            int cols = grid[0].length;
            int count =0;
            Queue<int[]> queue = new LinkedList();
            int[][] directions = {{1,0},{0,1},{-1,0},{0,-1}};
            for(int i=0;i<rows;i++)
            {

                for(int j=0;j<cols;j++)
                {

                    if(grid[i][j]=='1')
                    {
                        count++;

                        queue.add(new int[]{i,j});

                        grid[i][j]='2';

                        while(!queue.isEmpty())
                        {

                            int[] curr = queue.poll();

                            for (int[] dir:directions)
                            {
                                int r = curr[0]+dir[0];
                                int c = curr[1]+dir[1];

                                if(r >= 0 && r < rows && c >= 0 && c < cols && grid[r][c] == '1'){
                                    queue.add(new int[] {r,c});
                                    grid[r][c] = '2';
                                }
                            }

                        }
                    }
                }

            }

            return count;
        }
    }
