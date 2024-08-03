import java.util.*;

public class Main {

    public static int[][] rect = new int[201][201];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int n=0; n<num; n++) {
            int x1 = sc.nextInt() + 100;
            int y1 = sc.nextInt() + 100;
            int x2 = sc.nextInt() + 100;
            int y2 = sc.nextInt() + 100;

            int color = (n == 0) ? 1 : 2;

            for(int i=x1; i<x2; i++) {
                for(int j=y1; j<y2; j++) {
                    rect[i][j] = color;
                }
            }
        }
        int count = 0;

        for(int i=0; i<201; i++) {
            for(int j=0; j<201; j++) {
                if(rect[i][j] == 2) {
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}