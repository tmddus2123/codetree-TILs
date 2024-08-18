import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int[] x = new int[20001];
        int[] y = new int[20001];
        for(int i=0; i<num; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        int width = 0;
        int height = 0;
        for(int i=0; i<num; i++) {
            for(int j=0; j<num; j++) {
                if(i == j) {
                    continue;
                }

                if(x[i] == x[j]) { // y축 평행
                    height = Math.max(height,  Math.abs(y[i] - y[j]));
                }

                if(y[i] == y[j]) { // x축 평행
                    width = Math.max(width, Math.abs(x[i] - x[j]));
                }
            }
        }
        System.out.print(width * height);
    }
}