import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());


        while(a <= b) {
            bw.write(a + " ");
            if(a % 2 == 1) {
                a *= 2;
            } else {
                a += 3;
            }
        }

        br.close();
        bw.close();
    }
}