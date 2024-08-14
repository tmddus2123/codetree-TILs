import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int t = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = Integer.MAX_VALUE;
        for(int i=0; i<n - t; i++) {

            int calc = 0;
            for(int j=i; j<i+t; j++) {
                calc += Math.abs(arr[j] - h);
            }
            if(count > calc) {
                count = calc;
            }
        }
        System.out.print(count);
    }
}