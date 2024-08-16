import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        int total = 0;
        for(int i=0; i<5; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }

        int diff = total;
        boolean result = false;
        for(int i=0; i<4; i++) {
            for(int j=i+1; j<5; j++) {
                for(int k=0; k<4; k++) {
                    for(int l=k+1; l<5; l++) {
                        if(i == k || i == l || j == k || j == l) {
                            continue;
                        }
                        int sum1 = arr[i] + arr[j];
                        int sum2 = arr[k] + arr[l];
                        int sum3 = total - sum1 - sum2;

                        if(sum1 == sum2 || sum1 == sum3 || sum2 == sum3) {
                            continue;
                        }
                        //System.out.println("sum1 : " + sum1 + " sum2 : " + sum2 + " sum3 : " + sum3);

                        int max = Math.max(sum1, Math.max(sum2, sum3));
                        int min = Math.min(sum1, Math.min(sum2, sum3));

                        if(diff > max - min) {
                            result = true;
                            diff = max-min;
                        }
                    }
                }
            }
        }
        if(result) {
            System.out.print(diff);
        } else {
            System.out.print(-1);
        }
    }
}