package CCC_2026_Junior;
import java.util.Scanner;

public class CCC_2026_J3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nEat = 0;
        int mEat = 0;
        int nCurrent = 0;
        int mCurrent = 0;
        String N = scan.next();
        String M = scan.next();
        boolean eating = true;

        while(eating){
            switch (N.charAt(nCurrent)) {
                case 'R' -> {
                    switch (M.charAt(mCurrent)) {
                        case 'R' -> { nEat++; mEat++; nCurrent++; mCurrent++; }
                        case 'B' -> { mEat++; nCurrent++; }
                        case 'G' -> { nEat++; mCurrent++; }
                    }
                }
                case 'G' -> {
                    switch (M.charAt(mCurrent)) {
                        case 'G' -> { nEat++; mEat++; nCurrent++; mCurrent++; }
                        case 'R' -> { mEat++; nCurrent++; }
                        case 'B' -> { nEat++; mCurrent++; }
                    }
                }
                case 'B' -> {
                    switch (M.charAt(mCurrent)) {
                        case 'B' -> { nEat++; mEat++; nCurrent++; mCurrent++; }
                        case 'G' -> { mEat++; nCurrent++; }
                        case 'R' -> { nEat++; mCurrent++; }
                    }
                }
            }
            if(mCurrent == M.length()){
                nEat+= N.length()-nCurrent;
                eating = false;
            } else if (nCurrent == N.length()){
                mEat+= M.length()-mCurrent;
                eating = false;
            }
        }
        System.out.println(nEat);
        System.out.print(mEat);
    }  
}
