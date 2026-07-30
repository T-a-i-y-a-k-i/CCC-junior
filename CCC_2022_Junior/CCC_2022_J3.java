package CCC_2022_Junior;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CCC_2022_J3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextLine()) return;
        
        String input = scanner.nextLine().trim();
        
        // Matcher groups: Group 1 = letters, Group 2 = operator, Group 3 = digits
        Pattern pattern = Pattern.compile("([A-Z]+)([+\\-])(\\d+)");
        Matcher matcher = pattern.matcher(input);
        
        while (matcher.find()) {
            String strings = matcher.group(1);
            String action = matcher.group(2).equals("+") ? "tighten" : "loosen";
            String turns = matcher.group(3);
            
            System.out.println(strings + " " + action + " " + turns);
        }
    }
}