import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        recur1(num);
        System.out.print("\n");
        recur2(num);
    }

    public static void recur1(int n) {
        if(n == 0) {
            return;
        }

        recur1(n-1);
        System.out.print(n + " ");

    }

    public static void recur2(int n) {
        if(n == 0) {
            return;
        }

        System.out.print(n + " ");
        recur2(n-1);
    }
}