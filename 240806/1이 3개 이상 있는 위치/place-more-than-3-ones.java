import java.util.*;

public class Main {

    public static int[] dx = new int[]{1, 0, -1, 0};
    public static int[] dy = new int[]{0, 1, 0, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[][] arr = new int[num][num];

        for(int i=0; i<num; i++) {
            for(int j=0; j<num; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int result = 0;
        for(int i=0; i<num; i++) {

            for(int j=0; j<num; j++) {
                int count = 0;
                for(int d=0; d<4; d++) {
                    int nx = i + dx[d];
                    int ny = j + dy[d];

                    if(nx >= 0 && nx < num && ny >= 0 && ny < num && arr[nx][ny] == 1) {
                        count++;
                    }
                }

                if(count >= 3) {
                    result++;
                }
            }
        }
        System.out.print(result);
    }
}