import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = 0;
        for(int i=a; i<=b; i++) {
            if(is369Number(i)) {
                result++;
            }
        }
        System.out.print(result);
    }

    public static boolean is369Number(int n) {
        return (n % 3 == 0 || is369(n));
    }

    public static boolean is369(int n) {
        while(n >= 1) {
            if(n % 10 == 3 || n % 10 == 6 || n % 10 == 9) {
                return true;
            }
            n /= 10;
        }
        return false;
    }
}