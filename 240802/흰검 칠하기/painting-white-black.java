import java.util.*;

public class Main {

    public static int[] tile = new int[200001];
    public static int[] color = new int[200001];

    public static final String BLACK = "-1";
    public static final String WHITE = "1";
    public static final String GRAY = "0";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int standard = 100000;
        int min = standard;
        int max = standard;


        for(int i=0; i<num; i++) {
            int x = sc.nextInt() - 1;
            String dir = sc.next();

            if(dir.equals("L")) {
                min = Math.min(min, standard - x);

                for(int j=standard-x; j<=standard; j++) {
                    if(color[j] == 1) {
                        continue;
                    }
                    tile[j]++;
                    color[j] = 1;
                }
                standard -= x;
            } else if(dir.equals("R")) {
                max = Math.max(max, standard + x);

                for(int j=standard; j<=standard+x; j++) {
                    if(color[j] == -1) {
                        continue;
                    }
                    tile[j]++;
                    color[j] = -1;
                }
                standard += x;
            }
        }

        int b=0, w=0, g=0;
        for(int i=min; i<=max; i++) {
            if(tile[i] >= 4) {
                g++;
            } else {
                if(color[i] == 1) {
                    w++;
                } else if(color[i] == -1) {
                    b++;
                }
            }
        }
        System.out.print(w + " " + b + " " + g);
    }
}