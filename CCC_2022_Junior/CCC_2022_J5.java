package CCC_2022_Junior;
import java.util.Scanner;

public class CCC_2022_J5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int T = scan.nextInt();
        int[][] grid = new int[N][N];
        int max = 1;
        int curMax = 0;

        for(int i=0; i<T; i++){
            int xIndex = scan.nextInt();
            int yIndex = scan.nextInt();
            grid[xIndex][yIndex] = 1;
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<N;  j++){
                if(grid[i+max][j+max]!=1) {
                    curMax = checkMax(grid, i, j, max);
                    if(curMax > max) max = curMax;
                }
            }
        }
        System.out.print(max);
    }
    public static int checkMax(int grid[][], int i, int j, int max){
        boolean greater = true;

        while(greater){
            if(grid[i+max+1][j+max+1]!=1){
                max++;
            } else {
                greater = false;
            }
        }
        return max;
    }
}