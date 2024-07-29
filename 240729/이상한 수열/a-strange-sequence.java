import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.print(recur(num));
    }

    public static int recur(int n) {
        if(n <= 2) {
            return n;
        }

        return recur(n/3) + recur(n-1);
    }
}