package CCC_2026_Junior;
import java.util.Scanner;

public class CCC_2026_J5_copy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int L = scan.nextInt();
        int Q = scan.nextInt();
        int [][]lights = new int[2][L];
        int []spots = new int[Q];
        int []act = new int[N+1];
        boolean []lit = new boolean[N];
        int val = 0;

        for (int i=0; i<L; i++){
            lights[0][i] = scan.nextInt();
            lights[1][i] = scan.nextInt();
        }

        for(int i=0; i<Q; i++){
            spots[i] = scan.nextInt();
        }

        for (int i=0; i<L; i++){
            int min = Math.max(lights[0][i]-lights[1][i]-1, 0);
            int max = Math.min(lights[0][i]+lights[1][i], N-1);

            act[min]++;
            act[max]--;
        }

        for(int i=0; i<N; i++){
            val += act[i];
            lit[i] = val>0 ? true : false; 
        }

        for(int i=0; i<Q; i++){
            if(lit[spots[i]-1]){
                System.out.println("Y");
            } else {
                System.out.println("N");
            }
        }
    }
}