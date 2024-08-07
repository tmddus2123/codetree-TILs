import java.util.*;

public class Main {

    static int n;
    static int m;
    static int[][] arr;

    static int r = 0; //행값
    static int c = 0; //열값
    static int d = 1; //방향값 초기값 오른쪽

    static final int[] dx = new int[]{-1, 0, 1, 0};
    static final int[] dy = new int[]{0, 1, 0, -1};

    //범위안에 있나?
    static boolean inRange(){
        if((r + dx[d] >= 0 && r + dx[d] < n) && (c + dy[d] >= 0 && c + dy[d] < m)){
            return true;
        }
        return false;
    }

    //이미 지나갔던곳이 아닌가? = 다음칸이 0인가?
    static boolean isPossible(){
        return arr[r + dx[d]][c + dy[d]] == 0;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt(); //행
        m = sc.nextInt(); //열
        arr = new int[n][m];

        arr[r][c] = 1;
        for(int i = 2; i <= n * m; i++){
            if(inRange() && isPossible()){
                r += dx[d];
                c += dy[d];
                arr[r][c] = i;
            }else{
                d = (d + 1) % 4;
                if(inRange() && isPossible()){
                    r += dx[d];
                    c += dy[d];
                    arr[r][c] = i;
                }
            }
        }

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }
}