// https://www.codetree.ai/training-field/search/problems/vegetables-growing-in-the-field?&utm_source=clipboard&utm_medium=text
import java.util.*;

public class Main {
    public static int[] dx = {1, -1, 0, 0};
    public static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] x = new int[6];
        int[] y = new int[6];

        int a = 0, b = 0;

        for(int i=0; i<6; i++) {
            int dir = sc.nextInt();
            int distance = sc.nextInt();

            a = a + dx[dir - 1] * distance;
            b = b + dy[dir - 1] * distance;

            x[i] = a;
            y[i] = b;
        }
        int area = 0;
        for(int i=0; i<5; i++) {
            area += x[i] * y[i+1] - y[i] * x[i+1];
        }
        area += x[5] * y[0] + y[5] * x[0];

        System.out.println(Math.abs(area) / 2 * num);
    }
}
