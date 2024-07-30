import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        Integer[] arr = new Integer[num];
        for(int i=0; i<num; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0; i<num; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
        Arrays.sort(arr, Collections.reverseOrder());
        for(int i=0; i<num; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}