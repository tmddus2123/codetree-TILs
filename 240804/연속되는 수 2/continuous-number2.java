import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] arr = new int[num];

        for(int i=0; i<num; i++) {
            arr[i] = sc.nextInt();
        }

        int max = 1;
        int count = 1;
        for(int i=1; i<num; i++) {
            if(arr[i-1] == arr[i]) {
                count++;
            } else {
                count = 1;
            }

            if(max < count) {
                max = count;
            }
        }
        System.out.print(max);
    }
}