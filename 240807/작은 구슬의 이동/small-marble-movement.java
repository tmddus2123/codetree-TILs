import java.util.*;

public class Main {

    public static int[] dx = new int[]{1, 0, -1, 0};
    public static int[] dy = new int[]{0, 1, 0, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int time = sc.nextInt();

        int r = sc.nextInt();
        int c = sc.nextInt();
        String d = sc.next();

        int dir = 2;
        if(d.equals("R")) {
            dir = 1;
        } else if(d.equals("D")) {
            dir = 0;
        } else if(d.equals("L")) {
            dir = 3;
        }

        int nx = r;
        int ny = c;
        for(int i=0; i<time; i++) {
            r += dx[dir];
            c += dy[dir];

            if(r < 1 || r > num || c < 1 || c > num) {
                dir = (dir + 2) % 4;
                r = nx;
                c = ny;
            } else {
                nx = r;
                ny = c;
            }
        }
        System.out.print(nx + " " + ny);

    }
}