import java.util.*;

public class Main {

    public static int[] tile = new int[200001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int cur = 100000;
        
        for(int i=0; i<num; i++) {
            int x = sc.nextInt();
            String dir = sc.next();

            if(dir.equals("R")) {
                for(int j=0; j<x; j++) {
                    tile[cur] = 1;
                    if(j != x-1) {
                        cur++;
                    }
                }
            } else if(dir.equals("L")) {
                for(int j=0; j<x; j++) {
                    tile[cur] = -1;
                    if(j != x-1) {
                        cur--;
                    }
                }
            }
        }
        int b = 0, w = 0;
        for(int i=0 ; i<200001; i++) {
            if(tile[i] == 1) {
                b++;
            } else if(tile[i] == -1) {
                w++;
            }
        }
        System.out.print(w + " " + b);
    }
}