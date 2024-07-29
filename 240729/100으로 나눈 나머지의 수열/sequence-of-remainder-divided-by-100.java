import java.util.*;

public class Main {
    public static int[] arr = new int[20];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        arr[1] = 2;
        arr[2] = 4;

        System.out.print(recur(num));
    }
    public static int recur(int n) {
        if(n <= 2) {
            return arr[n];
        }
        int k = recur(n-2) * recur(n-1) % 100;
        return k;
    }
}