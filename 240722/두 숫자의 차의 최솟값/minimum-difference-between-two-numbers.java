import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];

        for(int i=0; i<num; i++) {
            arr[i] = sc.nextInt();
        }

        int min = 100;
        for(int i=1; i<num; i++) {
            if(min > arr[i] - arr[i-1]) {
                min = arr[i] - arr[i-1];
            }
        }
        System.out.print(min);
    }
}