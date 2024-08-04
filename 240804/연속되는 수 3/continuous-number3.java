import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int prev = sc.nextInt();
        int count = 1, max = 1;
        for(int i=1; i<num; i++) {
            int cur = sc.nextInt();

            if(prev < 0 && cur < 0 || prev > 0 && cur > 0) {
                count++;
            } else {
                count = 1;
            }

            if(max < count) {
                max = count;
            }

            prev = cur;
        }

        System.out.print(max);
    }
}