import java.util.*;

public class Main {

    public static int[] dx = new int[]{1, 0, -1, 0};
    public static int[] dy = new int[]{0, 1, 0, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] order = sc.next().split("");

        int dir = 1;
        int nx = 0, ny = 0;
        for(int i=0; i<order.length; i++) {
            if(order[i].equals("L")) {
                dir = (dir + 1) % 4;
            } else if(order[i].equals("R")) {
                dir = (dir + 3) % 4;
            } else { //F
                nx += dx[dir];
                ny += dy[dir];
            }
        }

        System.out.print(nx + " " + ny);
    }
}