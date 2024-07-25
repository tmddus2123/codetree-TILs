import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = 0;
        for(int i=a; i<=b; i++) {
            sum += isPrime(i);
        }
        System.out.print(sum);
    }
    public static int isPrime(int n) {
        if(n == 1) {
            return 0;
        }
        for(int i=2; i<=Math.sqrt(n); i++) {
            if(n % i == 0) {
                return 0;
            }
        }
        return n;
    }
}