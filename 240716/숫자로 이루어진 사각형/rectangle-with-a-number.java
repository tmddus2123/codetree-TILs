import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        printNum(num);
    }

    public static void printNum(int num) {
        int count = 0;

        for(int i=0; i<num; i++) {
            for(int j=0; j<num; j++) {
                System.out.print((count % 9) + 1 + " ");
                count++;
            }
            System.out.print("\n");
        }
    }
}