import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] arr = new int[101];

        for(int i=0; i<num; i++) {
            int n = sc.nextInt();
            String str = sc.next();

            int a = (str.equals("G")) ? 1 : 2;
            arr[n] = a;
        }

        int max = 0;
        for(int i=1; i<101; i++) {

            int g = 0, h = 0;
            for(int j=i; j<101; j++) {
                if(arr[j] != 0) {
                    if(arr[j] == 1) {
                        g++;
                    } else {
                        h++;
                    }
                    if(g == h || (g == 0 && h >= 2) || (g >= 2 && h == 0)) {
                        max = Math.max(max, j - i - 1);
                    }
                }

            }
        }
        System.out.print(max);
    }
}