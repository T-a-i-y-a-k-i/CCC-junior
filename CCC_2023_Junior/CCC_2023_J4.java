package CCC_2023_Junior;
import java.util.Scanner;

public class CCC_2023_J4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int C = scan.nextInt();
        
        int[][] pathway = new int[2][C]; 
        int total = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < C; j++) {
                pathway[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < C; j++) {
                if (pathway[i][j] == 1) {
                    total += 3; 
                    
                    if (j + 1 < C && pathway[i][j + 1] == 1) {
                        total -= 2; 
                    }
                    
                    if (i == 0 && j % 2 == 0 && pathway[1][j] == 1) {
                        total -= 2; 
                    }
                }
            }
        }
        System.out.println(total);
    }
}
