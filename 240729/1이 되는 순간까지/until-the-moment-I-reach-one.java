import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.print(recur(num));
    }
    public static int recur(int n) {
        if(n == 1) {
            return 0;
        }

        if(n % 2 == 0) {
            return 1 + recur(n/2);
        } else {
            return 1 + recur(n/3);
        }
    }
}