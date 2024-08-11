import java.util.*;

public class Main {

    // 8방향을 위한 dx, dy 배열
    public static int[] dx = {1, 1, 1, 0, -1, -1, -1, 0};
    public static int[] dy = {1, 0, -1, -1, -1, 0, 1, 1};

    public static int n, m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        String[] arr = new String[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.next();
        }

        int count = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {

                // 현재 위치가 'L'이 아닌 경우 건너뜀
                if(arr[i].charAt(j) != 'L') {
                    continue;
                }

                // 8방향으로 탐색
                for(int l = 0; l<8; l++) {
                    int x = i;
                    int y = j;
                    boolean found = true;

                    for(int step = 1; step < 3; step++) {
                        x += dx[l];
                        y += dy[l];

                        // 다음 위치가 범위를 벗어나거나 'E'가 아닐 경우
                        if(!isRange(x, y) || arr[x].charAt(y) != 'E') {
                            found = false;
                            break;
                        }
                    }

                    if(found) {
                        count++;
                    }
                }
            }
        }
        System.out.print(count);
    }

    // x, y가 범위 내에 있는지 확인하는 함수
    public static boolean isRange(int x, int y) {
        return x >= 0 && x < n && y >= 0 && y < m;
    }
}