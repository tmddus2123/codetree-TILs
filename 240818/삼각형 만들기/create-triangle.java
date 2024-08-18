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

        int result = 0;
        for(int i=0; i<num; i++) {
            for(int j=i+1; j<num; j++) {
                for(int k=j+1; k<num; k++) {
                    if(x[i] != x[j] && x[i] != x[k] && x[j] != x[k]) {
                        continue;
                    }

                    if(y[i] != y[j] && y[i] != y[k] && y[j] != y[k]) {
                        continue;
                    }

                    int area = (x[i]*y[j] + x[j]*y[k] + x[k]*y[i]) - (x[j]*y[i] + x[k]*y[j] + x[i]*y[k]);
                    result = Math.max(result, Math.abs(area));
                }

            }
        }
        System.out.print(result);
    }
}