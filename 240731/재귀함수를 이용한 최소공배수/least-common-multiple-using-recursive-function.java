import java.util.*;

public class Main {
    public static int[] arr = new int[11];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i=1; i<=num; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print(getLCM(num));
    }

    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public static int gcd(int a, int b) {
        if(a % b == 0) {
            return b;
        }
        return gcd(b, a%b);
    }

    public static int getLCM(int n) {
        if(n == 1) {
            return arr[1];
        }

        return lcm(getLCM(n - 1), arr[n]);
    }
}