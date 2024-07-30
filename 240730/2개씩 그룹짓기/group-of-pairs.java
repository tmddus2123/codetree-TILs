import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        Integer[] arr = new Integer[num*2];

        for(int i=0; i<num*2; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int max = 0;
        for(int i=0; i<num; i++) {
            max = Math.max(max, arr[i] + arr[num*2 - 1]);
        }

        System.out.print(max);
    }
}