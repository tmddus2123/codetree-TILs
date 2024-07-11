import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        for(int i=1; i<=num; i++) {
            int result = i;
            if(i % 3 == 0) {
                bw.write("0 ");
                continue;
            }

            if(String.valueOf(i).indexOf("3") > -1) {
                bw.write("0 ");
                continue;
            } else if(String.valueOf(i).indexOf("6") > -1) {
                bw.write("0 ");
                continue;
            } else if(String.valueOf(i).indexOf("9") > -1) {
                bw.write("0 ");
                continue;
            }

            bw.write(i + " ");
        }

        br.close();
        bw.close();
    }
}