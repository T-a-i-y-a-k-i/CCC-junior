import java.util.Scanner;

public class CCC_2018_J1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] number = new int[4];

        for(int i=0; i<4; i++){
            number[i] = scan.nextInt();
        }

        if(number[0]==8 || number[0]==9){
            if(number[1]==number[2]){
                if(number[3]==8||number[3]==9){
                    System.out.println("ignore");
                } else {
                    System.out.println("answer");
                }
            } else {
                System.out.println("answer");
            }
        } else {
            System.out.println("answer");
        }
    }
}