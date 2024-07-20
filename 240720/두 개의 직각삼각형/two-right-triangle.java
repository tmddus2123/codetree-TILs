import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for(int i=0; i<num*2; i++) {

            for(int j=0; j<num-i; j++) {
                System.out.print("*");
            }

            for(int j=0; j<i*2; j++) {
                System.out.print(" ");
            }

            for(int j=0; j<num-i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");


        }
    }
}