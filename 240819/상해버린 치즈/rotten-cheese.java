import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 사람 수
        int M = sc.nextInt(); // 치즈 수
        int D = sc.nextInt(); // 치즈 먹은 기록 수
        int S = sc.nextInt(); // 아픈 기록 수

        int[][] arr = new int[N+1][M+1];

        for(int i=0; i<D; i++) {
            int p = sc.nextInt(); // n번째 사람
            int m = sc.nextInt(); // m번째 치즈
            int t = sc.nextInt(); // t초에 먹음

            arr[p][m] = t;

        }


        
        int[] result = new int[N+1];

        int[] cheese = new int[M+1];


        int max = 0;
        for(int i=0; i<S; i++) {
            int p = sc.nextInt(); // p번째 사람
            int t = sc.nextInt(); // t초에 아픔

            // 배아픈 사람들이 먹은 치즈를 구해야함
            for(int j=1; j<=M; j++) {
                if(arr[p][j] != 0 && arr[p][j] < t) {
                    cheese[j]++;
                    max = Math.max(max, cheese[j]);
                }
            }
        }
        // 썩은 치즈 누가 먹었는지
        for(int i=1; i<=N; i++) {
            for(int j=1; j<=M; j++) {
                if(cheese[j] == max && arr[i][j] != 0) { // 썩은 치즈
                    result[i]++;
                }
            }
        }

        int count = 0;
        for(int i=1; i<=N; i++) {
            if(result[i] > 0) {
                count++;
            }
        }
        System.out.print(count);
    }
}