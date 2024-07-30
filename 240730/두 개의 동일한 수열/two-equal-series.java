import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        Integer[] arr1 = new Integer[num];
        Integer[] arr2 = new Integer[num];

        for(int i=0; i<num; i++) {
            arr1[i] = sc.nextInt();
        }

        for(int i=0; i<num; i++) {
            arr2[i] = sc.nextInt();
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        String result = "Yes";
        for(int i=0; i<num; i++) {
            if(arr1[i] != arr2[i]) {
                result = "No";
            }
        }
        System.out.print(result);
    }
}