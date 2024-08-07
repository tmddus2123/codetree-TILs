import java.util.*;

public class Main {

    public static int[] dx = new int[]{1, 0, -1, 0};
    public static int[] dy = new int[]{0, 1, 0, -1};

    static int n, m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        int[][] arr = new int[n][m];

        int x = 0, y = 0;
        int dir = 0;
        int count = 2;

        arr[0][0] = 1;


        while(count <= n * m) {
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if(!inRange(nx, ny) || arr[nx][ny] != 0) {
                dir = (dir + 1) % 4;
            }

            x += dx[dir];
            y += dy[dir];
            arr[x][y] = count;
            count++;
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }       
    }

    private static boolean inRange(int x, int y) {
        return (0 <= x && x < n && 0 <= y && y < m);
    }
}