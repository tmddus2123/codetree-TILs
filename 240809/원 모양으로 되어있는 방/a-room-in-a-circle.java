import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] room = new int[num];

        for(int i=0; i<num; i++) {
            room[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        for(int i=0; i<num; i++) { // 시작점

            int sum = 0;
            for(int j=0; j<num; j++) {
                int n = (i + j) % num;
                sum += room[n] * j;
            }
            min = Math.min(min, sum);
        }
        System.out.print(min);
    }
}