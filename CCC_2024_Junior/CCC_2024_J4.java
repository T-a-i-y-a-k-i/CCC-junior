package CCC_2024_Junior;
import java.util.Scanner;

public class CCC_2024_J4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String pressed = scan.next();
        String displayed = scan.next();
        
        char sillyKey = '-';
        char wrongChar = '-';
        char quietKey = '-';
        
        for (int i = 0; i < displayed.length(); i++) {
            char ch = displayed.charAt(i);
            if (pressed.indexOf(ch) == -1) {
                wrongChar = ch;
                break;
            }
        }
        
        if (wrongChar == '-') {
            boolean[] displayedChars = new boolean[26];
            for (char c : displayed.toCharArray()) displayedChars[c - 'a'] = true;
            for (char c : pressed.toCharArray()) displayedChars[c - 'a'] = false;
            
            for (int i = 0; i < 26; i++) {
                if (displayedChars[i]) {
                    wrongChar = (char) ('a' + i);
                    break;
                }
            }
        }

        outerLoop:
        for (char s = 'a'; s <= 'z'; s++) {
            for (char q = 'a'; q <= 'z'; q++) {
                if (s == q) continue; 

                StringBuilder simulation = new StringBuilder();
                for (int i = 0; i < pressed.length(); i++) {
                    char ch = pressed.charAt(i);
                    if (ch == s) {
                        simulation.append(wrongChar); 
                    } else if (ch == q) {
                    } else {
                        simulation.append(ch);
                    }
                }
                if (simulation.toString().equals(displayed)) {
                    sillyKey = s;
                    quietKey = q;
                    break outerLoop;
                }
            }
        }
        if (pressed.length() == displayed.length()) {
            quietKey = '-';
        }
        System.out.println(sillyKey + " " + wrongChar);
        System.out.println(quietKey);
    }
}
