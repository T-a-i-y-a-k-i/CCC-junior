package CCC_2024_Junior;

import java.util.Scanner;

public class CCC_2024_J5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int R = scan.nextInt();
        int C = scan.nextInt();
        String[] patch = new String[R];
        int [][] visited = new int[C][R];
        boolean unknown = true;

        for(int i=0; i<R; i++){
            patch[i] = scan.next();
        }
        int Y = scan.nextInt();
        int X = scan.nextInt();

        System.out.println(fill(patch, X, Y, C, R, visited));

    }
    public static int fill(String patch[], int X, int Y, int C, int R, int visited[][]){
        int total = 0;

        if(X<0 || Y>=R || Y<0 || X>=C|| visited[X][Y]== 1 || visited[X][Y] == 2) return 0;

        if(patch[Y].charAt(X)!='*'){
            visited[X][Y]=1;
        } else {
            visited[X][Y]=2;
            return 0;
        }

        if(patch[Y].charAt(X)=='S'){
            total ++;
        } else if (patch[Y].charAt(X)== 'M'){
            total += 5;
        } else if (patch[Y].charAt(X)== 'L') total += 10;

        total += fill(patch, X-1, Y, C, R, visited);
        total += fill(patch, X+1, Y, C, R, visited);
        total += fill(patch, X, Y+1, C, R, visited);
        total +=fill(patch, X, Y-1, C, R, visited);
        
        return(total);
    }
}
