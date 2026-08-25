package CCC_2023_Junior;
import java.util.Scanner;

public class CCC_2023_J5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String W = scan.next();
        int R = scan.nextInt();
        int C = scan.nextInt();
        String[][] grid = new String[R][C];
        int index = 0;
        int xdir = 0;
        int ydir = 0;
        int total = 0;

        for(int i=0; i<R; i++){
            for(int j=0; j<C; j++){
                grid[i][j] = scan.next();
            }
        }

        for(int i=0; i<R; i++){
            for(int j=0; j<C; j++){
                if (grid[i][j].equals(String.valueOf(W.charAt(0)))){
                    for(int k = -1; k<2; k++){
                        xdir=k;
                        for(int l = -1; l<2; l++){
                            ydir=l;
                            if (xdir == 0 && ydir == 0) continue;
                            total += check(grid, i, j, W, index, xdir, ydir, 0);
                        }
                    }
                }
            }
        }
        System.out.print(total);
    }   
    public static int check(String grid[][], int i, int j, String W, int index, int xdir, int ydir, int turn){
        int total = 0;
        if (i<0 || i>=grid.length || j<0 || j>=grid[0].length) return 0;
        if (!grid[i][j].equals(String.valueOf(W.charAt(index)))) return 0;
        if (index==W.length()-1) {
//            System.out.println(i + " " + j + " " + xdir + " " + ydir);
            return 1;
        }
        total += check(grid, i+ydir, j+xdir, W, index+1, xdir, ydir, turn);
        turn++;
        int xdir90 = ydir*-1;
        int ydir90 = xdir;
        if (turn > 1) return total;
        if (index >0){
            total += check(grid, i+ydir90, j+xdir90, W, index+1, xdir90, ydir90, turn);
            total += check(grid, i-ydir90, j-xdir90, W, index+1, -xdir90, -ydir90, turn);
        }
        
        return total;
    }
}