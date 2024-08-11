import java.util.*;

public class Main {

    public static int[] dx = {1, 1, 1, 0, -1, -1, -1, 0};
    public static int[] dy = {1, 0, -1, -1, -1, 0, 1, 1};

    public static int n, m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        String[][] arr = new String[n][m];

        for(int i=0; i<n; i++) {
            arr[i] = sc.next().split("");
        }

        int count = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {

                if(!arr[i][j].equals("L")) {
                    continue;
                }


                for(int l = 0; l<8; l++) {
                    int result = 0;
                    int x = i, y = j; 

                    while(true) {
                        x += dx[l];
                        y += dy[l];
                        if(isRange(x, y) && arr[x][y].equals("E")) {
                            result++;
                        } else {
                            break;
                        }
                    }
                    if(result == 2){
                        count++;
                    }
                }
            }
        }
        System.out.print(count);
    
    }
    public static boolean isRange(int x, int y) {
        return x >= 0 && x < n && y >= 0 && y < m;
    }
}