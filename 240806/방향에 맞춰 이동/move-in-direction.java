import java.util.*;

public class Main {
    public static int[] dx = new int[]{1, 0, -1, 0};
    public static int[] dy = new int[]{0, 1, 0, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int nx = 0, ny = 0;

        for(int i=0; i<num; i++) {
            String dir = sc.next();
            int dis = sc.nextInt();

            if(dir.equals("E")) {
                nx = nx + dx[0] * dis;
            } else if(dir.equals("N")) {
                ny = ny + dy[1] * dis;
            } else if(dir.equals("W")) {
                nx = nx + dx[2] * dis;
            } else {
                ny = ny + dy[3] * dis;
            }
        }
        System.out.print(nx + " " + ny);
    }
}