package CCC_2018_Junior;
import java.util.Scanner;

public class CCC_2018_J4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        
        int[][] grid = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                grid[i][j] = scan.nextInt();
            }
        }
        
        while (!isValid(grid, N)) {
            grid = rotate90(grid, N);
        }
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(grid[i][j] + (j == N - 1 ? "" : " "));
            }
            System.out.println();
        }
        
    }
    
    private static boolean isValid(int[][] grid, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (grid[i][j] >= grid[i][j + 1]) {
                    return false;
                }
            }
        }
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n - 1; i++) {
                if (grid[i][j] >= grid[i + 1][j]) {
                    return false;
                }
            }
        }
        return true;
    }
    
    private static int[][] rotate90(int[][] grid, int n) {
        int[][] rotated = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][n - 1 - i] = grid[i][j];
            }
        }
        return rotated;
    }
}
