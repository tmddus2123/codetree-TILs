import java.util.*;

public class Main {
    public static int[] arrA = new int[1000001];
    public static int[] arrB = new int[1000001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int time = 1;
        for(int i=0; i<n; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();

            while(t-- > 0) {
                arrA[time] = arrA[time-1] + v;
                time++;
            }
        }

        time = 1;
        for(int i=0; i<m; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();

            while(t-- > 0) {
                arrB[time] = arrB[time-1] + v;
                time++;
            }
        }

        String head = (arrA[1] > arrB[1]) ? "A" : "B";
        int count = 1;
        for(int i=2; i<time; i++) {
            if(arrA[i] == arrB[i] && !head.equals("AB")) {
                count++;
                head = "AB";
            } else if(arrA[i] > arrB[i] && !head.equals("A")) {
                count++;
                head = "A";
            } else if(arrA[i] < arrB[i] && !head.equals("B")) {
                count++;
                head = "B";
            }
        }
        System.out.print(count);
    }
}