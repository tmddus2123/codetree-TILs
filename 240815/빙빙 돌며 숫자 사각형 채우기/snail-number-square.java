import java.util.*;

public class Main {
    
    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {1, 0, -1, 0};

    public static int n, m;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        int[][] arr = new int[n][m];
        arr[0][0] = 1;

        int x = 0, y = 0;
        int dir = 0;
        
        int num = 2;
        while(num <= n*m) {
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if(isRange(nx, ny) && arr[nx][ny] == 0) {
                arr[nx][ny] = num;
                num++;
                x = nx;
                y = ny;
            } else {
                dir = (dir+1) % 4;
            }
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public static boolean isRange(int x, int y) {
        return (0 <= x && x < n && 0 <= y && y < m);
    }
}