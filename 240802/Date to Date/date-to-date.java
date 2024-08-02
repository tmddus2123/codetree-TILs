import java.util.*;

public class Main {

    public static int[] endDay = new int[]{
        31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();

        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        for(int i=0; i<m1; i++) {
            d1 += endDay[i];
        }

        for(int i=0; i<m2; i++) {
            d2 += endDay[i];
        }

        System.out.print(d2 - d1);
    }
}