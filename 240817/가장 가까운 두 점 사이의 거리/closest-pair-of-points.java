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

        int min = Integer.MAX_VALUE;
        for(int i=0; i<num; i++) {
            for(int j=i+1; j<num; j++) {
                int distance = (x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]);
                if(min > distance) {
                    min = distance;
                }

            }
        }
        System.out.print(min);
    }
}