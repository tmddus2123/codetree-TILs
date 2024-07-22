import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] remain = new int[b];

        while(a > 1) {
            remain[a % b]++;
            a /= b;
        }

        int total = 0;
        for(int i=0; i<b; i++) {
            if(remain[i] != 0) {
                total += (remain[i] * remain[i]);
            }
        }

        System.out.print(total);
    }
}