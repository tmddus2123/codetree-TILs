import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[2];
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();

        calc(arr);
        System.out.print(arr[0] + " " + arr[1]);
    }

    public static void calc(int[] arr) {
        if(arr[0] > arr[1]) {
            arr[0] += 25;
            arr[1] *= 2;
        } else {
            arr[0] *= 2;
            arr[1] += 25;
        }
    }
}