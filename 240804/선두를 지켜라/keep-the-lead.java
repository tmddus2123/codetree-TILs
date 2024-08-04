import java.util.*;

public class Main {

    public static int[] arrA = new int[1000001];
    public static int[] arrB = new int[1000001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int time = 0;

        for(int i=0; i<n; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();

            while(t-- > 0) {
                arrA[time++] = v;
            }
        }

        time = 0;
        for(int i=0; i<m; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();

            while(t-- > 0) {
                arrB[time++] = v;
            }
        }

        String head = (arrA[0] > arrB[0]) ? "A" : "B";
        int count = 0;
        for(int i=0; i<time; i++) {
            if(head.equals("A")) {
                if(arrA[i] < arrB[i]) {
                    head = "B";
                    count++;
                }
            } else {
                if(arrA[i] > arrB[i]) {
                    head = "A";
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}