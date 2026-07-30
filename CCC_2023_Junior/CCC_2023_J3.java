package CCC_2023_Junior;
import java.util.Scanner;
import java.util.ArrayList;

public class CCC_2023_J3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int[] dayTotals = new int[5];
        int greatest = 0;
        
        for (int i = 0; i < N; i++) {
            String attendance = scan.next();
            for (int j = 0; j < 5; j++) {
                if (attendance.charAt(j) == 'Y') dayTotals[j]++; 
            }
        }
        
        for (int i = 0; i < 5; i++) {
            if (dayTotals[i] > greatest) {
                greatest = dayTotals[i];
            }
        }
        
        ArrayList<Integer> Days = new ArrayList<>();
        for (int j = 0; j < 5; j++) {
            if (dayTotals[j] == greatest) {
                Days.add(j + 1); 
            }
        }
        
        for (int i = 0; i < Days.size(); i++) {
            System.out.print(Days.get(i));
            if (i < Days.size() - 1) System.out.print(",");
        }
    }
}

