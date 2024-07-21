import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int count = 0;
        for(int i=0; i<num; i++) {
            for(int j=0; j<num-i; j++) {
                System.out.print("* ");
                count++;
            }
            System.out.print("\n");

            for(int j=0; j<=i; j++) {
                System.out.print("* ");
                count++;
            }
            System.out.print("\n");
        }

    }
}