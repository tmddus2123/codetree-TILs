import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] arr = new int[num];

        for(int i=0; i<num; i++) {
            arr[i] = sc.nextInt();
        }

        int stand = arr[0];
        int max = 1;
        int count = 1;
        for(int i=1; i<num; i++) {
            if(arr[i-1] == arr[i]) {
                count++;
            } else {
                if(max < count) {
                    max = count;
                }
                count = 1;
            }
        }
        System.out.print(max);
    }
}