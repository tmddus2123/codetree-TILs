import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int[] x = new int[101];
        int[] y = new int[101];

        for(int i=0; i<num; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        int  min = 0;
        int distance = 0;
        for(int i=1; i<num; i++) {
            distance = distance + Math.abs(x[i-1] - x[i]) + Math.abs(y[i-1] + y[i]);
        }

        min = distance;
        for(int i=1; i<num-1; i++) {
            int[] copyx = x.clone();
            int[] copyy = y.clone();

            copyx[i] = copyx[i-1];
            copyy[i] = copyy[i-1];

            distance = 0;
            for(int j=1; j<num; j++) {
                //System.out.println(copyx[j] + " " + copyy[j]);
                distance = distance + Math.abs(copyx[j-1] - copyx[j]) + Math.abs(copyy[j-1] + copyy[j]); 
            }
            min = Math.min(min, distance);
        }
        System.out.print(min);
    }
}