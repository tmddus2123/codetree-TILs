import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        printRec(num);
        System.out.print("\n");
        printRec(num);
    }

    public static void printRec(int num) {
        for(int i=0; i<num; i++) {

            for(int j=0; j<num; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}