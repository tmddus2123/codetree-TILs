import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] a = new int[num];
        int[] b = new int[num];
        
        for(int i=0; i<num; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        int total = 0;
        for(int i=0; i<num; i++) {
            int count = 0;
            int[] time = new int[1001];
            for(int j=0; j<num; j++) {
                if(i == j) {
                    continue;
                }

                for(int k=a[j]; k<b[j]; k++) {
                     time[k]++;
                }
            }
            for(int j=1; j<1001; j++) {
                if(time[j] >= 1) {
                    count++;
                }
            }
            total = Math.max(total, count);
        }
        System.out.print(total);
    }
}