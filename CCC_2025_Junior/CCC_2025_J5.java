package CCC_2025_Junior;

import java.util.Arrays;
import java.util.Scanner;

public class CCC_2025_J5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int R = scan.nextInt();
        int C = scan.nextInt();
        int M = scan.nextInt();
        int []min = new int[C];
        int minimum = Integer.MAX_VALUE;
        Arrays.fill(min, Integer.MAX_VALUE);

        int[]prevRow = new int[C];
        int[]curRow = new int[C];

        for(int i=0; i<C; i++){
            prevRow[i] = i%M+1;
            curRow[i] = ((prevRow[i] - 1 + (C % M)) % M) + 1;
        }

        for(int i=0; i<R-1; i++){
            Arrays.fill(min, Integer.MAX_VALUE);
            for(int j=0; j<C; j++){
                if(j>0) min[j] = curRow[j] + prevRow[j-1]; 
                if(curRow[j]+prevRow[j]< min[j]) min[j] = curRow[j] + prevRow[j];
                if(j<C-1 && curRow[j]+prevRow[j+1] < min[j]) min[j] = curRow[j]+prevRow[j+1];

                curRow[j] = ((curRow[j] - 1 + (C % M)) % M) + 1;
            }
            for(int j=0; j<C; j++){
                prevRow[j] = min[j];
            }
        }

        for(int i=0; i<C; i++){
            if(prevRow[i]<minimum) minimum = prevRow[i];
        }
        System.out.print(minimum);
    }
}