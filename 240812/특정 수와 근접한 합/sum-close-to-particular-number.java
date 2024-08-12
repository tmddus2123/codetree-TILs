import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int s = sc.nextInt();

        int[] arr = new int[n];
        int sum = 0;
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        int min = sum; 
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                min = Math.min(min, Math.abs(s - (sum - (arr[i] + arr[j]))));       
            }
        }
        System.out.print(min);
    }
}