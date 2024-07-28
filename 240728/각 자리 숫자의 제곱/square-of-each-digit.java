import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.print(recur(num));
    }

    public static int recur(int n) {
        if(n < 10) {
            return n*n;
        }

        return recur(n/10) + (n%10) * (n%10);
    }
}