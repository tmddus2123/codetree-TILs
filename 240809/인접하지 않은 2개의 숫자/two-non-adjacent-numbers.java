import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] arr = new int[num];
        for(int i=0; i<num; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0] + arr[2];
        for(int i=0; i<num - 2; i++) {
            for(int j=i + 2; i<num; i++) {
                max = Math.max(max, arr[i] + arr[j]);
            }
        }
        System.out.print(max);
    }
}