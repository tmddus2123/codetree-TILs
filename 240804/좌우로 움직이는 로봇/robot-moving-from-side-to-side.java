import java.util.*;

public class Main {
    public static int[] robotA = new int[2000001];
    public static int[] robotB = new int[2000001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int posA = 1;
        for(int i=0; i<n; i++) {
            int time = sc.nextInt();
            String dir = sc.next();

            while(time-- > 0) {
                if(dir.equals("L")) {
                    robotA[posA] = robotA[posA - 1] - 1;
                } else {
                    robotA[posA] = robotA[posA - 1] + 1;
                }
                posA++;
            }
        }
        int posB = 1;
        for(int i=0; i<m; i++) {
            int time = sc.nextInt();
            String dir = sc.next();

            while(time-- > 0) {
                if(dir.equals("L")) {
                    robotB[posB] = robotB[posB - 1] - 1;
                } else {
                    robotB[posB] = robotB[posB - 1] + 1;
                }
                posB++;
            }
        }

        int max = Math.max(posA, posB);
        int min = Math.min(posA, posB);

        if(posA > posB) {
            for(int i=min; i<max; i++) {
                robotB[i] = robotB[i-1];
            }
        } else {
            for(int i=min; i<max; i++) {
                robotA[i] = robotA[i-1];
            }
        }

        int count = 0;
        for(int i=2; i<max; i++) {
            if(robotA[i - 1] != robotB[i - 1]  && robotA[i] == robotB[i]) {
                count++;
            }
        }
        System.out.print(count);
    }
}