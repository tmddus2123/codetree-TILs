import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] x = new int[num];
        int[] y = new int[num];
        for(int i=0; i<num; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        
        int extent = Integer.MAX_VALUE;
        for(int i=0; i<num; i++) {
            int maxx = 0;
            int minx = Integer.MAX_VALUE;
            int maxy = 0; 
            int miny = Integer.MAX_VALUE;
            for(int j=0; j<num; j++) {
                if(i == j) {
                    continue;
                }
                maxx = Math.max(maxx, x[j]);
                minx = Math.min(minx, x[j]);
                maxy = Math.max(maxy, y[j]);
                miny = Math.min(miny, y[j]);

            }
            extent = Math.min(extent, (maxx - minx) * (maxy - miny));
        }
        System.out.print(extent);
    }
}