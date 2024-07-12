import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int result = recur1(num);

        bw.write(String.valueOf(result));
        br.close();
        bw.close();
    }

    public static int recur1(int num) {
        if(num >= 99) {
            return num;
        }
        return num + recur1(num + 2);
    }
}