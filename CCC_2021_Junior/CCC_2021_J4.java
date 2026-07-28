package CCC_2021_Junior;
import java.util.Scanner;

public class CCC_2021_J4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String books = scan.next();
        char[] totalBooks = books.toCharArray();

        int total = 0;
        int largeTotal = 0;
        int mediumTotal = 0;
        int smallTotal = 0;
        int smallInLarge = 0;
        int smallInMedium = 0;
        int mediumInLarge = 0;
        int mediumInSmall = 0;
        int largeInSmall = 0;
        int largeInMedium = 0;

        for (int i=0; i<totalBooks.length; i++){
            if (totalBooks[i] == ('L')){
                largeTotal ++;
            } else if (totalBooks[i] == ('M')){
                mediumTotal ++;
            } else {
                smallTotal ++;
            }
        }

        for (int i = 0; i < totalBooks.length; i++) {
            char currentBook = totalBooks[i];

            if (i < largeTotal) {
                switch (currentBook) {
                    case 'M' -> mediumInLarge++;
                    case 'S' -> smallInLarge++;
                }
            } else if (i < largeTotal + mediumTotal) {
                switch (currentBook) {
                    case 'L' -> largeInMedium++;
                    case 'S' -> smallInMedium++;
                }
            } else {
                switch (currentBook) {
                    case 'L' -> largeInSmall++;
                    case 'M' -> mediumInSmall++;
                }
            }
        }

        int swaps = 0;

        int lmSwaps = Math.min(largeInMedium, mediumInLarge);
        swaps += lmSwaps;
        largeInMedium -= lmSwaps;
        mediumInLarge -= lmSwaps;

        int lsSwaps = Math.min(largeInSmall, smallInLarge);
        swaps += lsSwaps;
        largeInSmall -= lsSwaps;
        smallInLarge -= lsSwaps;

        int msSwaps = Math.min(mediumInSmall, smallInMedium);
        swaps += msSwaps;
        mediumInSmall -= msSwaps;
        smallInMedium -= msSwaps;

        int remainingMisplacedInLarge = largeInMedium + mediumInLarge + largeInSmall + smallInLarge + mediumInSmall + smallInMedium;
        swaps += (remainingMisplacedInLarge / 3) * 2;

        System.out.println(swaps);
    }
}
