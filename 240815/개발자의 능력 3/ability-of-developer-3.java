import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[6];

        int total = 0;
        for(int i=0; i<6; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }

        int diff = Integer.MAX_VALUE;
        for(int i=0; i<4; i++) {
            for(int j=i+1; j<5; j++) {
                for(int k=j+1; k<6; k++) {
                    int sum2 = arr[i] + arr[j] + arr[k];
                    int sum1 = total - sum2;
                    if(diff > Math.abs(sum1-sum2)) {
                        diff = Math.abs(sum1-sum2);
                    }
                }
            }
        }
        System.out.print(diff);
    }
}