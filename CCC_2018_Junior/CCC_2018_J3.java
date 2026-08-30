package CCC_2018_Junior;
import java.util.Scanner;

public class CCC_2018_J3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] chart = new int[5][5];
        chart[0][1] = scan.nextInt();
        chart[0][2] = scan.nextInt()+chart[0][1];
        chart[0][3] = scan.nextInt()+chart[0][2];
        chart[0][4] = scan.nextInt()+chart[0][3];

        for(int i=0; i<5; i++)System.out.print(chart[0][i]+ " ");

        for(int i=1; i<5; i++){
            System.out.println();
            for(int j=0; j<5; j++){
                chart[i][j] = Math.abs(chart[0][j]-chart[0][i]);
                System.out.print(chart[i][j]+ " ");
            }
        }
    }
}