package CCC_2019_Junior;
import java.util.Scanner;

public class CCC_2019_J3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        String[] input = new String[N];

        for(int i=0; i<N; i++){
            input[i] = scan.next();
            System.out.println(convert(input[i]));
        }
    }
    public static String convert(String input){
        char current = input.charAt(0);
        int total = 0;
        String output = "";
        for(int i=0; i<input.length(); i++){
            if(input.charAt(i)!=current){
                output += String.valueOf(total) + " " + current + " ";
                current = input.charAt(i);
                total = 1;
            } else {
                total++;
            }
            
            if(i==input.length()-1){
                output += String.valueOf(total) + " " + current;
            }
        }
        return output;
    }
}
