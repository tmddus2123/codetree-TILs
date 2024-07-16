import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int result = calc(n, m);
        bw.write(String.valueOf(result));

        br.close();
        bw.close();
    }

    public static int calc(int n, int m) {
        int count = Math.max(n, m);

        while(count < n*m) {
            if(count % n == 0 && count % m == 0) {
                break;
            }
            count++;
        }
        return count;
    }
}