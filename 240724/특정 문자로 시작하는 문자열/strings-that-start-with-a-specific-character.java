import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];

        for(int i=0; i<n; i++) {
            String str = sc.next();
            arr[i] = str;
        }

        char ch = sc.next().charAt(0);
        int count = 0;
        int length = 0;

        for(int i=0; i<n; i++) {
            if(arr[i].charAt(0) == ch) {
                count++;
                length += arr[i].length();
            }
        }

        System.out.printf("%d %.2f", count, (double) length/count);
    }
}