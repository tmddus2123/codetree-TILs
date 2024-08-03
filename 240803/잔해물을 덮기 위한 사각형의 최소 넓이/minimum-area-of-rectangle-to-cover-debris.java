import java.util.*;

public class Main {

    public static int rect[][] = new int[2001][2001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int n=0; n<2; n++) {

            int x1 = sc.nextInt() + 1000;
            int y1 = sc.nextInt() + 1000;
            int x2 = sc.nextInt() + 1000;
            int y2 = sc.nextInt() + 1000;

            int a = (n == 0) ? 1 : 0;

            for(int i=x1; i<x2; i++) {
                for(int j=y1; j<y2; j++) {
                    rect[i][j] = a;
                }
            }
        }
        int sum = 0;
        int minx = 2000;
        int maxx = 0;
        int miny = 2000;
        int maxy = 0;
        for(int i=0; i<2001; i++) {
            for(int j=0; j<2001; j++) {
                if(rect[i][j] == 1) {
                    sum++;
                    if(maxx < i) {
                        maxx = i;
                    }

                    if(minx > i) {
                        minx = i;
                    }

                    if(maxy < j) {
                        maxy = j;
                    }

                    if(miny > j) {
                        miny = j;
                    }
                }
            }
        }
        if(sum == 0) {
            System.out.print(0);
        } else {
            System.out.print((maxx - minx + 1) * (maxy - miny + 1));
        }
    }
}