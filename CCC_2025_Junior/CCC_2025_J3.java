package CCC_2025_Junior;

import java.util.Scanner;

public class CCC_2025_J3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        for (int i = 0; i < N; i++) {
            String code = scan.next();    
            StringBuilder upperLetters = new StringBuilder();
            int total = 0;
            
            for (int j = 0; j < code.length(); j++) {
                char ch = code.charAt(j);
                if (Character.isUpperCase(ch)) upperLetters.append(ch);
            }

            int j = 0;
            while (j < code.length()) {
                char ch = code.charAt(j);

                if (ch == '-' || Character.isDigit(ch)) {
                    StringBuilder numStr = new StringBuilder();
                    numStr.append(ch);
                    j++;

                    while (j < code.length() && Character.isDigit(code.charAt(j))) {
                        numStr.append(code.charAt(j));
                        j++;
                    }
                    if (numStr.toString().equals("-")) continue; 

                    total += Integer.parseInt(numStr.toString());
                } else {
                    j++;
                }
            }
            System.out.print(upperLetters);
            System.out.println(total);
        }
    }
}
