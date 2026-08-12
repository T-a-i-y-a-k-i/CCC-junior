package CCC_2025_Junior;

import java.util.Scanner;
import java.util.ArrayList;

public class CCC_2025_J4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        ArrayList<Integer> rainPositions = new ArrayList<>();
        
        rainPositions.add(-1);

        for (int i = 0; i < N; i++) {
            String day = scan.next();
            if (day.equals("P")) {
                rainPositions.add(i);
            }
        }

        rainPositions.add(N);

        if (rainPositions.size() == 2) {
            System.out.println(N - 1);
            return;
        }

        int maxStreak = 0;

        for (int i = 0; i < rainPositions.size() - 2; i++) {
            int leftRain = rainPositions.get(i);
            int rightRain = rainPositions.get(i + 2);
            
            int currentStreak = rightRain - leftRain - 1;
            
            if (currentStreak > maxStreak) {
                maxStreak = currentStreak;
            }
        }

        System.out.println(maxStreak);
    }
}

