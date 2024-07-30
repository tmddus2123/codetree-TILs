import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        
        String str = sc.next();
        
        String[] arr = new String[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.next();
        }
        Arrays.sort(arr);

        int result = 0;
        for(int i=0; i<n; i++) {
            if(arr[i].indexOf(str) > -1) {
                result++;
            }

            if(result == k) {
                System.out.print(arr[i]);
                break;
            }
        }
    }
}