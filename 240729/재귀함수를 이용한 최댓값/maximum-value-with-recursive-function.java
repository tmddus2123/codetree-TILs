import java.util.*;

public class Main {
    public static int[] arr = new int[101];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i=1; i<=num; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print(recur(num));
    }

    public static int recur(int n) {
        if(n == 1) {
            return arr[n];
        }

        return Math.max(arr[n], recur(n-1));
    }
}