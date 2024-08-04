import java.util.*;

public class Main {

    public static int[] arr1 = new int[1001];
    public static int[] arr2 = new int[1001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int total1 = 0;
        int time = 0;
        int pos = 0;
        for(int i=0; i<n; i++) {
            String dir = sc.next();
            int t = sc.nextInt();
            total1 += t;

            if(dir.equals("L")) {
                while(t > 0) {
                    arr1[time++] = pos--;
                    t--;
                }
            } else {
                while(t > 0) {
                    arr1[time++] = pos++;
                    t--;
                }
            }
            
        }

        int total2 = 0;
        time = 0;
        pos = 0;
        for(int i=0; i<m; i++) {
            String dir = sc.next();
            int t = sc.nextInt();
            total2 += t;

            if(dir.equals("L")) {
                while(t > 0) {
                    arr2[time++] = pos--;
                    t--;
                }
            } else {
                while(t > 0) {
                    arr2[time++] = pos++;
                    t--;
                }
            }
            
        }

        int result = -1;

        for(int i=1; i<Math.max(total1, total2); i++) {
            if(arr1[i] == arr2[i]) {
                result = i;
                break;
            }
        }
        System.out.print(result);
    }
}