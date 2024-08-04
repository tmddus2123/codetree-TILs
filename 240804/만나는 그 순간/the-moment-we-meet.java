import java.util.*;

public class Main {

    public static int[] arr1 = new int[1000001];
    public static int[] arr2 = new int[1000001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int time = 1;
        for(int i=0; i<n; i++) {
            String dir = sc.next();
            int t = sc.nextInt();

            while(t-- > 0) {
                if(dir.equals("R")) {
                    arr1[time] = arr1[time - 1] + 1;
                } else {
                    arr1[time] = arr1[time - 1] - 1;
                }
                time++;
            }
            
        }

        time = 1;
        for(int i=0; i<m; i++) {
            String dir = sc.next();
            int t = sc.nextInt();

            while(t-- > 0) {
                if(dir.equals("R")) {
                    arr2[time] = arr2[time - 1] + 1;
                } else {
                    arr2[time] = arr2[time - 1] - 1;
                }
                time++;
            }
            
        }

        int result = -1;

        for(int i=1; i<time; i++) {
            if(arr1[i] == arr2[i]) {
                result = i;
                break;
            }
        }
        System.out.print(result);
    }
}