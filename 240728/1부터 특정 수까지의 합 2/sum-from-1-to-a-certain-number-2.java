import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.print(sum(num));
    }

    public static int sum(int n) {
        if(n == 1) {
            return 1;
        }
        return n + sum(n-1);
    }
}