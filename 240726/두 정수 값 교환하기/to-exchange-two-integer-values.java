import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int [2];
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();

        swap(arr);
        System.out.print(arr[0] + " " + arr[1]);
    }

    public static void swap(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }
}