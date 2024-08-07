import java.util.*;

public class Main {

    public static int[] dx = {1, 0, -1, 0};
    public static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[][] map = new int[2001][2001];

        int x = 1000;
        int y = 1000;
        map[x][y] = -1;
        
        int count = 1;
        int result = -1;

        for(int i=1; i<=num; i++) {
            String dir = sc.next();
            int dis = sc.nextInt();

            int d = 0;
            if(dir.equals("E")) {
                d = 0;
            } else if(dir.equals("N")) {
                d = 1;
            } else if(dir.equals("W")) {
                d = 2;
            } else {
                d = 3;
            }

            for(int j=0; j<dis; j++) {
                x += dx[d];
                y += dy[d];

                if(map[x][y] == -1 && result == -1) {
                    result = count;
                    break;
                }
                map[x][y] = count;
                count++;
            }
        }

        System.out.print(result);
    }
}