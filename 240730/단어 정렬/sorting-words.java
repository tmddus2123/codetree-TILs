import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        String[] arr = new String[num];
        for(int i=0 ;i<num; i++) {
            arr[i] = sc.next();
        }
        Arrays.sort(arr);

        for(int i=0; i<num; i++) {
            System.out.println(arr[i]);
        }
    }
}