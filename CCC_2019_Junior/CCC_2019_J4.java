package CCC_2019_Junior;
import java.util.Scanner;

public class CCC_2019_J4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (!scanner.hasNext()) {
            return;
        }

        String line = scanner.next();
        
        int topLeft = 1;
        int topRight = 2;
        int bottomLeft = 3;
        int bottomRight = 4;
        
        int hCount = 0;
        int vCount = 0;
        
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == 'H') {
                hCount++;
            } else if (line.charAt(i) == 'V') {
                vCount++;
            }
        }
        
        if (hCount % 2 != 0) {
            int tempLeft = topLeft;
            int tempRight = topRight;
            
            topLeft = bottomLeft;
            topRight = bottomRight;
            
            bottomLeft = tempLeft;
            bottomRight = tempRight;
        }
        
        if (vCount % 2 != 0) {
            int tempTop = topLeft;
            int tempBottom = bottomLeft;
            
            topLeft = topRight;
            bottomLeft = bottomRight;
            
            topRight = tempTop;
            bottomRight = tempBottom;
        }
        
        System.out.println(topLeft + " " + topRight);
        System.out.println(bottomLeft + " " + bottomRight);
    }
}
