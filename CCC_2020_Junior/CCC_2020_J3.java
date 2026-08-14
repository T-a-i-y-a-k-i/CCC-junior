package CCC_2020_Junior;
import java.util.Scanner;

public class CCC_2020_J3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int maxY = 0;
        int minY = Integer.MAX_VALUE;
        int maxX = 0;
        int minX = Integer.MAX_VALUE;

        for(int i=0; i<N; i++){
            String[] coordinate = scan.next().split(",");
            int X = Integer.parseInt(coordinate[0]);
            int Y = Integer.parseInt(coordinate[1]);

            if(X>maxX) maxX = X;
            if(X<minX) minX = X;
            if(Y>maxY) maxY = Y;
            if(Y<minY) minY = Y;
        }
        System.out.println((minX-1)+","+(minY-1));
        System.out.print((maxX+1)+","+(maxY+1));
    }
}
