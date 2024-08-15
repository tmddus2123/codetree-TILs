import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] key1 = new int[3];
        int[] key2 = new int[3];

        for(int i=0; i<3; i++) {
            key1[i] = sc.nextInt();
        }

        for(int i=0; i<3; i++) {
            key2[i] = sc.nextInt();
        }

        int count = 0;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                for(int k=1; k<=n; k++) {
                    int a1 = key1[0];
                    int a2 = key2[0];
                    int b1 = key1[1];
                    int b2 = key2[1];
                    int c1 = key1[2];
                    int c2 = key2[2];
                    
                    int dist1_a = Math.min(Math.abs(i - a1), n - Math.abs(i - a1));
                    int dist1_b = Math.min(Math.abs(j - b1), n - Math.abs(j - b1));
                    int dist1_c = Math.min(Math.abs(k - c1), n - Math.abs(k - c1));

                    int dist2_a = Math.min(Math.abs(i - a2), n - Math.abs(i - a2));
                    int dist2_b = Math.min(Math.abs(j - b2), n - Math.abs(j - b2));
                    int dist2_c = Math.min(Math.abs(k - c2), n - Math.abs(k - c2));

                    if (dist1_a <= 2 && dist1_b <= 2 && dist1_c <= 2) {
                        count++;
                    } else if (dist2_a <= 2 && dist2_b <= 2 && dist2_c <= 2) {
                        count++;
                    }
                }
            }
        }
        System.out.print(count);
    }
}