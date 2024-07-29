import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = sc.nextInt();
        sum *= sc.nextInt();
        sum *= sc.nextInt();

        System.out.print(recur(sum));
    }

    public static int recur(int n) {
        if(n < 10) {
            return n;
        }

        return (n%10) + recur(n/10);
    }
}