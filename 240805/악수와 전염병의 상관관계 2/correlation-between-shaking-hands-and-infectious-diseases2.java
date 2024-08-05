import java.util.*;

public class Main {
    public static int[] timeA = new int[251];
    public static int[] timeB = new int[251];
    public static int[] infect = new int[101];
    public static boolean[] test = new boolean[101];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int K = sc.nextInt(); // K번만 전염
        int P = sc.nextInt(); // 첫 감염자
        int T = sc.nextInt();

        infect[P] = K;
        test[P] = true;

        for(int i=0; i<T; i++) {
            int t = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            timeA[t] = x;
            timeB[t] = y; 
        }


        for(int i=1; i<251; i++) {
            if(timeA[i] != 0) { //악수 진행
                //System.out.println(i + "초 A " + timeA[i] + " B " + timeB[i]);
                if(infect[timeA[i]] > 0 && infect[timeB[i]] > 0) { // 둘 다 감염
                    infect[timeA[i]]--;
                    infect[timeB[i]]--;
                } else if(infect[timeA[i]] > 0) { // 감염되었으면 감염 진행
                    infect[timeB[i]] = K;
                    test[timeB[i]] = true;
                    infect[timeA[i]]--;
                } else if(infect[timeB[i]] > 0) {
                    infect[timeA[i]] = K;
                    test[timeA[i]] = true;
                    infect[timeB[i]]--;
                }
            }
        }

        for(int i=1; i<=N; i++) {
            if(test[i]) {
                System.out.print(1);
            } else {
                System.out.print(0);
            }
        }

    }
}