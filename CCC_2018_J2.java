import java.util.Scanner;

public class CCC_2018_J2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        String[] input = new String[2];
        int total = 0;

        input[0] = scan.next();
        input[1] = scan.next();

        for(int i=0; i<N; i++){
            if (input[0].charAt(i)==input[1].charAt(i) && input[0].charAt(i)=='C') total++;
        }
        System.out.print(total);
    }
}