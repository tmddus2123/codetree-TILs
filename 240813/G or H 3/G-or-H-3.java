import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        String[] arr = new String[10001];

        for(int i=0; i<n; i++) {
            int pos = sc.nextInt();
            arr[pos] = sc.next();
        }

        int max = 0;

        for(int i=1; i<10001 - k; i++) {
            int count = 0;
            for(int j=i; j<=i+k; j++) {
                if(arr[j] == null) {
                    continue;
                } else if(arr[j].equals("G")) {
                    count += 1;
                } else if(arr[j].equals("H")) {
                    count += 2;
                }
            }
            max = Math.max(max, count);
        }
        System.out.print(max);
    }
}