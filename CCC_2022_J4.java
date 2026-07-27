import java.util.Scanner;
import java.util.HashMap;

public class CCC_2022_J4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int totalViolations = 0;

        int X = scan.nextInt();
        String[][] together = new String[X][2];
        for (int i = 0; i < X; i++) {
            together[i][0] = scan.next();
            together[i][1] = scan.next();
        }

        int Y = scan.nextInt();
        String[][] apart = new String[Y][2];
        for (int i = 0; i < Y; i++) {
            apart[i][0] = scan.next();
            apart[i][1] = scan.next();
        }

        int G = scan.nextInt();
        HashMap<String, Integer> studentToGroup = new HashMap<>();
        
        for (int i = 0; i < G; i++) {
            String student1 = scan.next();
            String student2 = scan.next();
            String student3 = scan.next();
            
            studentToGroup.put(student1, i);
            studentToGroup.put(student2, i);
            studentToGroup.put(student3, i);
        }

        for (int i = 0; i < X; i++) {
            int groupA = studentToGroup.get(together[i][0]);
            int groupB = studentToGroup.get(together[i][1]);
            
            if (groupA != groupB) {
                totalViolations++;
            }
        }

        for (int i = 0; i < Y; i++) {
            int groupA = studentToGroup.get(apart[i][0]);
            int groupB = studentToGroup.get(apart[i][1]);
            
            if (groupA == groupB) {
                totalViolations++;
            }
        }

        System.out.println(totalViolations);
        scan.close();
    }
}