import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int result = 0;
        for(int i=0; i<5; i++) {
            int num = Integer.parseInt(br.readLine());

            if(num % 2 == 0) {
                result++;
            }
        } 
        bw.write(String.valueOf(result));

        br.close();
        bw.close();
    }
}