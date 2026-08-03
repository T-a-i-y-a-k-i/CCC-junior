package CCC_2026_Junior;
import java.util.Scanner;

public class CCC_2026_J5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int smallest = Integer.MAX_VALUE;
        int smallestIndex = 0;
        int distance = 0;

        int N = scan.nextInt();
        int L = scan.nextInt();
        int Q = scan.nextInt();
        int [][]lights = new int[2][L];
        int []spots = new int[Q];

        for (int i=0; i<L; i++){
            lights[0][i] = scan.nextInt();
            lights[1][i] = scan.nextInt();
        }

        for(int i=0; i<Q; i++){
            spots[i] = scan.nextInt();
        }

        for(int i=0; i<Q; i++){
            smallest = Integer.MAX_VALUE;
            smallestIndex = 0;
            for(int j=0; j<L; j++){
                distance = Math.abs(spots[i]-lights[0][j])-lights[1][j];
                if(distance<smallest){
                    smallest = distance;
                    smallestIndex = j;
                }
            }
            if(smallest<1){
                System.out.println("Y");
            } else {
                System.out.println("N");
            }
        }
    }
}