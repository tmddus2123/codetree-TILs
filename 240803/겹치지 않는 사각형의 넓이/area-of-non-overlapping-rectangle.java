import java.util.*;

public class Main {
    
    public static int[][] rect = new int[2001][2001];
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        for(int n=0; n<2; n++) {
            int x1 = sc.nextInt() + 1000;
            int y1 = sc.nextInt() + 1000;
            int x2 = sc.nextInt() + 1000;
            int y2 = sc.nextInt() + 1000;

            for(int i=x1; i<x2; i++) {
                for(int j=y1; j<y2; j++) {
                    rect[i][j] = 1;
                }
            }
        }

        int x1 = sc.nextInt() + 1000;
        int y1 = sc.nextInt() + 1000;
        int x2 = sc.nextInt() + 1000;
        int y2 = sc.nextInt() + 1000;

        for(int i=x1; i<x2; i++) {
            for(int j=y1; j<y2; j++) {
                rect[i][j] = 0;
            }
        }

        int sum = 0;
        for(int i=0; i<2001; i++) {
            for(int j=0; j<2001; j++) {
                sum += rect[i][j];
            }
        }
        System.out.print(sum);
    }
}