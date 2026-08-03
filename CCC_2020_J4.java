import java.util.Scanner;

public class CCC_2020_J4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String t = scan.nextLine();
        String s = scan.nextLine();
        
        boolean found = false;
        
        for (int i = 0; i < s.length(); i++) {
            if (t.contains(s)) {
                found = true;
                break;
            }

            s = s.substring(1) + s.charAt(0);
        }
        
        if (found) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        
    }
}
