package CCC_2021_Junior;
import java.util.Scanner;
public class CCC_2021_J3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int total = 0;
        String winner = "";

        for (int i=0; i<N; i++){
            scan.nextLine();
            String name = scan.next(); 
            int number = scan.nextInt();
            if (number>total){
                winner = name;
                total = number;
            }
        }

        System.out.print(winner);
    }
}
