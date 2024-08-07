import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i=0; i<num; i++) {
            arr[i] = sc.nextInt();      
        }

        int min = 10000;
        for(int i=0; i<num; i++) {
            int dis = 0;
            for(int j=0; j<num; j++) {

                // i 번째 집으로 모이기
                dis += Math.abs(i - j) * arr[j];
            }
            min = Math.min(min, dis);
        }
        System.out.print(min);
    }
}