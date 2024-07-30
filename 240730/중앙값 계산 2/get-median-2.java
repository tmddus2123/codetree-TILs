import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        Integer[] arr = new Integer[num];

        for(int i=0; i<num; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<num; i+=2) {
            Integer[] arr2 = new Integer[i + 1];

            for(int j=0; j<=i; j++) {
                arr2[j] = arr[j];
            }
            Arrays.sort(arr2);
            System.out.print(arr2[i/2] + " ");
        }
    }
}