import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] bucket = new int[101];

        for(int i=0; i<n; i++) {
            int candy = sc.nextInt();
            int num = sc.nextInt();

            bucket[num] += candy;
        }

        int max = 0;
        for(int j=1; j<101; j++) {
            int sum = 0;
            for(int i=j; i<=j + 2*k; i++) {
                if(i < 101) {
                    sum += bucket[i];
                }
            }
            if(max < sum) {
                max = sum;
            }
        }

        System.out.print(max);

    }
}